package ex02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		System.out.println(str);
		System.out.println(number);
//sc.nextInt이후 nextLine 하면 sc에 num의 값이 저장되어있기 때문에 str은 입력되지 않음
//		=>되게 만드려면 중간에 nextline써서 빈값 읽어오면 됨
//반대순서는 둘다 입력됨=>?? string영역은 다로 있어서 그런걸까..
		
	}
}
