
public class ConCurrentBeePrintMain {

	public static void main(String[] args) {
		System.out.println("1 .main thread start");
		System.out.println("2 .main thread ConCurrentBeep객체생성");
		ConCurrentBeep beepThread=
				new ConCurrentBeep();
		System.out.println("3 .main thread ConCurrentBeep객체.start()메쏘드호출");
		beepThread.start();
		System.out.println("4 .main thread ConCurrentPrint객체생성");
		ConCurrentPrint printThread=
				new ConCurrentPrint();
		System.out.println("5 .main thread ConCurrentPrint객체.start()메쏘드호출");
		printThread.start();
		System.out.println("99.main thread end return");
	}

}
