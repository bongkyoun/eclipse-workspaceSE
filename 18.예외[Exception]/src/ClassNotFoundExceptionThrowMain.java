
public class ClassNotFoundExceptionThrowMain {
	/*
	 * 메쏘드블록(main)에서 예외발생가능성이있는 코드가존재하면 반드시
	 * 메쏘드의 정의 맨뒤에 throws 구문을기술하여야한다.
	 * 기술하지 않으면 컴파일에러 발생 
	 */
	public static void main(String[] args) throws ClassNotFoundException{
		/*
		 * ClassNotFoundException
		 */
		System.out.println("stmt1");
		Class.forName("CClass");
		/*
		 1. 예외상황발생하면 JVM이 예외상황을 감지하고 ClassNotFoundException 객체생성
		 2. 실행중인 실행흐름은 실행을멈추고 예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 
		 	호출한곳으로 이동
		 3. JVM은 생성한 ClassNotFoundException객체를 예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 
		 	호출한곳으로 던진다.(throw)
		 4. JVM은 던져진 ClassNotFoundException객체의메세지출력한후 쓰레드종료(shut down)
		 */
		System.out.println("stmt2");
	}

}
