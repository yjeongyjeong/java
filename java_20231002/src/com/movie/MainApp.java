package com.movie;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		
		Menu menu = MainMenu.getInstance();
		//Menu가 인터페이스인걸 눈치채고 와일안에 print랑 next가 있으므로 인터페이스내에 만들어주기
//		print는 아무런 값을 반환하지 않고 끝나므로 void(반환타입없음) 또한 menu.next가 menu로 받아지므로 menu타입으로 받아줌
//		MainMenu.get~ -> new로 생성하지 않고 static이므로 바로 객체를 생성한다는 의미(싱글톤패턴으로 호출하면 사용하겠다는 의미)
//		MainMenu 클래스에서 getInstance를 정의했는데 mainmenu에 null값을 넣어서 mainmenu객체를 생성 -> MainMenu(Menu prevMenu)생성자를 통해 객체를 생성하는데 이 객체는 다시 abstractmenu로 가서 값을 받음 
		
		
		/*
		 * menu는 print와 next()의 기능을 할 수 있는데 print와 next가 전부 오버라이드 되어있음
		 * 따라서 print는 abstractmenu의 print가 동작되는데 출력되는 변수인 menuText는 MainMenu라는 클래스에서 생성된 객체가 가지고 있음*/
		while(menu != null) { //menu가 null이면 false => 반복이 끝남! 메뉴창이 더이상 뜨지않음!
			menu.print(); //반환타입 없음 => void
			menu = menu.next(); //Menu의 menu로 받음 => 반환타입 Menu
		}
		System.out.println("프로그램이 종료됩니다.");
	}

}
