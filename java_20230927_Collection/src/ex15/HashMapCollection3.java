package ex15;
//기본자료형은 sort로 정렬가능한데 내가만든 클래스의 형을 내가 정렬하고싶으면 comparable 구현해서 정렬하는 부분을 오버라이드하면 됨!
import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person implements Comparable{
	private String name;
	private int age;

	@Override
		public String toString() {
			return name + "("+ age + ")";
		}

	@Override
	public int compareTo(Object o) {
		//기존에 들어있는 데이터와 
		Person p = (Person)o; //형변환해야 person의 클래스 안에있는것들 사용할 수 잇음
//		if(this.age > p.age)
//			return 1;
//		else if(this.age < p.age)
//			return -1;
//		else
//			return 0;
//		위를 아래 한줄로 써도 가능
//		return this.age - p.age;
		return  p.age - this.age;
	}
}

public class HashMapCollection3 {
	public static void main(String[] args) {
		Person[] person = new Person[3];
person[0] = new Person("whwh", 40);
person[1] = new Person("dbql", 30);
person[2] = new Person("rhksdn", 35);
		Arrays.sort(person);
		for (Person p : person)
			System.out.println(p);

	}
}
