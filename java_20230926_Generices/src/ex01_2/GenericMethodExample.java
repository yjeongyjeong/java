package ex01_2;


class Box<T> {
	private T ob;

	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return this.ob;
	}
}
class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		System.out.println("Boxed data : " + o.intValue());
		//<T extends Number>가 아니라 <T>라고 하면 어떤 타입이 들어올지모르는데 o.intValue() -> 정수형으로 바꾼다해서 에러남!! 따라서 <T extends Number> 이런식으로 실수, 정수만 들어오게 제한을 두어서 int로 바꾸는 메서드를 사용해도 아무런 문제가 없도록 함
		return box;
	}
}

/*
 * 제네릭은 클래스 레벨에서만 사용할 수 있는게 아니라 메소드 레벨에서도 사용할 수 있다. 제네릭 타입을 선언한 메소드를 제네릭 메소드라 한다. 클래스의 제네릭 타입이 전역 변수처럼 사용된다면 메소드의 제네릭 타입은 해당 메소드 안에서만 사용할 수 있는 지역성을 갖는다.
 * 제네릭 타입을 메소드에서 선언할 때는 접근제한자와 반환타입 사이에 선언한다. ->public static <T> Box<T>
 * makeBox(T o) 클래스에서 사용하려면 클래스 명 우측에 <>를 사용해서 선언한다. ->class Box<T>
 */
class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
		//얘도 마찬가지로 Number로 제한을 줘서 intValue 메서드를 사용해도 오류나지 않도록 함
	}

}

public class GenericMethodExample {
	public static void main(String[] args) {
	Box<Integer> sBox = BoxFactory.makeBox(new Integer(9898));
	//sysout하고 만들어진 데이터(box : 객체)를 sBox가 참조함
	int n = Unboxer.openBox(sBox); // ->unboxer.openBox(sBox)는 int형태로 나오게 됨(왜냐면 sBox가 Integer로 만들어졌으므로) 따라서 int타입의 변수로 받아줌 
	System.out.println(n);
	}
}
