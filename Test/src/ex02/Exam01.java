package ex02;

public class Exam01 {
	public static void main(String[] args) {

		int numA = 100;
		int numB = 200;
		System.out.printf("before => A : %d, B : %d\n", numA, numB);
		//100, 200
		
		//값 바꾸기
		int saveVal = numB;
		numB = numA;
		numA = saveVal;
		System.out.printf("after => A : %d, B : %d\n", numA, numB);
		//200, 100
		
	}
}
