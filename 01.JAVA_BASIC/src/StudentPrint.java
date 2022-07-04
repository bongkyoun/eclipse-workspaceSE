public class StudentPrint {

	public static void main(String[] args) {
		int number1,kor1,eng1,math1,total1,number2,kor2,eng2,math2,total2;
		String name1, name2;
		double average1,average2;
		/*
		 * 김사람
		 */
		number1 = 1;
		name1 = "김사람";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		/*
		 * 김인간
		 */
		number2 = 2;
		name2 = "김인간";
		kor2 = 44;
		eng2 = 53;
		math2 = 48;
		
		/*
		 * 총점, 평균 대입
		 */
		total1 = kor1+eng1+math1;
		total2 = kor2+eng2+math2;
		average1 = total1 / 3.;
		average2 = total2 / 3.;
		
		/*
		 * 출력포맷
		 */
		System.out.println("--------------학생 성적출력--------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" "+number1 +"   "+ name1 +"   "+kor1+"   "+eng1+"   "+math1+"   "+total1+"  "+(int)average1+"   "+"F"+"    "+"0");
		System.out.println(" "+number2 +"   "+ name2 +"   "+kor2+"   "+eng2+"   "+math2+"   "+total2+"  "+(int)average2+"   "+"F"+"    "+"0");
		System.out.println("-----------------------------------------------");
	}

}