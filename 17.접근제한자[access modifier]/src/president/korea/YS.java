package president.korea;

import president.america.Trump;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	public void access() {
		/****************YS와 같은패키지의클래스접근*************/
		DJ dj=new DJ();
		dj.member1=1;   
		dj.member2=2;   
		dj.member3=3;
		//dj.member4=4;
		dj.method1();
		dj.method2();
		dj.method3();
		//dj.method4();
		/****************YS와 다른패키지의클래스접근*************/
		Trump trump=new Trump();
		trump.member1=1;   //public
		//trump.member2=2; //protected
		//trump.member3=3; //(default)
		//trump.member4=4; //private
		
		trump.method1();   //public 
		//trump.method2(); //protected
		//trump.method3(); //(default)
		//trump.method4(); //private
		
	}
	
}





















