package jdbc.beans;

import java.sql.Date;

public class MemberDto {
	private String id;
	private String password;
	private String nick;
	private Date birth;
	private String email;
	private String phone;
	private Date join;
	private int point;
	private String grade;
	public Date getJoin() {
		return join;
	}
	public void setJoin(Date join) {
		this.join = join;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public MemberDto() {
		super();
	}
	@SuppressWarnings("deprecation")
	public void setBirth(String birth) {
		int birthYear = Integer.parseInt(birth.substring(0, 4));
		int birthMonth = Integer.parseInt(birth.substring(5, 7));
		int birthDate = Integer.parseInt(birth.substring(8));
		this.birth = new Date(birthYear-1900, birthMonth-1, birthDate);
	}
}
