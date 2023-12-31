package ex02;

import java.util.Scanner;

public class ExceptionEx01_oneError {
	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 (0은 입력하지 마세요)");
		try { //예외발생할곳, 예외발생할거같은애들 넣어줌
			int num = sc.nextInt(); //정수입력이 아니면 오류발생!
//			Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at ex02.ExceptionEx01.main(ExceptionEx01.java:15)
			System.out.println(5/num); //0을 입력하면 오류발생!			
		} catch (ArithmeticException e) { //오류이름
			//예외가 발생하면 catch구문에서 받아줌
			System.out.println(e.getMessage());
		} finally { //반드시 수행될 구문->옵션
			System.out.println("예외처리 종료");
		}
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료!!");
	}
}
