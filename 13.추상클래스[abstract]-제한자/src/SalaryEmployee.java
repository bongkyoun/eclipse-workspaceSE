public class SalaryEmployee extends Employee {
	private int annualSalary;// 사원 연봉

	public SalaryEmployee() {

	}

	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}

	@Override
	public void calculatePay() {
		int tempPay = this.annualSalary/12;
		this.setPay(tempPay);
	}

	public void print() {
		super.print();
		System.out.println(this.annualSalary);
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;

	}
}