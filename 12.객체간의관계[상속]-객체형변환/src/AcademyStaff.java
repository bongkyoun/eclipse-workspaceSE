public class AcademyStaff extends AcademyMember {
	public String depart;//부서
	public AcademyStaff() {
		// TODO Auto-generated constructor stub
	}
	public AcademyStaff(int no,String name,String depart) {
		super(no, name);
		this.depart = depart;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(this.depart);
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
