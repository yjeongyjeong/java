package ex08_singleton;

public class A {
	int number; //default 패키지 다르면 안됨!!
	private int number2; //현재 클래스에서는 접근 가능
	public int number3; // 패키지달라도 쌉가능
	
	void add() {
		number2 = 2;
	}
	private void add2() {
		number = 4;
	}
}
