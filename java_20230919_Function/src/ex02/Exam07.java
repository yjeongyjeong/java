package ex02;

public class Exam07 {
	public static void main(String[] args) {
		int[] numA = new int[10];

		for (int i = 0; i < 10; i++) {
			numA[i] = i + 1;
		}
		System.out.println("원 데이터 : ");
		for (int i = 0; i < numA.length; i++)
			System.out.print(numA[i] + " ");
		
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10); //0~99
			//값바꾸기한거랑 같은 원리임 대신 바꿀값을 랜덤으로 정한 것
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		System.out.println("\n썩은 데이터 : ");
		for (int i = 0; i < numA.length; i++)
			System.out.print(numA[i] + " ");
		
		

	}
}
