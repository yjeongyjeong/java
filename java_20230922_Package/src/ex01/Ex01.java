package ex01;

import java.util.List;

public class Ex01 {
public static void main(String[] args) {

	Person p1 = new Person("나나나", 20);
	Person p2 = new Person("나나나", 20);
	System.out.println(p1.equals(p2)); //false
	System.out.println(p1.toString()); //주소값이 나옴 이걸 내용이 나오도록 바꾸려면
	System.out.println(p1.name.toString());

	System.out.println(p1.age); //근데 위랑 먼차이?
	System.out.println(p1.name);
}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}