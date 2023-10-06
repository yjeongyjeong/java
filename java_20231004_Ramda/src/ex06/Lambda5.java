package ex06;
//Lambda4의 익명의 클래스를 람다식으로 바꿈
@FunctionalInterface
interface Cal2 {
	int max(int num1, int num2);
}

public class Lambda5 {
	public static void main(String[] args) {
		Cal2 cal = 
			(num1, num2) -> num1>num2 ? num1 : num2;
//			받는인자 써주고(어차피 결과사용할때도 필요하니까..) 결과 써줌 중괄호 없애려면 return도 빼버림
			int result = cal.max(5,10);
			System.out.println(result);
			
			/* 근데 모든 인터페이스에 람다식을 사용할 순 없음 min(int num1, num2)이런애가 있다면 알 수 없기 때문에... 따라서 람다식을 사용하려면 반드시 추상메서드가 하나존재해야함!
			 * => 하나만 존재한다고 @FunctionalInterface 라는 어노테이션을 붙여주면 확인이 조금 더 쉬움 => 람다식으로 사용했는데 인터페이스에 다른 메서드를 추가하면 에러발생~!~! 따라서 어노테이션 붙여서 하나만있게해주기..
			 * 
			 * */
	}
}
