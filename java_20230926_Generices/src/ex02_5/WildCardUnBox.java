package ex02_5;

class Box<T> {
	private T ob; 
	public T get() { return ob;	}
	public void set(T ob) { this.ob = ob; }
	@Override
	public String toString() { 	return ob.toString(); 	}
}
class Toy {
	public String toString() { return "I am a Toy!"; }
}

class BoxContentMover{
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get()); //from에 있는 값을 꺼내서 to에 넣기
//		from은 꺼내기만 to는 저장하기만 => 꺼내기만하는건 ? extends ~~ 저장하기만하는건 super ~~~
//		결론=> extends는 해당클래스 이하 값들이 오니까 꺼내기만 할 수 있음(해당클래스로 받아서 꺼냄) 근데  저장은 자기가 오는지 그 이상이 오는지 모르니까 못함, super는 반대로 자기 이상의 값들이 오니까 저장은 할 수 있음(상위타입은 하위타입 받아줌) 근데 꺼내려고보니까 자기 이상의 값이 오면 받아줄수가 없음.. 그래서 못함(Object로 받을 수 있긴함ㅎ)
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box1 = new Box<>();
		box1.set(new Toy()); //toy가 생성되어서 box1에 넣어짐
		
		Box<Toy> box2 = new Box<>();
		
		//box1에 저장된 내용을 box2로 이동
		BoxContentMover.moveBox(box2, box1);
		System.out.println(box2.get());
		
		
	}
}
