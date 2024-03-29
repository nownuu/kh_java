package api.lang.object;

public class Test02 {
	public static void main(String[] args) {
		//object 는 무슨 역할을 하는 클래스인가?
		//=자고로 클래스라면 무조건 Object를 상속받는다(인터페이스 제외)
		//=클래스라면 반드시 가지고 있어야 할 "공통"기능에 대해서 정의한다. 
		
		Object a = new Object();
		
		System.out.println(a.toString()); //객체의 한줄 요약 정보
		System.out.println(a.hashCode()); //일련번호 //주소가 아님
		
		Object b = new Object();
		
		System.out.println(b.toString());
		System.out.println(b.hashCode()); //또다른 일련번호
	}
}
