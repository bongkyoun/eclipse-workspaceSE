
public class RunTimeExceptionThrowMain3 {

	public static void main(String[] args)/* throws RuntimeException*/{
		/*
		 * ClassCastException
		 */
		System.out.println("stmt1");
		Object o1 = new Object();
		System.out.println("stmt2");
		Object o2=new String("문자열");
		System.out.println("stmt3");
		String str1 =(String)o1;
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 현재실행흐름은 실행을멈추고 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		 */
		String str2 =(String)o2;
		System.out.println("stmt4");
	
	
	}

}
