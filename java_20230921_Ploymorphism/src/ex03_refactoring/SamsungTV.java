package ex03_refactoring;

public class SamsungTV extends TV {

	public void powerOn() {
		System.out.println("SamsungTV 전원을 키다.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV 전원을 끄다.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV 소리를 크게하다.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV 소리를 작게하다.");
	}
	
}
