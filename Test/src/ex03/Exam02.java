package ex03;

import java.util.Scanner;

public class Exam02 {
// 문자열이 12345이면 개별문자로 분리해서 합을 구하는 프로그램 구현 (합은 15)
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		//+0해서 정수형 배열에 넣고 i번째값들로 더하면 안되나,,,
		for(int i = 0; i<str.length(); i++) {
			//구현
			//chartAt(int i)
			
			System.out.println(str.charAt(i));
			sum += str.charAt(i) - '0';
			//1 2 3 4 5 => 숫자가 아니라 문자라서.... -'0'의 값을 해줘야 정수형이 됨
			//'1' 은 49, '2'는 50 ... 따라서 48(='0')을 빼줘야 진짜 12345 숫자가 됨
			
		}
		System.out.println("sum : " + sum);
	}
}
