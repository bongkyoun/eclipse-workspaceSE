
/* 산술연산
 * 자동정렬: ctrl + shift + f
 */
public class OperatorAritmatic {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = 0;
		result = a + b;
		System.out.println(result);
		result = a - b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		
		result = a / b;//?????
		System.out.println("1/2 --> "+result);
		double dresult = a/b ;
		System.out.println("1/2 --> "+dresult);
		dresult = (double)a / b ;
		System.out.println("(double)1/2 --> "+dresult);
		dresult = 1.0/2;
		System.out.println("1/2 --> "+dresult);
		
		/*
		 * 나머지연산자
		 * %
		 */
		result=a%b;
		System.out.println(result);

		int year = 2022;
		result=year%4;//0,1,2,3
		System.out.println(result);
		result=year%100;//0~99
		System.out.println(result);
		result=year%400;//0~399
		System.out.println(result);
		
		int no=16;
		result = no%4;
		System.out.println("result 변수의 값이 0이면 4의 배수"+result);
		
		System.out.println("-------문자연산--------");
		char ca='A';
		char cz='Z';
		int num0fAlphabet = cz-ca+1;
		System.out.println("알파벳대문자수:"+num0fAlphabet);
		
		char c='A';
		System.out.println(c);
		System.out.println((int)c);
		c = 'A' + 1;
		System.out.println(c);
		c = 'A' + 2;		
		System.out.println(c);
		
		int num0fHangul = '힝'-'가' +1;
		System.out.println("한글의 글자수:"+num0fHangul);
		
		char han='가';
		System.out.println(han);
		System.out.println((int)han);
		han='가'+1;
		System.out.println(han);
		han = '힣'-1;
		System.out.println(han);
		
		
		/*
		 * 비트연산자
		 * << , >>
		 * 
		 * int d = 1         ==>00000000:00000000:00000000:00000001
		 * result = d << 1;  ==>00000000:00000000:00000000:00000010
		 * result = d << 2;  ==>00000000:00000000:00000000:00000100
		 * result = d << 3;  ==>00000000:00000000:00000000:00001000
		 * result = d << 4;  ==>00000000:00000000:00000000:00010000
		 * 
		 */
		
		int d=1;
		System.out.println(d);
		result = d << 1;
		System.out.println(result);
		result = d << 2;
		System.out.println(result);
		result = d << 3;
		System.out.println(result);
		result = d << 4;
		System.out.println(result);
		
		/*
		 * int d = 128;       ==>00000000:00000000:00000000:10000000
		 * result = d >> 1;   ==>00000000:00000000:00000000:01000000
		 * result = d >> 2;   ==>00000000:00000000:00000000:00100000
		 * result = d >> 3;   ==>00000000:00000000:00000000:00010000
		 * result = d >> 4;   ==>00000000:00000000:00000000:00001000
		 */
		d=128;
		System.out.println(d);
		result = d>> 1;
		System.out.println(result);
		result = d>> 2;
		System.out.println(result);
		result = d>> 3;
		System.out.println(result);
		result = d>> 4;
		System.out.println(result);
		
		
		
		
		
		
		
	}
}
