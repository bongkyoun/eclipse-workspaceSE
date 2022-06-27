
public class AbstractClassChild extends AbstractClass{
	/*
	 public void method1() {
		System.out.println("난 구상(Concrete) 메쏘드");
	}
	 */
	
	
	@Override
	public void method2() {
		System.out.println("AbstractClassChild에서 AbstractClass의 추상 메쏘드method2 재정의[implement(구현)]");
	}
}
