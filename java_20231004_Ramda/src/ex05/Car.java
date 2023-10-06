package ex05;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() { //상속받았다고 생각하면 됨 재정의라고 생각하면 됨 => 클래스 만들지 않고 걍 바로 기능재정의시키기
		public void roll() {
			System.out.println("익명 타이어가 굴러감..");
		};
	};
	
	public void run1() {
		tire1.roll(); //Tire의 일반타이어가 굴러감 왜냐하면 Tire의 객체를 만들고 그 클래스에 있는 기능을 호출했기 때문에
		tire2.roll(); //익명클래스를 통해서 roll의 기능을 재정의해서 익명 타이어가 굴러감
		/* class subtire extens tire{ 오버라이드~~ sysout(익명 타이어가 굴러감)}
		 * private tire tire3 = new subtire
		 * tire3. roll 한것과 같음 
		 * */
	}
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 객체2 타이어 굴러감..");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	

}
