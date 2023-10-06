package ex04;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTVSub(); //LgTV 추상클래스는 객체를 구현할 수 없음 -> 상속받은애로 구현 
		//추상 클래스는 객체를 못만들지만 추상클래스를 참조하는 객체는 가질 수 있음
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		TV tv2 = new SamsungTV();
		tv2.powerOn();
		tv2.volumeUp();
		tv2.volumeDown();
		tv2.powerOff();
	}

}
