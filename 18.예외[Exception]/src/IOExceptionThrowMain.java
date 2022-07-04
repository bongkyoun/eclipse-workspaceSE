import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class IOExceptionThrowMain {

	public static void main(String[] args) throws IOException{
		/*
		 * IOException
		 */
		System.out.println("stmt1");
		/*
		자바컴파일러는 일반Exception발생 예상코드에 
		Exception처리를 하지않으면 컴파일에러를 발생시킴
			- Unhandled exception type IOException  
		 */
		
		
		
		Socket socket=new Socket("www.sadfsa.com",80);
		/*
		 * 1.예외발생시 IOException(UnknownHostException)객체생성후
		 *   예외발생코드가 속해있는 메쏘드를 호출한곳으로  IOException(UnknownHostException)객체를던진다.
		 * 2.현재실행흐름을 중지하고
		 *   예외발생코드가 속해있는 메쏘드를 호출한곳으로  실행흐름이이동
		 */
		System.out.println(socket);
		System.out.println("stmt2");
	}

}