package ex01;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}
/*제네릭은 클래스 레벨에서만 사용할 수 있는게 아니라 메소드 레벨에서도 사용할 수 있다. 제네릭 타입을 선언한 메소드를 제네릭 메소드라 한다. 클래스의 제네릭 타입이 전역 변수처럼 사용된다면 메소드의 제네릭 타입은 해당 메소드 안에서만 사용할 수 있는 지역성을 갖는다. 
 * 제네릭 타입을 메소드에서 선언할 때는 접근제한자와 반환타입 사이에 선언한다. ->public static <T> Box<T> makeBox(T o) 
 * 클래스에서 사용하려면 클래스 명 우측에 <>를 사용해서 선언한다. ->class Box<T>
 * 
 * public <타입파라미터 정의> 리턴타입 메소드명(매개변수) {..}
 * 
 * */
class BoxFactory{
	public static <T> Box<T> makeBox(T o){ //static : 객체 생성하지 않고 불러올 수 있음
		// <T> 와 makeBox(T o) 가 같아야하고(알파벳은 아무거나 상관없음!!)
//		Box<T> 와 아래에 있는 애들 같아야함
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethodExample {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet"); //static : 객체 생성하지 않고 불러올 수 있음
//		box가 sBox에 저장되는 순간 box가 지워짐!(힙에 공간남아있을수도 있지만 여튼 연결고리는 이제 끊김)
//		box가 가지고 잇던 애들은 이제 전부 sBox가 참조
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
		/*7.59가 받아지고 Box<Double>객체가 생성됨
		 * Box에는 set과 get메서드가 존재함 -> 7.59라는 값이 반환되는 메서드들,,
		 *  
		 * 
		 * */
		
	}
}
