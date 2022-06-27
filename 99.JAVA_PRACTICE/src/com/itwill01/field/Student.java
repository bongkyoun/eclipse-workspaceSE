package com.itwill01.field;

/*
 * 성적처리를위해 필요한 학생객체를 만들기위한클래스정의(틀,타입)
 */
public class Student {
	/*
	 * 1.멤버필드(변수)선언:속성
	 *   -번호,이름,국어,영어,수학,총점,평균,평점(A,B,C,D,F),석차
	 *    를 저장할 멤버필드(변수) 선언
	 */
	int no1 = 1;
	String name1 = "김덕배";
	int kor1 = 42;
	int eng1 = 56;
	int math1 = 78;
	int total1 = kor1+eng1+math1;
	double avg1 = total1/3;
	char grade1;
	int rank1 = 1;
	
	
	
	int no2 = 2;
	String name2 = "김춘식";
	int kor2 = 45;
	int eng2 = 53;
	int math2 = 76;
	int total2 = kor2+eng2+math2;
	double avg2 = total2/3;
}
