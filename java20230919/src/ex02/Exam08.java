package ex02;

public class Exam08 {
	public static void main(String[] args) {
		int[] numA = new int[45];

		for (int i = 0; i < numA.length; i++) {
			numA[i] = i + 1;
		}
		System.out.println("원 데이터 : ");
		for (int i = 0; i < numA.length; i++)
			System.out.print(numA[i] + " ");
		
		for (int i = 0; i < 100 ; i++) { //100번 위치이동시킴
			int n = (int)(Math.random()*45); 
			//값바꾸기한거랑 같은 원리임 대신 바꿀값을 랜덤으로 정한 것
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
			//i가 없네? i<2로 해서 돌렸더니 123456중에 처음 0번째만 어딘가의 값과 바뀌어있음
			//배열 자체를 받아주나봄,, 근데 10을넣어도 처음값만 바뀌고 100넣어야 다바뀌네 뭐냐
			//그렇다고 0대신 i를 넣기엔 100개가 안됨 배열이
			//아 어차피 0번째가 계속 바뀌고 있으니까,, 아니지,,,
			//그냥 몇번수행될건지 인듯,, 멋슥,,,
		}
		System.out.println("\n이번주 번호 : ");
		for (int i = 0; i < 6; i++)
			System.out.print(numA[i] + " ");
		
		

	}
}
