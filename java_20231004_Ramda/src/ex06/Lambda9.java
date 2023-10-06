package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda9 {
	public static void main(String[] args) {
		SumCal sc = (arr) -> {
			int sum = 0;
			for (int i : arr)
				sum += i;
			return sum;
		};
		System.out.println(sc.sumArr(new int[] { 1, 2, 3 }));
		System.out.println("--------------------");

//		자바에서 제공하는 함수형 인터페이스 사용해보기
		Function<Integer[], Integer> bf = arr -> {
			int sum = 0;
			for (int i : arr)
				sum += i;
			return sum;
		};
		System.out.println(bf.apply(new Integer[] { 1, 2, 3, 4, 5 }));
//		처음에 bifuncton으로 해보려다가 굳이 인자를 두개받을필요는 없을거라고 생각해서(왜냐면 어차피 int[] 배열을 받아서 sum을 출력하기 때문에) function을 사용함
//		자바에서 제공하는 함수형 인터페이스(한개의 추상메소드를 갖는 인터페이스)를 사용하면 인터페이스를 만들지 않아도 된다는 장점이 있음
//		대신 다른데서 인터페이스를 구현해서 사용하고 싶다면... 직접 인터페이스를 만들어줘야겠지..? 왜냐면 자바에서 제공하는 함수형 인터페이스는 일회용(익명클래스?느낌이니까) 

		
//		Predicate를 사용해서 정수하나를 넘겨주면 정수가 짝수인지 홀수인지 알려주는 프로그램 짜기
//		Predicate		T -> boolean		boolean test(T t)
//					논리판단된 결과가 나오도록 함	매개변수 넘겨주면 논리판단한 결과가 나옴
		Predicate<Integer> num =  x -> {
			System.out.print(x + " : ");		
			return (x%2 == 0);
		};
		boolean flag = num.test( (int)(Math.random()*100) );
		String msg = (flag == true ? "짝수" : "홀수");
		System.out.println(msg);
		

	}
}


/*
 * 함수형인터페이스 표현 메서드 Consumer T -> void void accept(T t)
 */

// forEach, removeif 등에서 사용됨