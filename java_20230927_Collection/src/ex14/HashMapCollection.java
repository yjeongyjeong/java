package ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashMapCollection {
	public static void main(String[] args) {
		int[] ar = {1,3,7,5,6,9,1,3,10};
		for(int i : ar)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();

		//		정렬기능
		Arrays.sort(ar);
		for(int i : ar)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();
		//		문자도 정렬가능
		String[] str = {"Box", "Toy", "Robot", "toy", "box", "robot"};
		Arrays.sort(str);
		for(String i : str)
			System.out.print(i + " ");
		
	}
}
