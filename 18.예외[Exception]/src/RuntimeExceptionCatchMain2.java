
public class RuntimeExceptionCatchMain2 {

	public static void main(String[] args)/*throws RuntimeException*/ {
		/*
		 * ArrayIndexOutOfBoundsException
		 */
		int[] intArray=null;
		try {
			System.out.println("stmt1");
			intArray=new int[10];
			/*
			 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 현재실행흐름은 실행을멈추고 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
			 */
			System.out.println("stmt2");
			intArray[10]=9999;
			System.out.println("stmt3");
		}catch(IndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("-----catch start--------");
			String msg=e.getMessage();
			System.out.println("IndexOutOfBoundsException==>"+msg+" 번 index 없다~~");
			intArray[9]=9999;
			System.out.println(intArray[9]);
			System.out.println("-----catch end--------");
		} 
		System.out.println("main return");
		return;
	}

}
