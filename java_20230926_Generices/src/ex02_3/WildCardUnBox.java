package ex02_3;

class Box<T> {
	private T ob; // 필드

	public T get() { // getter 메서드
		return ob;
	}

	public void set(T ob) { // setter 메서드
		this.ob = ob;
	}

	@Override
	public String toString() {
		return ob.toString();
	}
}

class Toy {
	public String toString() { return "I am a Toy!"; }
}
// 그럼 얘는 와일드카드인데 ?대신 Toy를 사용한 걸까?
class BoxHandler{
	public static void outBox(Box<Toy> box) { //꺼내기
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy()); : 꺼내기만 하고 싶은데 값을 저장하는 것도 되어버림-> 상한하한제한걸어서 안정성을 높일 수 있음->실수할 가능성을 줄임
	}
	public static void inBox(Box<Toy> box, Toy n) { //저장하기
		box.set(n);
//		Toy n = box.get(); : 저장하기만 하고 싶은데 값을 꺼내는 것도 문제가 없음
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box = new Box(); //Toy타입의 객체 box를 생성
		BoxHandler.inBox(box, new Toy());
		
		BoxHandler.outBox(box);
	}
}
