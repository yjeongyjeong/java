package ex11;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedListQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
//		Queue<String> queue = new LinkedTransferQueue<String>();

		queue.add("Toy");
		queue.offer("Box");
		queue.offer("Robot");
		queue.offer("Toy");

		System.out.println(queue.poll()); //-> 맨첨에 들어온 toy 하나를 빼버림
		System.out.println(queue.poll()); //-> 다음에 들어온 box 하나를 빼버림
		System.out.println("---------------");
		
		for (String s : queue)
			System.out.println(s); //First Input First Output 들어온순서대로 나감

		
		System.out.println("---------------");
		for (String s : queue)
			System.out.println(s); //First Input First Output 들어온순서대로 나감
		System.out.println("---------------!");
		System.out.println(queue.peek()); //다음에 빠져나올 값? 
//		peek() : Returns:the head of this queue, or null if this queue is empty
		System.out.println("---------------");
		for (String s : queue)
			System.out.println(s); 
	}
}
