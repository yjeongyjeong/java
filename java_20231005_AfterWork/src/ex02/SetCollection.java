package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{
	public Person() {
		System.out.println("*****************");
	}
	@Override
	public int hashCode() {
		System.out.println("hash----------------");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals--------------"); //hashcode 일치하는 값이 없어서 equals까지 하지 않음
		return super.equals(obj);
	}
}
public class SetCollection {
	public static void main(String[] args) {
//		List<String> list = new LinkedList<String>();
		
		Set<Person> list = new HashSet<Person>();
		
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());



	}
}
