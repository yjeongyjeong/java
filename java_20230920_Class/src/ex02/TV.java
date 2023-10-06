package ex02;

public class TV {

	String color;
	boolean power;
	int channel;
	//접근제한자는 있을 수 있지만 반환타입은 없음
	//오버로딩해서 생성자를 만들거나,, 사용자가 직접 생성자를 만들면 jvm에서 기본생성자를 만들어주지 않음.. 사용자가 만들지 않으면 기본생성자 jvm이 알아서 만들어줌=> 클래스 만들때 기본적으로 기본생성자 만들기!
	TV(){
		System.out.println("기본생성자");
	}
	
	TV(int i) {
		System.out.println("매개변수 하나");
	}

	TV(String string, int i) {
		System.out.println("매개변수 두 개");
	}

	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}
