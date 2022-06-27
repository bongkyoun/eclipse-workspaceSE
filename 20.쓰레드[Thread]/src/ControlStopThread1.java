
public class ControlStopThread1 extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i =1; i<=100; i++) {
				System.out.println("downloading...["+i+"%]");
				Thread.sleep(50);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ControlStopMethod1 : thread가 JVM으로 return thread end");
		return;
	}
}
