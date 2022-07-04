import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionCatchMain {
	/*****************************case1************************
	public static void main(String[] args)  {
		System.out.println("stmt0");
		try {
			System.out.println("stmt1");
			
			//예외발생예상코드
			//Unhandled exception type ClassNotFoundException
			Class.forName("BClass");
			System.out.println("stmt2");
			// 예외발생예상코드
			// RunTimeException
			//   - NullPointerException
			String str =null;
			System.out.println(str.length());
			System.out.println("stmt3");
			//예외발생예상코드
			//Unhandled exception type SQLException
			DriverManager.getConnection("");
			System.out.println("stmt4");
		}catch(ClassNotFoundException e) {
			System.out.println("catch ClassNotFoundException:"+e.getMessage());
		}catch (SQLException e) {
			System.out.println("catch SQLException:"+e.getMessage());
		}catch (Exception e) {
			System.out.println("catch ClassNotFoundException,SQLException을제외한 모든예외:"+e.getMessage());
		}
		System.out.println("stmt5");
	}
	*/
	/*****************************case2************************/
	public static void main(String[] args)  {
		System.out.println("stmt0");
		try {
			System.out.println("stmt1");
			
			//예외발생예상코드
			//Unhandled exception type ClassNotFoundException
			Class.forName("CClass");
			System.out.println("stmt2");
			// 예외발생예상코드
			// RunTimeException
			//   - NullPointerException
			String str =null;
			System.out.println(str.length());
			System.out.println("stmt3");
			//예외발생예상코드
			//Unhandled exception type SQLException
			DriverManager.getConnection("");
			System.out.println("stmt4");
		}catch(Exception e) {
			System.out.println("모든예외를 한곳에서 처리-->msg:"+e.getMessage());
			System.out.println(">>고갱님 죄송합니다.~~~");
		}
		System.out.println("stmt5");
	}
}