package ex01;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		
		int number = scan.nextInt();
		int hour = number/3600;
		int min = (number%3600)/60;
		int second = number % 60;

		System.out.printf("%d시간 %d분 %d초", hour, min, second);
		
		/* 4000을 입력받았을 때 시분초로 바꿔서 입력해주기
		코드 작성
		int second = number/100;
		int min = number/60;
		int hour = number/(60*60);
		System.out.printf("%d시간 %d분 %d초", hour, min, second);
		결과... 1시간 66분 40초....^^;
		*/
		
		//출력은

		//System.out.println("1시간 6분 40초");
		
	}

}
