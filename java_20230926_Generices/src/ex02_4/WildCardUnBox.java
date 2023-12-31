package ex02_4;

class Box<T> {
	private T ob; 
	public T get() { return ob;	}
	public void set(T ob) { this.ob = ob; }
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Toy {
	public String toString() { return "I am a Toy!"; }
}

class BoxHandler{
//	상한제한
	public static void outBox(Box<? extends Toy> box) { //꺼내기 : get만 가능
		Toy t = box.get();
		System.out.println(t);
//		extends toy => toy거나 toy의 하위거나(toy를 상속받은 애들) 
		box.set(new Toy()); //에러남!!! Toy타입의 값을 넣고 싶은데 set에서 어케받을지 모르니까 오류가 나는듯? set이 toy거나 toy의 하위타입일텐데 new Toy는 무조건 상위타입이니까.....? 그리고 box. 자체도 toy거나 toy의 하위타입일테니까
//		Toy t = box.get() : 어차피 get한거를 Toy에 넣으니까 상위타입으로 저장하는것과 같음 따라서 여기선 에러가 발생하지 않음
		<? extends ~~~>=> get(꺼내기만) 가능하고 set은 불가능하다고 생각하기
	}
	
	
//	하한제한
	public static void inBox(Box<? super Toy> box, Toy n) { //저장하기 : set만 가능!!!
//		super toy => toy거나 toy의 상위거나(object) 
		box.set(n);
		Toy n2 = box.get(); //에러남!!! box.get()이 Toy라는 확신이 없어서 막아버림 상위가 올지도 모르니까..
		Object n3 = box.get(); //에러안남!!! 왜냐면 box.get()을 받는게 toy거나 toy의 상위여야하니까... object로 받으면 box.get이 무슨 타입이든 다 받을 수 있으므로 에러안남
//		box.set(n); : n을 저장해야 하는데 super Toy라고 제한을 두었으므로 inBox에 들어오는 box자체의 타입은 무조건 Toy 혹은 그 이상임 따라서 일단 어떤 값이든 저장할 수 있음,, 얘도 마찬가지로 상위타입에 저장하는 것이니까 
//		둘다 상위타입에 저장하는건 가능하게 하고 하위타입으로 하는건 불가능하게 막은 듯?
		<? super ~~~>=> set(저장하기)만 가능하고 get은 불가능하다고 생각하기

	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box = new Box(); //Toy타입의 객체 box를 생성
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
//		타입알아보기 변수명.getClass().getName()
		
		
	}
}
