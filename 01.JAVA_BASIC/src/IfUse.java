
public class IfUse {

	public static void main(String[] args) {
		int no1=55;
		
		/*
		 * 짝수홀수판별
		 */
		if(no1%2==0) {
			/*
			System.out.print(no1+" 은 짝수입니다.");
			System.out.println();
			*/
			System.out.printf("%d 은 %s 입니다.\n",no1,"짝수");
		}else {
			/*
			System.out.print(no1+" 은 홀수입니다.");
			System.out.println();
			*/
			System.out.printf("%d 는 %s 입니다.\n",no1,"홀수");
		}
		/*
		 * 4의 배수 판별
		 */
		int no2=4000;
		if(no2%4==0) {
			System.out.printf("%d 는 4의배수\n",no2);
		}else {
			System.out.printf("%d 는 4의배수아님\n",no2);
		}
		/*
		 *점수의 유효성체크
		 */
		int kor=-89;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d 는 유효한 점수입니다.\n",kor);
		}else {
			System.out.printf("%d 는 유효한 점수 아닙니다.\n",kor);
		}
		/*
		 * 윤년여부출력
		 */
		int year=2022;
		String msg="";
		if( (year%4==0 && year%100!=0) || year%400==0 ) {
			msg="윤년";
		}else {
			msg="평년";
		}
		System.out.printf("%d 는 %s 입니다.\n",year,msg);
		
		/*
		 *공배수
		 */
		int no3=45;
		if(no3%3==0 && no3%4==0) {
			System.out.printf("%-10d 는 3과4의\t공배수입니다\n",no3);
		}else {
			System.out.printf("%-10d 는 3과4의\t공배수가아닙니다\n",no3);
		}
		
		/*
		 * 문자판단
		 */
		char c='X';
		
		if( c>='A' && c <= 'Z' ) {
			System.out.printf("%c 는 알파벳대문자입니다.\n",c);
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.println(c+" 는 숫자형태 문자입니다.");
			
		}
		
		c='김';
		if(c>='가' && c<='힣') {
			System.out.println(c+" 는(은) 한글입니다.");
		}
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter='*';
		
		if((idFirstLetter>='A' && idFirstLetter<='Z') 
			||(idFirstLetter>='a'&& idFirstLetter<='z')) {
			System.out.println(idFirstLetter+" 는 아이디첫글자로서 유효합니다.");
		}else {
			System.out.println(idFirstLetter+" 는 아이디첫글자로서 유효하지않습니다.");
		}
		
		
	}//end main

}//end class









