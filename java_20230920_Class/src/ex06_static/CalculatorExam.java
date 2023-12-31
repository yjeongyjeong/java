package ex06_static;

public class CalculatorExam {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		System.out.println(cal.result);
		cal.minus = 123;
		System.out.println(cal.minus);
		
		Calculator cal2 = new Calculator();
		cal2.add(10, 20);
		System.out.println(cal2.result);
		System.out.println(cal2.minus); //동일한 값이 출력됨 (static이라서)

		//정적 메소드 객체를 생성해서 접근할 수도 있고
		cal.sub(10, 5);
		System.out.println(cal.minus);
		//객체를 생성하지 않고 접근할 수도 있음
		Calculator.sub(50, 40);
		System.out.println(Calculator.minus);
	}

}
