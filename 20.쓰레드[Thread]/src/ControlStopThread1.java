
public class ControlStopThread1 extends Thread{

	@Override
	public void run() {
		try {
			for(int i=1;i<=100;i++) {
				System.out.println("downlaoding...["+i+" %]");
				Thread.sleep(10);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ControlStopThread1:thread가 jvm으로 return thread end");
		return;
	}
	
}
