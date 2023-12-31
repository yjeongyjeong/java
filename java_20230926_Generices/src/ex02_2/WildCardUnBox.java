package ex02_2;

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
	//하한제한 : 밑으로 내려가는걸 제한함 -> 여기까지만 받아줄거다!!!
	public static void peekBox(Box<? super Integer> box) { //와일드카드메서드(제네릭과 매우 비슷!)
//		Object <- Number <- Integer : Integer 이상으로 집어넣을 수 있음
//		따라서 만약 super Number를 하면 Number이상으로 집어넣어야 하므로 integer 타입으로 생성한 객체는 오류남!
//		extends는 상한제한~! 위로 올라가는걸 제한함 -> 얘가 위에 있어야하거나 얘자체거나! 살짝 이상(under?) 다른 건 안 받아줘!
//		<? extends Number> : Number를 상속받거나 Number인 애만 받아줌
//		만약 여기서 super Integer가 아니라 extends Integer라면 Integer혹은 그 아래만 받아주므로 나머지 에러남
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box();
		iBox.set(9999);
		
		Box<Number> nBox = new Box();
		nBox.set(10.3);
		
		Box<Object> oBox = new Box();
		oBox.set("Simple");
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(oBox);
	}
}
