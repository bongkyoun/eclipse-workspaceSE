package nogeneric;

public class Account extends Object implements Comparable<Account>{
	/*
	 * 1.속성[멤버필드]
	 */
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//잔고
	private double iyul;    //이율
	
	
	/*
	 * 2.생성자메쏘드(오버로딩)
	 */
	public Account() {
		
	}
	public Account(int no, String owner, int balance, double iyul) {
		
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 3. 멤버메쏘드[기능](계좌 객체가 가지고있는 기능 )
	 */
	
	/*
	 * 계좌데이타를 대입하는메쏘드
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	/*
	 * 입금
	 */
	public void deposit(int m) {
		this.balance+=m;
	}
	/*
	 * 출금
	 */
	public void withDraw(int m) {
		this.balance-=m;
	}
	/*
	 * 계좌헤더출력메쏘드(?????)
	 */
	public static void headerPrint() {
		System.out.println("--------------------------");
		System.out.printf("%s %5s %4s %4s \n","번호","이름","잔고","이율");
		System.out.println("--------------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	public void print() {
		System.out.printf("%4d %6s %8d %5.2f \n",this.no,this.owner,this.balance,this.iyul);
	}
	//getter,setter

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	@Override
	public int compareTo(Account nextAccount) {
		/*
		System.out.println("------compareTo----------");
		this.print();
		nextAccount.print();
		System.out.println("-------------------------");
		*/
		/*
		 * << 오름차순 >>
		 *  - Collection.sort(accountList) 메쏘드가 이메쏘드를 호출한후 반환된결과를 받아서정렬(교환)한다
		 *  - 현재Account객체와 다음Account객체를 잔고를비교해서 앞의것이 더크다면 교환을해서 뒤로보내야한다.
		 *  - 그래서 현재Account객체의 잔고가 다음Account객체의 잔고보다 크다면 양수1 을 반환해준다.
		 *  - 양수1을 반환받은 Collection.sort()메쏘드는 현재Account객체와 다음Account객체의 주소교환작업을할것이다. 
		 */
		/*
		 * << 내림차순 >>
		 *  - Collection.sort(accountList) 메쏘드가 이메쏘드를 호출한후 반환된결과를 받아서정렬한다
		 *  - 현재Account객체와 다음Account객체를 비교해서 앞의것이 더작다면 교환을해서 뒤로보내야한다.
		 *  - 그래서 현재Account객체의 잔고가 다음Account객체의 잔고보다 작다면 양수1 을 반환해준다.
		 *  - 양수1을 반환받은 Collection.sort()메쏘드는 현재Account객체와 다음Account객체의 주소교환작업을할것이다. 
		 */
		/******잔고 오름차순********/
		if(this.balance - nextAccount.getBalance()>0) {
			return 1;
		}else {
			return -1;
		}
		/**************************/
		
		/******이름 오름차순********
		if(this.owner.compareTo(nextAccount.getOwner())>0) {
			return 1;
		}else {
			return -1;
		}
		*/
	}
	
}













