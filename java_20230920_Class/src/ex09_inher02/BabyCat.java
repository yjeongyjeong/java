package ex09_inher02;

public class BabyCat extends ParentCat{
	
	public String color;
	
//	public BabyCat();를 아래처럼 수정해야 example01에 있는 객체 생성가능
	public BabyCat(String breed, String color) {
		super(breed); 
		this.color = color;
		//변수를 s1, s2로 해도 상관없음! 이름 일치해야하는 줄 알았는데 달라도 형이 같으면 알아서 인식되는듯
	}
	
	void meow() {
		System.out.println("MEOW!!!");
	}
}
