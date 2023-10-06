package ex05;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1(); // 일반이랑 익명이 나옴
		car.run2(); // 익명객체2
		
		car.run3(new Tire()); // 일반타이어
		car.run3(new Tire() { //객체3이 동작 -> 이름이 없는 익명하위클래스느낌
			@Override
			public void roll() { // 마찬가지로 오버라이드함
				System.out.println("익명 객체3이 굴러감..");
			}
		});
//		car. 상속받은것처럼 해보기
		
		
	}
}
