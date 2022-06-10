
public class IfNested {

	public static void main(String[] args) {

		

		/*
		 * 평점산출(A,B,C,D,F)
		 */
		int kor = 100;
		
		/* 
		 * - 유효한 점수인지 체크. 
		 * - 점수는 0~100사이의 정수이다.
		 */
		char hakjum = 'X';

		if (kor >= 90) {
			hakjum = 'A';
		} else {
			if (kor >= 80) {
				hakjum = 'B';
			} else {
				if (kor >= 70) {
					hakjum = 'C';
				} else {
					if (kor >= 60) {
						hakjum = 'D';
					} else {
						hakjum = 'F';
					}
				}
			}
		}

		System.out.printf("1.학점은 %c  입니다.\n", hakjum);

		
	}

}
