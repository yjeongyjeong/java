package ex06_static;
//객체 생성없이 접근가능

public class Calculator_staticTest {
	public static void main(String[] args) {
//		Calculator.minus = 100;
		System.out.println(Calculator.minus);
// 스태틱에 올라가 있으면 계속 있는 건 맞음 그러나 cal.minus = 123; 값이 안나오는 이유는
// 실행할때마다 값이 초기화되기 때문 => 같은 main에 있는게 아니니까 여기서 실행하면 minus값이 0이 나옴
	}
}
