package ex12;

import java.util.List;
import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
//		List<Integer> stack = new Stack<Integer>(); 이 경우 stack.push를 못씀..
		
//		stack.push(10);
//		stack.push(11);
//		stack.push(9);
//		stack.push(10);
//		stack.push(15);
		
		stack.add(10);
		stack.add(11);
		stack.add(9);
		stack.add(10);
		stack.add(15);
		
//		stack.pop(); // 가장 마지막에 들어가서 가장 위에 보이는게 15이므로 15가 나감
//		stack.pop(); // 10이 나감
		System.out.println("-------------");
		for(int i : stack)
			System.out.println(i);
	}
}
