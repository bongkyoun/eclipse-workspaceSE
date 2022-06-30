package 김봉균화이팅;

import java.sql.Date;

/*
U_NO	NUMBER(10,0)	
U_ID	VARCHAR2(10 BYTE)
U_PW	VARCHAR2(20 BYTE)
U_NAME	VARCHAR2(50 BYTE)
U_EMAIL	VARCHAR2(40 BYTE)
U_PHONE	NUMBER(11,0)
U_ADDRESS	VARCHAR2(100 BYTE)
U_BIRTH	NUMBER(8,0)
U_JOB	VARCHAR2(20 BYTE)
U_JOINDATE	DATE
 */
public class UserInfo {
	private int u_no;
	private String u_id;
	private String u_pw;
	private String u_name;
	private String u_email;
	private int u_phone;
	private String u_address;
	private int u_birth;
	private String u_job;
	private Date u_joindate;

	public UserInfo(int u_no, String u_id, String u_pw, String u_name, String u_email, int u_phone, String u_address,
			int u_birth, String u_job, Date u_joindate) {
		super();
		this.u_no = u_no;
		this.u_id = u_id;
		this.u_pw = u_pw;
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.u_birth = u_birth;
		this.u_job = u_job;
		this.u_joindate = u_joindate;
	}

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_pw() {
		return u_pw;
	}

	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public int getU_phone() {
		return u_phone;
	}

	public void setU_phone(int u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public int getU_birth() {
		return u_birth;
	}

	public void setU_birth(int u_birth) {
		this.u_birth = u_birth;
	}

	public String getU_job() {
		return u_job;
	}

	public void setU_job(String u_job) {
		this.u_job = u_job;
	}

	public Date getU_joindate() {
		return u_joindate;
	}

	public void setU_joindate(Date u_joindate) {
		this.u_joindate = u_joindate;
	}

	@Override
	public String toString() {
		return "UserInfo [u_no=" + u_no + ", u_id=" + u_id + ", u_pw=" + u_pw + ", u_name=" + u_name + ", u_email="
				+ u_email + ", u_phone=" + u_phone + ", u_address=" + u_address + ", u_birth=" + u_birth + ", u_job="
				+ u_job + ", u_joindate=" + u_joindate + "]";
	}
	
}