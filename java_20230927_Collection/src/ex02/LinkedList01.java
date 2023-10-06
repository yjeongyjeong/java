package ex02;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("-------------");
		
		for(String s : list) //list에 있는 모든 애들을 String 타입 s로 받음
			System.out.println(s);

		list.remove(0); //index 0 번째 값 삭제 -> index 번호가 전부 앞으로 댕겨짐
		System.out.println("-------------");
		
		for(String s : list) //list에 있는 모든 애들을 String 타입 s로 받음
			System.out.println(s);
		
		System.out.println("-------------");
		list.add(1, "Toy"); //1번에 Toy를 넣어줌 원래 Box[0], Robot[1]이었는데 Toy가 1번자리에 오고 Robot이 뒤로 밀림
		for(String s : list) //list에 있는 모든 애들을 String 타입 s로 받음
			System.out.println(s);
	}
}
