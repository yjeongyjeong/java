package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러감..");
	}
}

class TireExtends extends Tire{
	private Tire tire = new Tire();
	@Override
	public void roll() {
		System.out.println("익명 객체3이 굴러가는 걸 오버라이드 함");
	}
	
}

