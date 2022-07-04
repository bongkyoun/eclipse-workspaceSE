package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {
	
	public static void main(String[] args) throws Exception{
		/*
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String selectSql = "select * from dept";
		*/
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper02";
		String password="jdeveloper02";
		String selectSql="select * from dept";
		
		/*
		 * 1. Driver(Oracle) Class loading
		 * 		- A. Driver 클래스 객체 생성
		 * 		- B. DriverManager 객체에 등록
		 */
		Class.forName(driverClass);
		System.out.println("1. Driver class loading");
		
		/*
		 * 2. Connection 객체 생성
		 * 		- DB Server 연결 객체
		 */
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. Connection 객체 생성(DBServer 연결) : " + con);
		
		/*
		 * 3. Statement 객체 생성
		 * 		- SQL문 전송 객체
		 */
		Statement stmt = con.createStatement();
		System.out.println("3. Statement 객체 생성(SQL문 전송객체) : " + stmt);
		
		/*
		 * 4. SQL 전송(select)
		 */
		ResultSet rs = stmt.executeQuery(selectSql);
		
		/*
		 * 5. Resultset 얻기
		 * 		- 결과 얻기
		---------------------------------
		DEPTNO    DNAME        	LOC
		---------------------------------
		BEFORE FIRST 영역
		10	 	ACCOUNTING		NEW YORK
		20		RESEARCH		DALLAS
		30		SALES			CHICAGO
		40		OPERATIONS		BOSTON
		AFTER LAST  영역   
		 */
		System.out.println("4,5.ResultSet(select문실행결과집합)얻기 : "+rs);
		System.out.println("----------------------------------");
		System.out.println("DEPTNO      DNAME        LOC");
		System.out.println("----------------------------------");
		
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		System.out.println("----------------------------------");
		/*
		 *  6. 연결 객체 해지(resource 해지) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6. 연결객체 닫기(close)");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
