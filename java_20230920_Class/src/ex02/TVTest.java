package ex02;

public class TVTest {
	public static void main(String[] args) {
		TV tv = new TV();
		//객체 생성, 생성자 호출(TV()-> TV 클래스에 있어야 하는데 없음! 만들지 않아도 존재함(알아서 만들어줌)=> 클래스 이름과 동일하고 아무것도 없는 녀석 =>기본 생성자)
		//객체가 생성되기 위해서는 반드시 생성자를 통해서 생성됨~!!!!
		//생성자는 오버로딩(함수명동일,매개변수다름)이 가능
		TV tv2 = new TV(10);
		TV tv3 = new TV("kor",10);
	}
}
