package ex02;

public class Exam05 {
	public static void main(String[] args) {
		int A = 100;
		int B = 500;
		int C = 1000;
		/*
		 * 이렇게 하면 A가 B보다 작고, C가 젤 큰값일 때 안 됨! 
		 * => 선생님이 하신거 참고하면 밑에서도 else 안에 중첩 if 사용하면 됨~!
		 * 여러가지 수 중에서 최대 최소 구하려면 아예 자바 메서드 사용하거나 배열에 담아서 하는 식으로...
		if( A>B) {
			if(A>C) {
				System.out.println("Max : " + A);
			} else { 
				System.out.println("Max : " + C);
			}
		} else {
			System.out.println("Max : " + B);
		}
		*/
		int n1 = 10, n2 = 20, n3 = 30;
		int max, min;
		max = min = 0;
		
		if(n1>=n2) {
			if(n1>n3) {
				max = n1;
			} else {
				max = n3;
			}
		}else {
			if(n2>n3) {
				max = n2;
			} else {
				max = n3;
			}
		}
		System.out.println("max : "+max);
		//System.out.printf("max : %d, min : %d\n", max, min);
	}
}
