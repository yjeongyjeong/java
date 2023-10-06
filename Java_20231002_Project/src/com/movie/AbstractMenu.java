package com.movie;

import java.util.Scanner;

abstract public class AbstractMenu implements Menu{

	protected String menuText; //기본문구
	protected Menu prevMenu; //이전 메뉴
	
	protected static final Scanner sc = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevmenu) {
		this.menuText = menuText;
		this.prevMenu = prevmenu;
	}

	@Override
	public void print() {
		System.out.print("\n" + menuText);
	}

	public void SetPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}
}
