package ex02;

public class Exam07 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(i <= 10) {
			i++;
//			if(i%2 == 0) { // 0 2 4 6 8 10를 더한 값인 30이 나옴
//			sum += i; }
			
			
//			if(i%2 == 1) {
//				continue; // continue를 만나면 아래 문장을 시행하지 않고 반복문 시작으로 올라감 따라서 홀수가 나오면 위로 가게되면서 +1되고 아래식에는 짝수만 남게 됨				
//			}
			
			if(sum>20) // 0 1 2 3 4 5 6 까지 더했을 때 20을 벗어나게 되었으므로 반복이 끝남 => 중첩된거 많을 때 한꺼번에 다 벗어나는건 아님..!
				break; //=>벗어남 결과는 21
			sum += i; 				
		}	
		System.out.println("sum : " + sum);
	}
}
