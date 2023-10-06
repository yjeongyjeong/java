package com.movie;

import java.util.Scanner;

abstract public class AbstractMenu implements Menu{ 
//	원래 implements를 하면 내부의 메서드들을 전부 구현해야 하는데 전부하기 싫고 하나만 구현하려면 이 클래스도 추상으로 만들어주면 됨

	protected String menuText; //기본문구
	protected Menu prevMenu; //이전 메뉴
	protected static final Scanner sc = new Scanner(System.in);

	//생성자
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}

	@Override
	public void print() {
		System.out.print("\n" + menuText);
	}
//	인터페이스에 있는 next()는 구현하지 않음->abstract로 해서 얘도 추상클래스로 만들어줌
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}

}
