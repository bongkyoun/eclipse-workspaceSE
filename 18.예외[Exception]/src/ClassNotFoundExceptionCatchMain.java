import javax.swing.JOptionPane;

public class ClassNotFoundExceptionCatchMain {
	/*
	 * 메쏘드블록(main)에서 예외발생가능성이있는 코드가존재하면 반드시
	 * 메쏘드의 정의 맨뒤에 throws 구문을기술하여야한다.
	 * 기술하지 않으면 컴파일에러 발생 
	 */
	public static void main(String[] args){
		/*
		 * ClassNotFoundException
		 * Unhandled exception type ClassNotFoundException
		 */
		System.out.println("stmt0");
		try {
			System.out.println("stmt1");
			Class.forName("CClass");
			/*
			 * 1.예외발생시 ClassNotFoundException객체생성 
			 *   ClassNotFoundException객체가 던져짐
			 * 2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ClassNotFoundException객체대입)  
			 * 3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			System.out.println("stmt2");
		}catch (ClassNotFoundException e) {
			/*
			 * catch block 예외가 발생 시 실행되는 블록
			 */
			System.out.println("catch block start");
			System.out.println("ClassNotFoundException-->"+e.getMessage());
			System.out.println("catch block end");
			JOptionPane.showConfirmDialog(null,"고객님 죄송합니다람쥐."+e.getMessage());
			/*
			 * 사용자에게 메세지를 보여준다
			 * 			 */
			/*
			 * 쓰레드 블록킹(대기)
			 */
		}
		System.out.println("stmt3");
	}

}