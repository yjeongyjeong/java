package ex09_inher02;

class Car {
	int gasolineGauge;
	//4번!! 이곳에선 멤버변수 하나니까 gasoline을 this로 받아주고 상속받은게없으니까 더 신경쓸 것 없음! 끝!
	public Car(int gasoline) {
		gasolineGauge = gasoline; // 이런식으로 이름을 다르게 해줘서 구별할 수도 있지만 잘 안씀
	}

}

class HybridCar extends Car {
	int electricGauge;

	//3번! 마찬가지로 아래에서 호출되어야하니까 생성자를 생성해줌
	//이 시점에서 매개변수는 2개이고 elect~는 멤버로 있으니까 this를 사용, gasoline은 상속받은애니까 super로 값을 넘겨줌
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	//2번! 여기가 1번에서 호출된 생성자 (생성해줘야함)
	//1번에서 3가지 값을 줬으니까 매개변수가 3개여야하고 해당 클래스 안에있는 멤버변수는 water뿐이니까 이거는 this로 사용할 수 있는데 다른애들은 super로 위로 넘겨줌(상속받았으니까)
	public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(gasolineGauge, electricGauge); //위로 던짐
		this.waterGauge = waterGauge;
	}

	public void showCrrentgauge() {
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}

public class ConstructorAndSuper1 {
	public static void main(String[] args) {
		HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3); //1번 : hy~에 있고, 매개변수를 3개 받는 생성자 호출
		hwCar1.showCrrentgauge();

		HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
		hwCar2.showCrrentgauge();
	}
}
