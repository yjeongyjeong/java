package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 정수나 실수 + 문자열 => 결과는 문자열

class Num{
	private int num;
	public Num(int num) { this.num = num; }
	@Override
	public String toString() {	return String.valueOf(num) ;}
	//정수를 문자열로..
}

public class SetCollection2 {
	public static void main(String[] args) {
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));
		
		Iterator<Num> iter = set.iterator();
		Num str; 
		while(iter.hasNext()) {
			System.out.println(iter.next()); //순서대로 출력되지 않음
//			근데 값이 다나옴 9999가 중복되는데 그냥 잘 들어가서 저장됨!!!
//			이를 방지하려면 hashcode, equals를 재정의해주기
		}
	}
}
