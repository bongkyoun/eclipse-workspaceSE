import java.io.IOException;

public class FirstSecondExceptionThrowMain {

	public static void main(String[] args) throws IOException,NullPointerException{
		System.out.println("1.main흐름 start");
		First first = new First();
		System.out.println("2.main 흐름 first.method1()호출 전");
		first.method1();
		System.out.println("3.main 흐름 first.method1()호출 후 JVM 반환");
		
		return;
	}
	
}
