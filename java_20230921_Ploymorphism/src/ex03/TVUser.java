package ex03;

public class TVUser {
	public static void main(String[] args) {
		
		//lg쓰다가 samsung으로 교체하는 경우 개귀찮게 코드를 전부 수정해야함 어케해야 간단하게 할 수 있을까?
		//=> 공통기능을 상위클래스로 만들고 이를 상속받아 사용, 메서드를 오버라이딩해서 생성된 객체에 따라 다른 기능을 하도록 만들어줌
		////공통기능을 인터페이스로 빼도 됨 대신 인터페이스로 뺀다면 powerOn();이렇게만 있고 내용은 구현된곳에서 알아서 구현..
		//=>리펙토링한곳에서 확인할 수 있음
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}

}
