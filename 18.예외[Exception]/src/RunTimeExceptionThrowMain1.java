
public class RunTimeExceptionThrowMain1 {
	/*
	 * 모든 메쏘드는 throws RuntimeException 구문이 생략 되어있다.
	 * 	- 이 메쏘드에서는 RuntimeException의 자식 Exception들이 발생할 수 있다.
	 */
	public static void main(String[] args)/*throws RuntimeException*/{
		/*
		 * NullPointerException 
		 */
		System.out.println("stmt1");
		String str=null;
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드
		 */
		int length=str.length();
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 현재실행흐름은 실행을멈추고 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		 */
		System.out.println(length);
		System.out.println("stmt3");

	}

}