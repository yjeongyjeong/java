package ex01_1;


class Box<T> {
	private T ob;

	public void set(T ob) {
		this.ob = ob;
	}

	public T get() {
		return this.ob;
	}
}

/*
 * 제네릭은 클래스 레벨에서만 사용할 수 있는게 아니라 메소드 레벨에서도 사용할 수 있다. 제네릭 타입을 선언한 메소드를 제네릭 메소드라 한다. 클래스의 제네릭 타입이 전역 변수처럼 사용된다면 메소드의 제네릭 타입은 해당 메소드 안에서만 사용할 수 있는 지역성을 갖는다.
 * 제네릭 타입을 메소드에서 선언할 때는 접근제한자와 반환타입 사이에 선언한다. ->public static <T> Box<T>
 * makeBox(T o) 클래스에서 사용하려면 클래스 명 우측에 <>를 사용해서 선언한다. ->class Box<T>
 */
class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

}

public class GenericMethodExample {
	public static void main(String[] args) {
		//T타입을 String으로 하는 경우, Sweet 값이 출력되도록
/*내가한것->		Unboxer.openBox(new Box()); 
		Box<String> sBox = new Box(); 
		sBox.set("Sweet"); //값이 안보여요..
		sBox.get(); //값이 안보여요..
		Unboxer.openBox(sBox); //값이 안보여요..
		
		=>String으로 반환되므로 String 변수로 받아주고 출력해야한다는 걸 몰랐음!!
		나는 그냥 값만 쥐어준 상태...
		출력을 안함!! 반환만된상태!!!
		System.out.println(Unboxer.openBox(sBox)); 했으면 제대로 값이 출력되었을 것임~!
*/
		//T타입을 String으로 하는 경우, Sweet 값이 출력되도록
		Box<String> box = new Box<String>(); 
		Unboxer.openBox(box);
		box.set("Sweet");
		
		String str = Unboxer.openBox(box); // 값이 전달될 때 이미 String인걸 알고있음!
//		Box<String> sbox = Unboxer.openBox(box); //이렇게 바로 안되는 이유는 String이라서... 저번에 String 메모리 했던것과 비슷함 주소값때문임->  Unboxer.openBox(box) 얘는 String이라서 String공간에 저장되어 있음! 근데 Box<String>으로 만들어진 sbox는 객체이므로 String 주소를 바로 반환받을 수 없고(타입이 다르니까) 위에처럼 String으로 받거나 아니면 box타입에 넣으면 안되는건가?		box.set(Unboxer.openBox(box)); 되네 -> 위에서 box가 String을 받는 타입으로 선언되었으므로 가능가능 근데 어차피 get을 해도 출력하는 메서드가 없으니까 출력은 sysout으로 해야함~!
		
//		결론 : sweet를 출력하려면 String변수로 받아서 하던가 아니면 그냥 바로 sysout에 넣던가 왜냐면 메서드가 String을 반환하니까..
		
		System.out.println(str);
	}
}
