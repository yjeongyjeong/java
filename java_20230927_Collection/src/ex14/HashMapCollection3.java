package ex14;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person
{
	private String name;
	private int age;

	@Override
		public String toString() {
			return name + "("+ age + ")";
		}
}

public class HashMapCollection3 {
	public static void main(String[] args) {
		Person[] person = { new Person("whwh", 20), new Person("dbql", 30), new Person("rhksdn", 35) };

		Arrays.sort(person);
		for (Person p : person)
			System.out.println(p);

	}
}
