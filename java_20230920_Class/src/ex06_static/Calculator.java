package ex06_static;

public class Calculator {
	
	int result; //인스턴스 변수
	public static int minus; //정적변수, 클래스 변수
	
	//static이 아닌 녀석 => 인스턴스 메소드
	void add(int num1, int num2) {
		result =  num1+num2;
//		this.result =  num1+num2; result에 this 붙여도 됨! 근데 이름 충돌 딱히 없으니 괜찮
	}
	
	//정적 메소드(static), 클래스 메소드
	static void sub(int num1, int num2) {
//		this. minus = num1 - num2; 에러남
		minus = num1 - num2;
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.minus);
	}
}
