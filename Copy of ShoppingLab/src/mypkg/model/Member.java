package mypkg.model;

//Bean(빈) : 1건에 대한 정보를 표현하기 위한 클래스
public class Member {//getter, setter, toString() 모두 구현하세요.
	private String id ;
	private String name ;
	private String password ;
	private int salary ;
	private String hiredate ; //날짜이지만 문자열로 처리
	private String gender ;
	/*private String hobby ;*/
	private String[] hobby ;
	private String job ;
	private String zipcode ;
	private String address1 ;
	private String address2 ;
	private int mpoint ; //적립 포인트
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {  //체크박스에 2개이상 할 수 있기 때문에 ,  마지막 콤마를 빼기위해서 서브스트링 처리를 해준다.
		String hobbies = "" ;
		if( this.hobby != null ){
			for(int i = 0 ; i < hobby.length ; i++){
				hobbies += hobby[i] + "," ;
			}
		}
		if( hobbies.equals("") == false ){
			hobbies = hobbies.substring(0, hobbies.length() - 1) ;
		}
		return hobbies ;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getMpoint() {
		return mpoint;
	}
	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password
				+ ", salary=" + salary + ", hiredate=" + hiredate + ", gender="
				+ gender + ", hobby=" + hobby + ", job=" + job + ", zipcode="
				+ zipcode + ", address1=" + address1 + ", address2=" + address2
				+ ", mpoint=" + mpoint + "]";
	}
	
	
	
}







