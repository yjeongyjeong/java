package ex02_2;
class Imsi {
	
}
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
//class Box { : 오브젝트로 받아도 apple, orange 등 오브젝트가 최상위이기 때문에 다양한 타입이 접근가능하지만 Object로 하면 뭐든지 받아지기 때문에 잘못된 데이터가 들어가도 오류없이 진행될수도 있음

//	private Object obj;
//	
//	void setObj(Object obj) {
//		this.obj = obj;
//	}
//	
//	Object getObj() {
//		return obj;
//	}
//}

// 제네릭 클래스(T : template의 약자..)
class Box<T> { //제네릭으로 사용하려면 <T> 꼭 써줘야 에러안남! 자료형틀만 있다는 의미-> 실행할 때 자료형이 결졍됨 ex) Box<Apple> 처럼
	private T obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}
}

public class Generices1 {
	public static void main(String[] args) {
// <Apple> => apple만 집어넣어야 함 => 클래스 선언할때 <T>가 전부 apple로 바뀐다고 생각하면 됨
		Box<Apple> aBox = new Box<Apple>(); 
		aBox.setObj(new Apple()); //애플 혹은 애플을 상속한 애만 들어갈 수 있음
//		aBox.setObj(new Orange()); //에러!!!!
		Apple a = aBox.getObj();
		System.out.println(a); //getObj도 apple타입으로 나오는 것이기 때문에 형변환필요없고 apple로 받아주면 됨
		
//		이번엔 오렌지 타입만~~~!!!
		Box<Orange> oBox = new Box<Orange>();
		oBox.setObj(new Orange());
		Orange or = oBox.getObj();
		System.out.println(or);
		
		Box<Integer> integer = new Box<Integer>(); //가능
		Box<Imsi> imsi = new Box<Imsi>(); // 가능
		//마찬가지로 다받아줄수있어서 너무 자유로움~! -> <T extends A>를 사용해서 A거나 A를 상속한 클래스만 전달하도록 시킴->exo2_3에 있음!
		
		
		//		//object로 받았던거랑 아무런 차이없음.. 이런식으로 쓰는건 no!
//		Box aBox = new Box();
//		aBox.setObj(new Apple());
//		System.out.println(aBox.getObj());
//
//		aBox.setObj(new Orange());
//		System.out.println(aBox.getObj());
		
		
		
	}
}
