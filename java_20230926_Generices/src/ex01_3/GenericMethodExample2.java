package ex01_3;
// super를 사용하지 않고 하위에서 객체를 만들고 상위의 기능을 사용하는 방법
class Box2<T> {
	private T ob;

	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return this.ob;
	}
}

class SteelBox2<T> extends Box2<T> {
	public SteelBox2(T ob) {

		Box2<T> box = new Box2<T>();
		box.set(ob);
	}
}

public class GenericMethodExample2 {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(new Integer(9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));
		Box<String> sBox2 = new SteelBox(new Integer(9999));
		/*
		 * SteelBox에만 값을 넣어줬는데 상위에 있는 get set에도 값이 들어감 -> 왜냐면 SteelBox에서 super를 호출해서 값을
		 * 넣어줬으니까 또한 상속관계에서는 타입이 동일해야함!! 따라서 30번째 코드에 있는 SteelBox의 상위타입은 integer, 31번째
		 * 코드에 있는 SteelBox의 상위타입은 string -> 32번 코드에서 에러(출력안됨)나는 이유가 이것 때문-> SteelBox에 integer가
		 * 들어갔는데 String타입을 상위로 받아버렸음
		 * 
		 */

		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
