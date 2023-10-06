package ex02;

import java.util.HashSet;
import java.util.Set;


class Personn{
	private String name;
	private int age;
	public Personn(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	public Personn() {};
	@Override
	public String toString() {
		return name + "," + age;
	}
	@Override
	public int hashCode() {
		System.out.println("hash");
		return name.length()/age;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		String _name = ((Personn)obj).name;
		int _age = ((Personn)obj).age;
		return
		(name.equals(_name)) && (age == _age) ? true : false;	}
}

public class SetCollectionExam {
	public static void main(String[] args) {
		Set<Personn> set1 = new HashSet<Personn>();

		set1.add(new Personn("홍길동", 20));
		set1.add(new Personn("아이스", 40));
		set1.add(new Personn("홍길동", 20));
		set1.add(new Personn("브레이커스", 37));
		set1.add(new Personn("왜값이안들어가니", 2));
		set1.add(new Personn("왜값이안들어가니", 32));
		set1.add(new Personn("왜값이잘들어가니", 32));
		

		for(Personn p : set1)
		System.out.println(p.toString());
	}
}
