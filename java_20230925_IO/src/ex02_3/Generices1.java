package ex02_3;

import java.util.ArrayList;

//Object로 하면 뭐든지 받아지기 때문에 잘못된 데이터가 들어가도 오류없이 진행될수도 있음
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

class A{}
class B extends A{}
class C extends B{}

// 제네릭 클래스(T : template의 약자..)
class Box<T extends A> { //number(정수의 최상위)이거나 number를 상속받은 애들이여야 함
//	byte, double, float, int, long, and short
	private T obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}
}

class RandomBox<M, I> { //이런식으로 2개를 사용할 수도 있음!

    private M material;
    private I item;

    public M getMaterial() {
        return material;
    }

    public void setMaterial(M material) {
        this.material = material;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }
}


public class Generices1 {
	public static void main(String[] args) {
		//우항에서 <>는 생략할 수 있음
		//제너릭을 사용하면 공통으로 받을 수 있음+제한을 둘 수 있음
//		Box<Double> dBox = new Box(); //A거나 A를 상속한 클래스가 아니므로 오류가 발생함
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
		
		
		ArrayList ilist = new ArrayList(); //이렇게 쓰면 아무거나 다 배열로 받을 수 있음
		ArrayList<Integer> ilist2 = new ArrayList(); //이렇게 쓰면 integer만 받아질 수 있으므로 조금 더 안정성이 높아짐 ex) 사칙연산을 한다던가 할 때 위에는 ilist배열에서는 문자가 있을수도 있으므로 할 수 없지만 ilist2는 숫자로 할 수 있으므로 가능~~!
	}
}
