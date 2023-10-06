package ex02;

public class Exam08 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		do {
			i++;
			sum += i ;
		} while (i < 10); // 조건이 아래에 있음 => 무조건 한번은 문장이 시행됨 그냥 while은 아니면 시행안됨
		
		System.out.println("sum : "+sum);
	}

}
