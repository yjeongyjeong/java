package ex05;

public class Main {
	public static void main(String[] args) {
		
		A a = new A();
		a.funcA();
		
		//extend A
		B b = new B();
		b.funcB();
		b.funcA();
		
		//extend B
		C c = new C();
		c.funcA();
		c.funcB();
		c.funcC();
		System.out.println("=================");
		
		//상위타입에서 하위타입으로 만들어주면 A에 있는 애들에게만 접근가능 B에 접근하려면 B에 오버라이딩된게 있어야 함 => B클래스가 A 클래스에 있는 funcA메서드를 재정의 하면 그 때는 B 클래스 내의 funcA가 실행됨
		A aa = new B();
		aa.funcA(); // A 클래스 내의 A메서드 출력
		
		B bb = (B)aa; //A타입을 B타입으로 형변환해서 B타입 객체로 받음
		
		/*
		 * A a1 = new A
		 * A a2 = new B
		 * 
		 * B b1 = (B)a1 -> 불가능
		 * B b2 = (B)a2 ->가능 => a2는 B의 기능은 이용할 수 없지만 B 속에 있는 A 타입의 a2 객체
		 * 자식에 있는 걸 쓰고 싶으면 이런식으로 만들어주면 됨
		 * */
		
		A a3 = new C();
		/*
		 * C>B>A 영역에 있는데 a3은 A영역만 접근가능함
		 * C에 접근하고 싶으면 형변환
		 * C c3 = (C)a3;
		 * 
		 * */
		B b3 = (B)a3; //자기자신 B만 접근가능(A포함)
		C c3 = (C)a3; //C 접근 가능 근데 C안에 B와 A가 있으므로 결국 다 접근할 수 있음
	}
}
