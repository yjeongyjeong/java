package ex01_3;

//super를 사용해서 받은 변수를 위로 넘기는 방법

class Box<T> {
	private T ob;
	public Box( T ob) {
		this.ob = ob;
	}
	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return this.ob;
	}
}
class SteelBox<T> extends Box<T>{
	public SteelBox(T ob) {
//		여기서 받은 ob값을 Box에 전달하기
		super(ob);
		/* 상위에 생성자 생성 ->ob를 받는 생성자!!! 근데 ob가 제네릭이니까 T ob를 받는 생성자
		 * public Box( T ob) { this.ob = ob; }
		 */
		
	}
}

public class GenericMethodExample {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(new Integer(9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));
		Box<String> sBox2 = new SteelBox(new Integer(9999)); //->값이 안나옴
/* SteelBox에만 값을 넣어줬는데 상위에 있는 get set에도 값이 들어감 -> 왜냐면 SteelBox에서 super를 호출해서 값을 넣어줬으니까
 * 또한 상속관계에서는 타입이 동일해야함!! 따라서 30번째 코드에 있는 SteelBox의 상위타입은 integer, 31번째 코드에 있는 SteelBox의 상위타입은 string -> 32번 코드에서 에러나는 이유가 이것 때문-> SteelBox에 integer가 들어갔는데 String타입을 상위로 받아버렸음
 * 		
 */
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}
}
