package ex03_refactoring;

abstract public class TV { //추상클래스를 상속받으면 무조건 내부에 있는 추상메서드를 구현해줘야함=>추상메서드 4개 전부!

	abstract public void powerOn();
	
	abstract public void powerOff();
	
	abstract public void volumeUp(); 
	
	abstract public void volumeDown(); 
	
}
