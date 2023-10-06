package ex09_inher02;

public class BabyCat2 extends ParentCat{
	
	public String color;
	
	/* 눈에 보이지 않지만 이렇게 있는 것과 동일
	 * public BabyCat2() { super(); }
	 */	
	public BabyCat2(String breed, String color) {
		this.color = color;
	}
	
	void meow() {
		System.out.println("MEOW!!!");
	}
}
