package oop.multi5_1;

public class SafeBox {
private Brokenable value;
	
	public void setValue(Brokenable value) {
		this.value = value;
	}
	
	public Brokenable getValue() {
		return value;
	}
}
