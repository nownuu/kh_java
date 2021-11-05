package web08.beans;

import java.sql.Date;

public class ProductDto2 {

	private int no;
	private String name;
	private String type;
	private int price;
	private Date made;
	private Date expire;
	public ProductDto2() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMade() {
		return made;
	}
	public void setMade(Date made) {
		this.made = made;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}
	//신규 추가 메소드
	@SuppressWarnings("deprecation")
	public void setMade(String made) {
		int madeYear = Integer.parseInt(made.substring(0, 4));
		int madeMonth = Integer.parseInt(made.substring(5, 7));
		int madeDate = Integer.parseInt(made.substring(8));
		this.made = new Date(madeYear-1900, madeMonth-1, madeDate);
	}

	@SuppressWarnings("deprecation")
	public void setExpire(String expire) {
		int expireYear = Integer.parseInt(expire.substring(0, 4));
		int expireMonth = Integer.parseInt(expire.substring(5, 7));
		int expireDate = Integer.parseInt(expire.substring(8));
		this.expire = new Date(expireYear-1900, expireMonth-1, expireDate);
	}
}
