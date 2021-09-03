package oop.multi5_1;

public abstract class Grocery {
	protected String name;
	protected String expire;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpire() {
		return expire;
	}
	public void setExpire(String expire) {
		this.expire = expire;
	}
	public Grocery(String name, String expire) {
		this.setName(name);
		this.setExpire(expire);
	}
	
	
}
