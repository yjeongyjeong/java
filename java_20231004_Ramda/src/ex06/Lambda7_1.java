package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

//java에서 제공하는 함수형 인터페이스 연습! => 인터페이스를 만들지 않고도 간단하게 재정의하여 사용할 수 있음

//@FunctionalInterface
//interface SquareMake {
//	int square(int x);
//}


public class Lambda7_1 {
	public static void main(String[] args) {
		Consumer<String> con = name -> System.out.println(name);
		con.accept("Hello!");
		System.out.println("-------------------");
		IntConsumer intcon =  x -> System.out.println(x*x);
		intcon.accept(8);
		
//		혹은 functional을 사용 : 이때 <T, R> 안에는 객체만 와야하므로 int말고 Integer를 사용해 주어야 함
		Function<Integer, Integer> f1 = x -> x*x;
		System.out.println(f1.apply(8));
		System.out.println("-------------------");
		
//		매개변수를 두 개 받는 함수형 인터페이스	(세개 네개는 self...)
//		BiFunction		(T, U) -> R			R apply(T t, U u)
		BiFunction<Integer, Integer, Integer> bif1 = (x, y) -> x+y;
		System.out.println(bif1.apply(5, 3)); //Integer로 반환됨
		BiFunction<Integer, Integer, Integer> bif2 = (x, y) -> x-y;
		System.out.println(bif2.apply(5, 3)); //Integer로 반환됨
		
		BiFunction<Integer, Integer, Double> bif3 = new BiFunction<Integer, Integer, Double>() {
			@Override
			public Double apply(Integer t, Integer u) { //apply를 재정의하는 것이므로 apply로 값을 넣어주는 것
				return null;
			}
		}; 
	}
}

/* 함수형인터페이스 	표현	 			메서드
 * Consumer		T -> void		void accept(T t)
 * */
 