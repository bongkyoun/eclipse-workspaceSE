
public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field;
	
	/*
	 * 인스턴스 멤버 메쏘드
	 */
	public void outer_member_method() {
		System.out.println("outerClass.memer_method()");
	}
	/*************OuterClass에서 InnerClass 객체 생성[사용]****************/
	public void outer_inner_class_use() {
		//OuterClass.InnerClass ic = new OuterClass.InnerClass(); 
		//OuterClass내에 있는 클래스라 생략 가능
		InnerClass ic = new InnerClass();
		ic.inner_member_field = 84598;
		ic.inner_member_method();
	}
	
	
	/*
	 * 인스턴스 멤버 클래스
	 * 	- 내부클래스에서 외부클래스의 멤버 접근을 손쉽세 하기 위해 작성
	 * 
	 */
	public class InnerClass {
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/***********내부 클래스에서 외부 클래스의 멤버접근*****************/
		public void inner_outer_acess() {
			/*
			InnerClass.this.inner_member_field = 1111;
			OuterClass.this.outer_member_field = 9999;
	
			InnerClass.this.inner_member_method();
			OuterClass.this.outer_member_method();
			*/
			inner_member_field = 1111;
			outer_member_field = 9999;
			inner_member_method();
			outer_member_method();
		}
		
	}
	
	
	
	
	
}
