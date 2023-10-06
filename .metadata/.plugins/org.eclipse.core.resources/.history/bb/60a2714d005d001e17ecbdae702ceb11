package ex09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 이름과 나이가 같으면 동일 인스턴스로 판단되도록 해시코드와 이퀄스를 재정의하기
 * */
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {};

	@Override
	public int hashCode() {
//		return 0;
		return age/name.length(); 
//		선생님은 (name.hashCode() + (age%10)) /2
	}

	@Override
	public boolean equals(Object obj) {
		String _name = ((Person)obj).name;
		int _age = ((Person)obj).age;
//		return true;
		return
		(name.equals(_name)) && (age == _age) ? true : false;
		//삼항연산자 => 조건식 ? 조건식이 참이면 실행될 녀석 : 조건식이 거짓이면 실행될 녀석
		//조건식에 string글자 하나하나 비교해서 같은지+나이숫자가 같은지를 넣어줌 따라서 둘다 조건이 만족하면 true가 반환됨->즉 이퀄스 결과가 true라는 의미 따라서 중복이므로 set에서 중복허용안하니까 제거? 값이 안들어감? 암튼 중복노노됨
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}

public class SetCollectionExam01 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();

		set.add(new Person("홍길동", 20));
		set.add(new Person("아이스", 40));
		set.add(new Person("홍길동", 20));
		set.add(new Person("브레이커스", 37));
		set.add(new Person("왜값이안들어가니", 2));
		set.add(new Person("왜값이안들어가니", 32));
		set.add(new Person("왜값이잘들어가니", 32));
		
//		Iterator<Person> iter = set.iterator();
//		while (iter.hasNext()) {
//			Person print = iter.next();
//			System.out.println(print);
//		}
		
		for(Person p : set)
		System.out.println(p.toString());
	}
}
