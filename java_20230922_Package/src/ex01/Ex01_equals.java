package ex01;

public class Ex01_equals {
public static void main(String[] args) {

	Person3 p1 = new Person3("나나나", 20);
	Person3 p2 = new Person3("나나나", 20);
	System.out.println(p1.equals(p2)); //true
}
}
class Person3{
	String name;
	int age;
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	System.out.println(p1.equals(p2)); 
//Person p2 = new Person("나나나", 25);
// Object obj = p2;
	@Override //없으면 오류가 나진 않지만 오브젝트에 있는 equals가 사용됨! 따라서 의도한 true값이 아니라 false값이 나옴
	public boolean equals(Object obj) {
		Person3 p = (Person3)obj; //다운캐스팅 name이랑 age에 접근하기 위해서 object->person3로 만들어줌
//		Object가 상위지만 8개 메서드만 존재하니까 person의 메서드는 없음 따라서... 다운캐스팅을 해준다
		return this.name.equals(p.name) && this.age == p.age;
		//this는 p1, obj는 p를 받음
		//name은 이퀄스를 사용하고 this는 ==를 사용한 이유는 한글파일 참고...
		
		
		//name은 String이라 이퀄스를 사용하고 age는 int라서 직접 비교
		//String은 스트링풀에 있는애들로 비교하면 되니까
	}
}