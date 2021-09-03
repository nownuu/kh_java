package oop.multi5_1;

public class ElectronicBox {
	// 전자제품 1개를 보관할 수 있는 상자
	private Electronic value;
	
	public void setValue(Electronic value) {
		this.value = value;
	}
	
	public Electronic getValue() {
		return this.value;
	}
	}
