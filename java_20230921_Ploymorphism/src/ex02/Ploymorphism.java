package ex02;

public class Ploymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		
		myAnimal.animalSound(); //Animal 클래스에 있는 animalSound라는 메서드가 실행됨
		myPig.animalSound(); // 상위타입에서 하위타입으로 만들었기 때문에 하위 데이터에 접근할 수 없지만, 메서드가 오버라이딩되어있는 경우, 상위타입의 메서드가 실행되지 않고 하위타입에 있는 메서드가 실행된다. 따라서 Pig 클래스에 있는 animalSound가 실행됨
		myDog.animalSound(); // 위와 마찬가지
		
//		myAnimal.bark(); //상위에서 하위는 접근할 수 없음
		myPig.eat(); //하위에서 상위는 접근할 수 있음(상속받았으니까)
		
	}
}
