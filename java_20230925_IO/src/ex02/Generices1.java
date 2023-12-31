package ex02;

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}

class AppleBox { // 사과 담는 박스
	private Apple ap;

	void setApple(Apple ap) {
		this.ap = ap;
	}

	Apple getApple() {
		return ap;
	}
}

class OrangeBox { // 오렌지 담는 박스
	private Orange op;

	void setOrange(Orange op) {
		this.op = op;
	}

	Orange getOrange() {
		return op;
	}
}

public class Generices1 {
	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApple(new Apple()); //타입이 애플이거나 애플을 상속한 아이만 매개변수로 넣어줄 수 있음
		obox.setOrange(new Orange()); //타입이 오렌지거나 오렌지를 상속한 아이만 매개변수로 넣어줄 수 있음
		Apple a = abox.getApple(); //타입이 애플이거나 애플의 상위 타입만 값을 받을 수 있음
		Orange o = obox.getOrange(); //타입이 오렌지거나 오렌지의 상위 타입만 값을 받을 수 있음
		
		System.out.println(a);
		System.out.println(o.toString());
		
	}
}
