package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student std1 = new Student();
		Student std2 = new Student();
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		
		if(90<=std1.avg1) {
			std1.grade1 = 'A';
		}else if(80<=std1.avg1) {
			std1.grade1 = 'B';
		}else if(70<=std1.avg1) {
			std1.grade1 = 'C';
		}else if(60<=std1.avg1) {
			std1.grade1 = 'D';
		}else if(50<=std1.avg1) {
			std1.grade1 = 'F';
		}
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", std1.no1, std1.name1, std1.kor1, std1.eng1, std1.math1, std1.total1, std1.avg1, std1.grade1, std1.rank1);
		//System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n");
	}

}
