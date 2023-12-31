package ex02;

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
	public static <T> T openBox(Box<T> box) {//제네릭메서드
//		System.out.println(box);
		return box.get();
	}
	public static void peekBox(Box<?> box) { //와일드카드메서드(제네릭과 매우 비슷!)
		//이름구조가 제네릭보다 심플쓰 대신 위에처럼 특정타입으로 반환하지 못하고 void라서 sysout을 해야하는데 그건 그냥 얘를 void로 선언해서 그런걸지도 모르겠군..
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("So Simple String...");
		Unboxer.peekBox(box); //toString 오버라이딩 안하면 ex02.Box@1eb44e46라는 값이 출력됨 ->String이 들어감(스트링주소)
//		Unboxer.openBox(box); //얘도 String값이라서 toString오버라이딩 안하면 String영억에서 주소값이 반환됨!
		String str = Unboxer.openBox(box);
		System.out.println("Unboxer.openBox : "+str);
	}
}
