package ex02;

public class Exam03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i+=1)
			sum += i;
		// i = 1로 시작하고 <=10인지 확인하고 아래 식하고 i+=1
		System.out.println("sum : " + sum);
		
		if(sum>500) 
			System.out.println("100 이상");
		//한줄이면 {} 안해도됨
		
		System.out.println("end");
		
		for(int i = 1; i <=10; i++)
			if(sum>10)
				System.out.println("10이상");
	}
}
