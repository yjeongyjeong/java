package ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashMapCollection2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = {10, 20, 30, 40, 50}; 불가능
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int[] intNum = new int[5];
		int[] intNum2 = {10, 20, 30, 40, 50};
		
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
		//이런식으로 초기값을 줄 수 있음
		for(int i : list2)
			System.out.print(i + " ");
		System.out.println();
		
		List<String> list3 = Arrays.asList("a", "ab");
		for(String i : list3)
			System.out.print(i + " ");
		System.out.println();
		
		//근데 add를 통한 값 추가가 불가능...
//		list3.add("abc"); 
		for(String i : list3)
			System.out.print(i + " ");
		System.out.println();
		
//		List<String> list4 = Arrays.asList("a", "ab");
		List<String> list5 = new ArrayList<String>(Arrays.asList("a", "ab"));
		list5.add("hi");
		list5.add("ohoh");
		for(String i : list5)
			System.out.print(i + " ");
		
	}
}
