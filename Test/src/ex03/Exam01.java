package ex03;

import java.util.Scanner;

public class Exam01 {
//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
//	1,5 	2,4 	3,3 	4,2 	5,1
	public static void main(String[] args) {
//		출력함
	//	1부터 6까지 배열 만들고 합이 6이되면 출력하게 하고 싶음
		
	/*
	 * Scanner scan = new Scanner(System.in);
	 * System.out.println("몇 개의 주사위를 던지실 건가요? ");
	 */		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if( i + j == 6) {
					//System.out.printf("(%d, %d) \n", i, j); 
					System.out.printf("%d, %d", i, j); 
					//근데 %d, %d 하면 개이상하게 출력됨 왜지ㅠ 어 이상한게 아니라 걍 붙어나와서 이상해보이는거엿음ㅋㅋ;;
				}
			}
		}
		
		
	}
}
