package com.movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractMenu{

	private static final MainMenu instance = new MainMenu(null);
	private static final String MAIN_MENU_TEXT = 
			"1. 영화 예매하기\n"+
			"2. 예매 확인하기\n"+
			"3. 예매 취소하기\n"+
			"4. 관리자 메뉴로 이동\n"+
			"q. 종료\n"+
			"메뉴를 선택하세요 : ";
			
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);
	}
	/* 현재 MainMenu가 상속받은 abstract public class AbstractMenu implements Menu 클래스에 두 가지를 매개변수로 받는 생성자가 있음!
	 * public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}
	근데 위에서 객체 생성할때 null값을 줬으니까 menuText는 MAIN_MENU_TEXT의 값을 받고 prevMenu는 null값을 가짐
	=> mainapp에서 호출되는 main.print에서 받는 변수도 여기서 받는 MAIN_MENU_TEXT가 들어감
	 * */
	public static MainMenu getInstance() {
		return instance;
	}
//static!!
	
//MainApp에서 호출되는 next를 오버라이드(interface)
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "1" :
			reserve();
			return this; 
		case "2" :
			checkReservation();
			return this;
		case "3" :
			cancelReservation();
			return this;
		case "4" :
			if(!checkAdminPassword()) { //비번 맞으면 false라서 if가 안돌고 비번 틀리면 !false = true니까 if가 돔
				System.out.println(">> wrong password");
				return this; //입력화면으로 다시 돌려보냄
			}
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
/* abstract public class AbstractMenu implements Menu 에서 
 * public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}
 * */
			return adminMenu;
			
		case "q" : return prevMenu; //null값이 들어가 잇는 상태
//		prevMenu가 protected로 되어잇어서 같은 패키지내에 상속받는 관계니까 불러올 수 있음
		default : return this;
		}
	}
	private void reserve() {
		try {
			List<Movie> movies = Movie.findAll();
			for(Movie movie : movies)
				System.out.printf("%s\n", movie);
			System.out.println("예매할 영화를 선택하세요 >>");
			String movieIdStr = sc.nextLine();
			Movie m = Movie.findById(movieIdStr); //영화목록에 있는지 체크해서 번호, 이름, 장르를 Movie 객체로 받아옴
			
			List<Reservation> reservations = Reservation.findByMovieId(movieIdStr);
			Seats steats = new Seats(reservations);
			steats.show(); //현재 좌석상태를 보여줌
			
			System.out.println("좌석을 선택하세요(예: A-1) >>");
			String seatName = sc.nextLine();
			steats.mark(seatName);
			//좌석을 선택했으면 값을 저장시켜야 함
			Reservation r = new Reservation(Long.parseLong(movieIdStr), m.getTitle(), seatName);
			r.save();
			System.out.println(">> 예매가 완료되었습니다.");
			System.out.printf("예매번호 : %d\n", r.getId());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void cancelReservation() {
		System.out.println("예매번호를 입력하세요 >>");
		try {
			Reservation r = Reservation.cancel(sc.nextLine());
//			삭제할 예매내역에 대한 정보를 리턴받음
			if(r != null) { //null값이 아니면 (=삭제할 예매내역에 대한 정보 리턴받음) 예매내역 정보출력 
				System.out.printf(">> [취소 완료] %s의 예매가 취소되었습니다.\n", r);
			} else { //입력한 아이디랑 맞는 예매내역이 존재하지 않는다면
				System.out.println("예매 내역이 존재하지 않습니다.");
			}
		} catch (Exception e) { //걍 에러나면
			System.out.println(">> 파일 입출력에 문제가 생겼습니다.");
		}
	}
	
	private void checkReservation() {
		System.out.println("예매번호를 입력하세요 >>");
		try {
			Reservation r = Reservation.findById(sc.nextLine());
			if(r != null) {
				System.out.printf(">> [확인 완료] %s\n", r.toString());
			} else { //r이 null
				System.out.println(">> 예매 내역이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println(">> 파일 입출력에 문제가 발생했습니다.");
		}
	}
	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 >>");
		return "11".equals(sc.nextLine());
//		입력한 값과 admin1234와 같은지 확인하는 boolean 타입의 메서드 맞으면 ture, 틀리면 false
	}

}
