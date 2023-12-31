package ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01_twoError {
	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 (0은 입력하지 마세요)");
		try { 
			int num = sc.nextInt();
//			Exception in thread "main" java.lang.ArithmeticException: / by zero
			System.out.println(5/num);
//			Exception in thread "main" java.util.InputMismatchException
//		} catch (ArithmeticException e) { //오류이름
//			System.out.println(e.getMessage());
//		} catch (InputMismatchException e) {
//			System.out.println(e.getMessage()); 뭘집어넣어도 다 받아주도록 상위클래스로 받음
			
			/*
			 * 최상위는 Throwable인데 이걸 넣어버리면 Error도 예외로 잡히므로(코드가 아니라 컴퓨터문제) 차라리 Exception으로 잡기 -> 대신 예외처리 자세히 알기가 어려울 수 있음
			 * 
			 * 참고로 try 구문에 여러개를 넣었는데 맨위에서 에러잡히면 다음문장은 거들떠보지도 않고 넘어감
			 * */
		} catch (Exception e) {
				System.out.println(e.getMessage());
		} finally { 
			System.out.println("예외처리 종료");
		}
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료!!");
	}
}
