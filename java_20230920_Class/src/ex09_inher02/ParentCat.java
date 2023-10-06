package ex09_inher02;

public class ParentCat {
	public String breed;
	
	public ParentCat() {}
	
	public ParentCat(String breed) { //babycat에서 super로 breed넘겨줬으니까 문자열 하나 받는 생성자 만들어줌
		this.breed = breed;
	}
	
	void eat() {
		System.out.println("EATING");
	}
}
