package ex02;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("길이 : ");
		
		int len = scan.nextInt();
		
		/*
		int len = scan.nextInt();
		
		for (int i = 0; i < len; i++) {
			for(int j = 0; j < i; j++) { //앞에 공백 찍기
				System.out.print(" ");
			}
			
			for (int j = 0; j < (2*len) - 1 - (i*2); j++) { //별찍기
				System.out.print("☆");
			}
			System.out.println(""); //그냥 줄바꿈용
		} 
		*/
		for (int i = len; i >= 1; i--) {
			for(int j = 1; j <=len-i ; j++) { //앞에 공백 찍기
				System.out.print(" ");
			}
			
			for (int j = 1; j <= 2*i-1; j++) { //별찍기
				System.out.print("☆");
			}
			System.out.println(""); //그냥 줄바꿈용
		} 
	}
	
/*	i = 0부터 시작해보면 처음 for는 시행 안되고(i가 0이라 조건에 걸림) 두번째 for에서 입력값 -1한만큼 *이 찍히고 아래 ""에 의해 줄이 넘어감
 *  i = 1이 되는 경우 처음 for에서는 j=0부터 시작하는데 i가 1이니까 딱 한번만 실행되고 끝남=> 공백한칸이 써짐 
 *  두번째 for에서도 마찬가지로 j=0부터 시작하는데 j < 7번만큼 *이 반복되며 찍힘(0~6번 => 7개 찍힘)
 * 
 *  마지막으로 i = 4가 되는 경우(마지막줄 = 별하나)
 *  처음 for문에서는 공백이 0 1 2 3 => 총 4번 찍힘
 *  두번째 for문에서는 j = 0부터 j < 1 번 => 한번 찍힘  
 *  
 */
}
