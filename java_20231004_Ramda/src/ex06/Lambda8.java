package ex06;

import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface InterRoll2 {
	int roll();
}
class Ddd2 implements InterRoll2{

	@Override
	public int roll() {
		return (int)(Math.random()*100+1);
	}
	
}


public class Lambda8 {
	public static void main(String[] args) {
		InterRoll2 ddd = () -> 	(int)(Math.random()*6);	
		int result = ddd.roll();
		System.out.println(result);
		
		Function<Integer, Double> f1 = x -> Math.random()*6;
		System.out.println(f1.apply(null)); //null값 넣어도 된다....
		
		System.out.println("-----------------------------");
//		Supplier		() -> T			T get()
		Supplier<Integer> s1 = ()->(int)(Math.random()*6);
		System.out.println(s1.get()); //매개변수가 없는 경우 + 참고로 supplier는 bi가 없음 매개변수를 안받기도하고 반환타입이 2개일 수는 없으니까....
		System.out.println("-----------------------------");
		Supplier<Integer> s2 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return (int)(Math.random()*6);
			}
		};
		System.out.println(s2.get());
	}
}

/* 함수형인터페이스 	표현	 			메서드
 * Consumer		T -> void		void accept(T t)
 * */
 

// forEach, removeif 등에서 사용됨