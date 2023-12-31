package ex08_408_no6;
//printSound() 메소드는 매개변수 타입으로 Soundable 인터페이스를 가짐
//printSound()를 호출할 때 cat 과 dog객체를 주고 실행하면 각각 야옹과 멍멍 출력되도록 클래스 작성 
public class SoudableExample {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		System.out.println("------------------");
		//위의 new cat()은 아래와 동일
		//참조변수가 알아서 받아서 넣어주는 듯 
		//내 뇌피셜-> 대신 재사용할 순 없을 듯? 왜냐면 변수 이름이 없잖아..
		Soundable sound = new Cat();
		System.out.println(sound.sound());
	}
	
	/*일단 printSound라는 메서드는 인터페이스 타입을 매개변수로 받음
	 * 인터페이스 안에는 sound라는 메서드가 존재함->인터페이스 내의 메서드이므로 아무런 내용이 없음
	 * new Cat(), new Dog()는 각각 야옹과 멍멍을 출력해야하므로 오버라이딩해서 메서드의 내용을 바꿔줘야함
	 * 근데 인터페이스 타입을 매개변수로 받는거라면 new Cat은 인터페이스 타입이라는 건디
	 * Soundable a = new Cat(); 이렇게 생긴건가??
	 * 맞았다!
	 */
}
