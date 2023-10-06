package ex07_static;

public class Calculator {
	
	int result; //인스턴스 변수
	public static int minus; //정적변수, 클래스 변수
	
	//static이 아닌 녀석 => 인스턴스 메소드
	void add(int num1, int num2) {
		result =  num1+num2;
	}
	
	//정적 메소드(static), 클래스 메소드 -> 프로그램 시작과 동시에 존재하는 애들
	
	static void sub(int num1, int num2) {
		minus = num1 - num2;
//		result = minus; // result 오류남!!! 정적끼리는 왔다갔다 가능하지만 인스턴스는 호출해야 생성되는 애라서 없는 애를 데려올 수 없음,, 
	}
	
}
