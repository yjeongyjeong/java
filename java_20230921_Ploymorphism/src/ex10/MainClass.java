package ex10;

public class MainClass {
	public static void main(String[] args) {
		func(new A());
		func(new D()); //오류안나고 종료라고만 나옴
//		func(new D()); 오류남
	}
	
//	static void func(Object obj) {
//		A a = (A)obj;
//		a.funcA();
//	}
	static void func(Object obj) { 
		if( obj instanceof A) { //obj가 참조하는 대상이 A거나 A를 상속한 애면 참이 됨
			A a = (A)obj;
			a.funcA();
		}
		System.out.println("종료");
	}
}
