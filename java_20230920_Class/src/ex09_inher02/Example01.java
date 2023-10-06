package ex09_inher02;

public class Example01 {
	public static void main(String[] args) {

		BabyCat catObj = new BabyCat("샴 고양이", "초콜릿색");
		
		catObj.eat();
		catObj.meow();
		System.out.println(catObj.breed);
		System.out.println(catObj.color);

		BabyCat2 catObj2 = new BabyCat2("샴 고양이", "초콜릿색");
		
		catObj2.eat();
		catObj2.meow();
		System.out.println(catObj2.breed); //null값됨
//		왜냐하면 babycat2에 매개변수 받는 생성자가 있는데... 음...?
		System.out.println(catObj2.color);
	}
}
