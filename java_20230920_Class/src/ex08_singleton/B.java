package ex08_singleton;
//public > protected > default(아무것도 표시안되어있으면 기본적으로 디폴트) > private
public class B {
	public static void main(String[] args) {
		A a = new A();
		a.number = 10;
		//number2는 접근불가
		
	}
}
