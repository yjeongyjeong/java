package ex02_1;

class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}
//중복된 내용을 제거
class Box { // 담는 박스
	private Object obj;

	void setObj(Object obj) {
		this.obj = obj;
	}

	Object getObj() {
		return obj;
	}
}

public class Generices1 {
	public static void main(String[] args) {
		Box aBox = new Box(); //사과
		Box oBox = new Box(); //오렌지
		
		aBox.setObj(new Apple()); //object 최상위라서 모든 타입을 받을 수 있음
		oBox.setObj(new Orange());
		
		Apple a1 = (Apple)aBox.getObj(); //object 타입이므로 apple로 받으려면 형변환을 해서 받거나
		Object a2 = aBox.getObj(); //object 타입이므로 object로 받거나
		
		System.out.println(a1);
		System.out.println(a2);
		
		Orange o1 = (Orange)oBox.getObj();
		Object o2 = oBox.getObj();
		System.out.println(o1);
		System.out.println(o2);
	}
}
