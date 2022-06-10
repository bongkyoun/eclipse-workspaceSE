
public class SynchronizeLowerThread extends Thread {
	private Object monitor;// 모니터객체

	public SynchronizeLowerThread(Object monitor) {
		this.monitor = monitor;
	}

	@Override
	public void run() {

		while (true) {
			/***************** 반드시 1set로 실행해야하는code **************/
			synchronized (monitor) {

				System.out.print("a");
				System.out.print("b");
				System.out.print("c");
				System.out.print("d");
				System.out.print("e");
				System.out.print("f");
				System.out.print("g");
				System.out.print("h");
				System.out.print("i");
				System.out.print("j");
				System.out.print("k");
				System.out.print("l");
				System.out.print("m");
				System.out.print("n");
				System.out.print("o");
				System.out.print("p");
				System.out.print("q");
				System.out.print("r");
				System.out.print("s");
				System.out.print("t");
				System.out.print("u");
				System.out.print("v");
				System.out.print("w");
				System.out.print("x");
				System.out.print("y");
				System.out.print("z");
			}
			/************************************************/

		}

	}
}