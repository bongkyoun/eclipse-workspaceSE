package lang;

public class ObjectCompareMain {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		if(o1!=o2) {
			System.out.println("o1과 o2 객체 주소는 다르다.");
		}
		if(o1==o3) {
			System.out.println("o1과 o2의 객체 주소는 같다.");
		}
		/*
		 public boolean equals(Object obj)
		 	-주소가 같은지 비교
		 */
		if(!o1.equals(o2)) {
			System.out.println("o1과 o2의 주소는 다르다.[!equals]");
		}
		if(o1.equals(o3)) {
			System.out.println("o1과 o3의 주소는 같다[equals]");
		}
	}

}
