package ex07;

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
	
	@Override
	public int hashCode() {
		System.out.println("hash => "); //add할때 전부 시행됨
		return num % 3;
	}
	@Override
	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else
//			return false;
		System.out.println("equals => "); //hashcode에서 같은값이 있는 경우 시행됨
		return num == ((Num)obj).num ? true : false;
	}
}

public class SetCollection3 {
	public static void main(String[] args) {
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9)); //ex. 주소값 0x10 해쉬값 0 
		set.add(new Num(12)); //해쉬값 0 //위에서 해쉬값0인게 나왔으니까 equals가 수행되면서 ㄹㅇ로 값이 같은지 확인하고 안똑같으니까 애드됨
		set.add(new Num(7)); //해쉬값 1
		set.add(new Num(9)); //ex. 주소값 0x20 //해쉬값 0 해쉬값0인애들이 있으니까 equals가 실행되면서 ㄹㅇ로 값이 같은지 확인하는데 똑같으니까 false.. 값이 추가되지 않음
		
		Iterator<Num> iter = set.iterator();
		Num str; 
		while(iter.hasNext()) {
			System.out.println(iter.next()); 
//			hashcode는 값을 넣을때마다 시행되고, equals는 hashcode의 값이 같은 경우 실행됨!(이전에 hashcode의 값이 있는데 다시 invoke된 경우) 해쉬코드 자체 설명도
/*
 * Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.

If two objects are equal according to the equals method, then calling the hashCode method on each of the two objects must produce the same integer result.

It is not required that if two objects are unequal according to the equals method, then calling the hashCode method on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.
 * */
		}
	}
}
