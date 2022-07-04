package backup.수정완료;




public class UserService {
	private UserInfoDao userInfoDao;
	public UserService() {
		userInfoDao = new UserInfoDao();
	}
	/*
	 * 회원가입
	 * 아이디 중복 시 메세지 출력
	 */
	public boolean addUserInfo(UserInfo newUserInfo) throws Exception{
		System.out.println("2.MemberService ");
		boolean isSuccess=false;
		/*
		 * 아이디존재여부체크
		 *    - 존재하면 메세지
		 *    - 존재안하면 가입
		 */
		UserInfo findMember= userInfoDao.selectById(newUserInfo.getU_id());
		if(findMember==null) {
			int rowCount = userInfoDao.insertUserInfo(newUserInfo);
			isSuccess=true;
		}else {
			isSuccess=false;
		}
		
		return isSuccess;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
