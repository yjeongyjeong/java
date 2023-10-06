package ex04;

public class LgTVSub extends LgTV {
//The type LgTVSub must implement the inherited abstract method TV.volumeUp()
	//상속받은 클래스와 자식 클래스가 추상클래스라면 메서드를 재정의하지 않아도 괜찮음!
	//그러나 이 클래스는 추상클래스가 아니므로 상속받을 때 오버라이딩되지 않은 애를 오버라이딩 해줘야 함
	@Override
	public void volumeUp() {
	}

}
