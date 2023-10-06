package ex01;

//재귀 호출
public class Exam01 {
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("result : " + result);
	}
	
//	5!
	static int factorial(int num) {
		int result = 0;
		
		if(num == 1)
			return 1;
		
		else
			result = num * factorial(num-1);
		
		return result;
	}
	
/* 5를 넣는 경우
 * 1이 아니므로 else에 있는 식이 수행됨
 * result = 5* 4->마찬가지로 1이 아니므로 else의 식이 수행됨
 * 즉 5가 4를 가져오고 4가 다시 3을 가져오고 3이 다시 2를 2가 다시 1을...
 * => 5 * 4 * 3 * 2 * 1 까지가 전부 수행됨
 * 
 * num이 1이 아닌 이상...
 */
}
