
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members = new AcademyMember[7];
		/*
		 * AcadeemyMember타입으로 자동형변화
		 */
		members[0]=new AcademyStudent(1,"KIM","JAVA");
		members[1]=new AcademyStudent(2,"LIM","DESIGN");
		members[2]=new AcademyStudent(3,"MIM","IOS");
		
		members[3]=new AcademyGangsa(4,"OIM","ANDROID");
		members[4]=new AcademyGangsa(5,"PIM","JAVA");
		
		members[5]=new AcademyStaff(6,"QIM","ACCOUNTING");
		members[6]=new AcademyStaff(7,"RIM","MARKETING");
		System.out.println("----AcademyMember 전체 출력-----");
		for ( int i = 0; i < members.length; i++) {
			/*
			 * AcademyStudent, AcademyStaff, AcademyGangsa에서 재정의된 print메쏘드 호출
			 */
			members[i].print();
		}
	}

}
