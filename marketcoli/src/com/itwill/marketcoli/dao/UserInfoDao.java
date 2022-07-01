package com.itwill.marketcoli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.marketcoli.common.DataSource;
import com.itwill.marketcoli.dto.UserInfo;

public class UserInfoDao {
	private DataSource dataSource;
	
	public UserInfoDao() {
		dataSource = new DataSource();
	}
	
	public int insertUser(UserInfo user) throws Exception {
		Connection con = dataSource.getConnection();
		// prepared는 일반statement에 비해 준비된 pipe!
		PreparedStatement pstmt = con.prepareStatement(UserInfoSQL.USER_INSERT);

		// (참고)
		//pstmt.setString(1, user.getU_name());
		/*********** 내용 입력 필요합니다 *********************/

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;
		
	}
	
	// pk를 통해 삭제
	public int deleteUser(int u_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserInfoSQL.USER_DELETE);

		pstmt.setInt(1, u_no);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;
	} 
	
		public int updateUser(UserInfo user) throws Exception {
			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(UserInfoSQL.USER_UPDATE);
			/*	
					private int u_no;			//회원번호 - pk
					private String u_id;		//아이디 - 변경불가
					private String u_pw;		//비밀번호
					private String u_name;		//이름
					private String u_email;		//이메일
					private int u_phone;		//휴대폰번호
					private String u_address;	//주소
					private int u_birth;		//생년월일
					private String u_job;		//직업
					private Date u_joindate;	//java.util.Date - 변경불가
			*/
			pstmt.setString(1, user.getU_pw());
			pstmt.setString(2, user.getU_name());
			pstmt.setString(3, user.getU_email());
			pstmt.setInt(4, user.getU_phone());
			pstmt.setString(5, user.getU_address());
			pstmt.setInt(6, user.getU_birth());
			pstmt.setString(7, user.getU_job());

			int rowCount = pstmt.executeUpdate();

			pstmt.close();
			con.close();

			return rowCount;
			
		}
		
		public UserInfo selectByNo(int u_no) throws Exception {
			
			UserInfo findUser = null;

			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(UserInfoSQL.USER_SELECT_BY_NO);
			pstmt.setInt(1, u_no);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				/*	
					private int u_no;			//회원번호 - pk
					private String u_id;		//아이디 - 변경불가
					private String u_pw;		//비밀번호
					private String u_name;		//이름
					private String u_email;		//이메일
					private int u_phone;		//휴대폰번호
					private String u_address;	//주소
					private int u_birth;		//생년월일
					private String u_job;		//직업
					private Date u_joindate;	//java.util.Date - 변경불가
				 */

				findUser = new UserInfo(rs.getInt("u_no"),
										rs.getString("u_id"),
										rs.getString("u_pw"),
										rs.getString("u_name"),
										rs.getString("u_email"),
										rs.getInt("u_phone"),
										rs.getString("u_address"),
										rs.getInt("u_birth"),
										rs.getString("u_job"),
										rs.getDate("u_joindate"));/*sql.date는 상위(util.date)로 자동캐스팅*/
				
			}
			rs.close();
			pstmt.close(); // 이 pstmt는 이미 sql문을 가지고 있으므로, 또
			con.close();
			return findUser;
			
			
		}
		
		//관리자가 서비스에서 사용하게 될 부분
		public List<UserInfo> selectAll() throws Exception { 
			
			//String selectAllSql = "select * from user";
			List<UserInfo> userList = new ArrayList<UserInfo>();

			Connection con = this.dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(UserInfoSQL.USER_SELECT_ALL);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				/*	
					private int u_no;			//회원번호 - pk
					private String u_id;		//아이디 - 변경불가
					private String u_pw;		//비밀번호
					private String u_name;		//이름
					private String u_email;		//이메일
					private int u_phone;		//휴대폰번호
					private String u_address;	//주소
					private int u_birth;		//생년월일
					private String u_job;		//직업
					private Date u_joindate;	//java.util.Date - 변경불가
				 */

				userList.add(new UserInfo(rs.getInt("u_no"),
						rs.getString("u_id"),
						rs.getString("u_pw"),
						rs.getString("u_name"),
						rs.getString("u_email"),
						rs.getInt("u_phone"),
						rs.getString("u_address"),
						rs.getInt("u_birth"),
						rs.getString("u_job"),
						rs.getDate("u_joindate")/*sql.date는 상위(util.date)로 자동캐스팅*/
						));

			}
			rs.close();
			pstmt.close();
			con.close();

			return userList;
			
		}
		
}
