package ex01;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Ex01_sol {
public static void main(String[] args) {

	Person2 p1 = new Person2("나나나", 20);
	Person2 p2 = new Person2("나나나", 20);
	System.out.println(p1.equals(p2)); //false(해시코드앤이퀄스를 해주면 true로 나옴)
	System.out.println(p1.toString()); //@toString혹은 오버라이드 안해주 주소값이 나옴 이걸 내용이 나오도록 바꾸려면
	System.out.println(p1.toString()); //toString을 오버라이드해서 리턴값을 변경....

}
}
@Setter //@Data라는 어노테이션으로 한번에 만들수도 잇음 (조금 버그가 있어서 권장하진 않음->equals가 따로 재정의되어있어서 12번째 줄 true로 나옴)
@Getter
@ToString
class Person2{
	String name;
	int age;
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	


//	@Override
//	public String toString() {
//		return "Person2 [성명 = " + name + ", 나이 = " + age + "]";
//	}
	
	
}