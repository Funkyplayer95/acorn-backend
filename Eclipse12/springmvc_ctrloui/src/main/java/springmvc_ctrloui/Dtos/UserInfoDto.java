package springmvc_ctrloui.Dtos;

public class UserInfoDto {

	private String userid;
	private String userpassword;
	private int salary;
	
	
	public UserInfoDto() {
	}
	public UserInfoDto(String userid, String userpassword, int salary) {
		this.userid = userid;
		this.userpassword = userpassword;
		this.salary = salary;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Id : " + getUserid() + ", Password : " + getUserpassword() + ", SALARY : " + getSalary();
	}
}
