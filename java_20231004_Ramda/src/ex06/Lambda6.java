package ex06;

//람다식 연습!
//살짝 수학 약분하는것처럼,, 당연한애들은 지워버리고 람다식썼다고 -> 표시는 해주기

@FunctionalInterface
interface PrintV {
	void printVar(String name, int i);
}
/* 람다를 사용하지 않으면 하위클래스에서 오버라이드한것을 사용하는것과 같음 혹은 익명의 클래스를 사용해서 재정의하거나...
 * class A implements PrintV{
	@Override
	public void printVar(String name, int i) {
		System.out.println(name +"=" +i);
	}
}
 */


@FunctionalInterface
interface SquareMake {
	int square(int x);
}
@FunctionalInterface
interface InterRoll {
	int roll();
}
class Ddd implements InterRoll{

	@Override
	public int roll() {
		return (int)(Math.random()*100+1);
	}
	
}

@FunctionalInterface
interface SumCal {
	int sumArr(int[] arr);
}
public class Lambda6 {
	public static void main(String[] args) {
		PrintV pv = (name, i) -> System.out.println(name +" = " +i);
		pv.printVar("람다식 사용", 100);
		
		SquareMake sq = x -> x*x; //매개변수가 하나면 중괄호 생략가능
		int result = sq.square(9);
		System.out.println("Square >>"+result);
		System.out.println("--------------");
		
		InterRoll ir = () -> (int)(Math.random()*6);
		System.out.println(ir.roll()); // 람다식으로 재정의된 메서드가 사용됨
		InterRoll ir2 = new Ddd(); //큰 타입이라서 접근가능한데 이름이 동일한 메서드가 있으므로
		System.out.println(ir2.roll()); //오버라이드된 메서드가 나옴(1~100)
		Ddd ir3 = new Ddd();
		System.out.println(ir3.roll()); // Ddd의 메서드가 사용됨
		
		System.out.println("--------------");

//		이렇게 하는게 맞을까? ===> 맞다. 여러줄+변수들 생략이 불가능함!
		SumCal sc = (arr) -> {	int sum = 0;
								for(int i : arr)
									sum += i;
								return sum;
							};
		System.out.println(sc.sumArr(new int[] {1,2,3}));
	}

}

/* 근데 람다식 사용하려면 매번 인터페이스 만들기 귀찮으니까 java에서 만들어줌 => 함수형 인터페이스
 * () -> T 로 표현해서 T get() 메서드를 만들어줌 여기서 T는 제너릭이라 모든타입가능 
 * 
 *
 * */
 