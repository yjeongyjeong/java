package ex10;

public class 동호회 extends 사람{
	String 종목;
	
	public 동호회(String 이름, int 나이,String 종목) {
		super(이름, 나이);
		this.종목 = 종목;
	}
}
