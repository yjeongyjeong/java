package ex02;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
//		java점수를 입력받아서 학점을 구하는 프로그램 구현
//		90이상 a
//		80이상 b
//		70-> c
//		60->d,f

		Scanner scan = new Scanner(System.in);
		System.out.println("java 점수 입력 >> ");
		int score = scan.nextInt();
		if(score >= 90) {
			System.out.println("A grade");
		} else if (score >= 80) {
			System.out.println("B grade");
		} else if(score >=70) {
			System.out.println("C grade");
		} else if(score >= 60) {
			System.out.println("D grade");
		} else {
			System.out.println("F grade");
		}
		
	}
/* 뭔가 배열만들어서 나누눈값에 따라 넣었던 것 같은데 기억이 안남,,
	String[] gr = { "A", "B", "C", "D", "E"};
	if(score ) {
		
	}
*/	
	
	

}

