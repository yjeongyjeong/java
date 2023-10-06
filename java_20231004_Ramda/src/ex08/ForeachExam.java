package ex08;

import java.util.Arrays;
import java.util.List;

public class ForeachExam {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Box", "Toy", "Robot", "Toy", "Box");
		for(String s : lists)
			System.out.println(s);
//		public void forEach(Consumer<? super E> action)
		System.out.println("-----------------------------");
		lists.forEach(s -> System.out.println(s));
//		System.out : class, println : method 따라서 아래와 동일함
		System.out.println("-----------------------------");
		lists.forEach(System.out::println);
	}
}
