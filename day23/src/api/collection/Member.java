package api.collection;

import java.util.Objects;

public class Member {

	private String ID;
	private String password;
	private String nickname;
	public Member(String ID, String password, String nickname) {
		super();
		this.ID = ID;
		this.password = password;
		this.nickname = nickname;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Member(String ID, String password) {
		super();
		this.ID = ID;
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(password, other.password);
	}

}
