package ex02_1;

class Box<T>{
	private T ob; //필드
	public T get() { //getter 메서드 
		return ob;
	}
	public void set(T ob) { //setter 메서드
		this.ob = ob;
	}
	@Override
	public String toString() {return ob.toString();	}
}

class Unboxer{
	//상한제한
	public static void peekBox(Box<? extends Number> box) { //와일드카드메서드(제네릭과 매우 비슷!)
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.set(1234);
		
		Box<Double> dbox = new Box<Double>(); //우항에는 <Double> 생략해도 괜찮
		dbox.set(12.6);
		
		Box<String> sbox = new Box();

		Unboxer.peekBox(box);
		Unboxer.peekBox(dbox);
//		Unboxer.peekBox(sbox); -> 타입이 제한되어있기 때문에 number(정수 혹은 실수)가 아니면 에러남 number거나 number의 자손만 허용..
	}
}
