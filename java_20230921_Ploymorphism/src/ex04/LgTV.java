package ex04;

abstract public class LgTV extends TV{ //이렇게도 가능함
	//상속받은 클래스와 자식 클래스가 추상클래스라면 메서드를 재정의하지 않아도 괜찮음!

	public void powerOn() {
		System.out.println("LgTV 전원을 키다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV 전원을 끄다.");
	}
	
//	public void volumeUp() {
//		System.out.println("LgTV 소리를 크게하다.");
//	}
//	
	public void volumeDown() {
		System.out.println("LgTV 소리를 작게하다.");
	}
	
}
