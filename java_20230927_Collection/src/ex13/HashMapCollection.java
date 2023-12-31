package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(45, "Toy1");
		map.put(35, "Robot");
		map.put(25, "Box");
		map.put(15, "Toy3");
		map.put(45, "Toy2");
		System.out.println(map.get(45));

		System.out.println(map.get(45)); // 45번 키에 저장된 값이 불러와짐 키가 중복된 경우 마지막에 저장된 키값으로 값이 저장됨
		System.out.println(map.get(35));
		System.out.println(map.get(25));
		System.out.println(map.get(15));

		Set<Integer> keySet = map.keySet();

		for (int i : keySet) // 키 알려줌
			System.out.print(i + " ");

		System.out.println("\n----------------------");
		for (int i : keySet) {
			System.out.print(map.get(i) +" ");
		}
		
		System.out.println("\n----------------------");
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext())
			System.out.println(map.get((iter.next())));
	}
}
