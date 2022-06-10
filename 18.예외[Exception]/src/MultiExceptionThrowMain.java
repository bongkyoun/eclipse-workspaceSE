import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionThrowMain {
	/*
	public static void main(String[] args) throws RuntimeException, ClassNotFoundException, SQLException {
		System.out.println("stmt1");
	
		
		//예외발생예상코드
		// Unhandled exception type ClassNotFoundException
		Class.forName("BClass");
		System.out.println("stmt2");
		
		//예외발생예상코드
		//NullPointerException
		 
		String str = "";
		System.out.println(str.length());
		System.out.println("stmt3");
		
		//예외발생예상코드
		//Unhandled exception type SQLException
		DriverManager.getConnection("");
		System.out.println("stmt4");
	}
	*/
	public static void main(String[] args) throws Exception {
		System.out.println("stmt1");
		/*
		 예외발생예상코드
		 Unhandled exception type ClassNotFoundException
		 */
		Class.forName("BClass");
		System.out.println("stmt2");
		/*
		 예외발생예상코드
		 NullPointerException
		 */
		String str = "";
		System.out.println(str.length());
		System.out.println("stmt3");
		/*
		예외발생예상코드
		Unhandled exception type SQLException
		 */
		DriverManager.getConnection("");
		System.out.println("stmt4");
	}
}
