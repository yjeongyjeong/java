package ex07;

import java.util.function.Function;

public class MethodReferenceExam {
	public static void main(String[] args) {
		Person person = new Person();
		person.action(new Calcuable() {	
			@Override
			public double calc(double x, double y) {
				return x+y;
			}
		});
		System.out.println("---------------------");
//		람다식
		person.action( (x,  y) ->	x+y	);
		System.out.println("---------------------");
//		메소드 참조		- 정적 메소드 => 클래스::메소드		- 인스턴스 메소드 => 참조변수::메소드
//		메소드 참조를 하면 매개변수를 걍 안쓰나봄..
		person.action(Double::sum);
		System.out.println("---------------------");
		
		
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		System.out.println("---------------------");
//람다로 표현
		person.action(
				(x, y) -> Computer.staticMethod(x, y)
				);
//메소드 참조(람다 축약) 정적 메소드인 경우 -> 클래스 :: 메소드
		System.out.println("---------------------");
		person.action(Computer::staticMethod);

//		인스턴스 메소드 => 참조변수::메소드
		System.out.println("----------!----------");
		Computer com = new Computer(); //computer에는 static메서드가 있음
		person.action(new Calcuable() {	
			@Override
			public double calc(double x, double y) {
				return com.instanceMethod(x, y);
			}
		});
		System.out.println("---------------------");
		person.action( com::instanceMethod );
		
		System.out.println("더 쉬운 예시");
		
		Function<String, Integer> f3 = (String s) -> Integer.parseInt(s);
		int result = f3.apply("100");
		System.out.println(result);
//람다형에서 매개변수부분 사라지고 .이 ::로 바뀌는듯?
		Function<String, Integer> f4 =  Integer::parseInt;
		result = f4.apply("100");
		System.out.println(result);
	}
}
