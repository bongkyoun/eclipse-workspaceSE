/*
 객체주소변수의 형변환(type casting)
   1. 상속관계에있는 클래스(타입) 사이에서만 가능하다.
      ex> 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환
       - 자동으로 이루어진다(묵시적)
       		Child c = new Child();
       		Parent p = c; 
       		
       		Parent p=new Child();
   
   3. 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       	Parent p=new Parent();
       	Child cccc = p;(X)
	    public class Parent{}
	    public class Child extends Parent{}
 */
class Parent extends Object{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		System.out.println("Parent.method4()");
	}
	

}
class Child extends Parent{
	public void method4() {
		System.out.println("Child.method4()-->Parent.method4()를 재정의[오버라이딩]");
	}
	public void method5() {
		System.out.println("Child.method5()");
	}
}


public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("-----------<< Child >>----------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		/*
		 2. 자식클래스타입 객체의주소를 부모클래스타입 객체의 주소로 형변환
       		- 자동으로 이루어진다(묵시적)
		 */
		System.out.println("-----------<< Child -->Parent >>----------");
		Parent p1 = c1;
		if(p1==c1) {
			System.out.println(p1+"=="+c1+"[p1과 c1의 주소가 동일");
		}
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
		/*
		p1.method5();
		 */
		/*
		 3. 부모클래스타입 객체의주소를 자식클래스타입 객체의 주소로 형변환
       		- 원칙적으로는 불가능하다
		 */
		Parent p2=new Parent ();
		/*
		 << Type mismatch : cannot convert from Parent to Child >> //에러코드
		Child c2=(Child)p2;		//error
		 */
			/*
			 - 부모의 탈을 쓴 자식객체는 가능하다.
			 */
		/*
		Child c3 = new Child();
		Parent p3=c3;
		*/
		System.out.println("---Child 객체 Parent 타입 변수로 호출--");
		Parent p3=new Child();
		p3.method1();
		p3.method2();
		p3.method3();
		p3.method4();
		/*
		 p4.method4();		/호출 안됨
		 */
		Child c3=(Child)p3;
		System.out.println("--Child 객체 Child 타입 변수로 호출");
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
		
		
		
		
		
		
		
		
		
		
	}

}







