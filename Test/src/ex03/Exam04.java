package ex03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		//while문과 scanner의 nextline()메소드를 이용해서 키보드 입력된 데이터로부터
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 " );
		
		int choice = sc.nextInt();
		int i = 0;
		int no1 = 10000;
		int no2 = 2000;
// 아나... 선택한거 상관없이 그냥 다출력되게 만들어버림ㅜㅜ 선생님은 switch랑 case사용
		while(i <= 4) {
			i++;
			
			if(i == 1) {
				System.out.println("선택> "+ i +"\n 예금액> " + no1);
			} else if (i == 2) {
				System.out.println("선택> "+ i +"\n 출금액> " + no2);
			} else if (i == 3) {
				System.out.println("선택> "+ i +"\n 잔고> " + (no1-no2));
			} else {
				System.out.println("선택> "+ i +"\n 프로그램 종료");
				break;
			}
			
		}

	}
}
