package ex03_refactoring;

public class LgTV extends TV{

	public void powerOn() {
		System.out.println("LgTV 전원을 키다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV 전원을 끄다.");
	}
	
	public void volumeUp() {
		System.out.println("LgTV 소리를 크게하다.");
	}
	
	public void volumeDown() {
		System.out.println("LgTV 소리를 작게하다.");
	}
	
}
