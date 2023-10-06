package ex01_3;
//이것이 자바다 591
class Box3<T>{
	private T t; //필드
	public T get() { //getter 메서드 
		return t;
	}
	public void set(T t) { //setter 메서드
		this.t = t;
	}
}

public class GenericExample {
	//제네릭 메서드
	public static <T> Box3<T> boxing(T t) {
		Box3<T> box = new Box3<T>();
		box.set(t);
		return box;
	}

public static void main(String[] args) {
	//제네릭 메서드 호출
	Box3<Integer> box1 = boxing(100); //static이라서 바로 호출!
	int intValue = box1.get(); 
	System.out.println(intValue);
	
	Box3<String> box2 = boxing("홍길동");
	String strValue = box2.get();
	System.out.println(strValue);
}

}
