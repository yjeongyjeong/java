package com.movie;

import java.util.List;

public class AdminMenu extends AbstractMenu {

	private static final AdminMenu instance = new AdminMenu(null);
	private static final String ADMIN_MENU_TEXT = "1. 영화 등록하기\n" + "2. 영화 목록보기\n" + "3. 영화 삭제하기\n" + "b. 메인 메뉴로 이동\n"
			+ "메뉴를 선택하세요 : ";

	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}

	public static AdminMenu getInstance() {
		return instance;
	}
	
	//MainApp에서 호출되는 next를 오버라이드(interface)
	@Override
	public Menu next() {
		switch (sc.nextLine()) {
		case "1": // 영화 등록
			createMovie();
			return this;
		case "2": // 2. 영화 목록보기
			printAllMovies();
			return this;
		case "3":
			deleteMovies();
			return this;
		case "b":
			return prevMenu; // mainMenu가 나옴
		default:
			return this; // admin_menu_text가 계속 나옴
		}
	}

	private void deleteMovies() {
		System.out.println("영화 리스트 : ");
		printAllMovies();
		System.out.println("삭제할 영화를 선택하세요 >>");

		try {
			Movie.delete(sc.nextLine()); //다음에 입력할 애(sc)를 삭제할 것
			System.out.println(">> 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(">> 삭제에 실패하였습니다.");
		}
	}

	private void createMovie() {
		System.out.println("제목 : ");
		String title = sc.nextLine();

		System.out.println("장르 : ");
		String genre = sc.nextLine();

		Movie movie = new Movie(title, genre);
		try {
			movie.save(); // text 파일에 저장시키는 메서드
			System.out.println(">> 등록되었습니다.");
		} catch (Exception e) {
			System.out.println(">> 실패하였습니다.");
		}
	}

	private void printAllMovies() {
		try {
			List<Movie> movies = Movie.findAll();
			for (Movie movie : movies)
				System.out.printf("%s\n", movie.toString());
//			movie에서 toString으로 오버라이딩한 애들 전부를 %s로 받고 다음에 줄바꿈하겠다는 의미
		} catch (Exception e) {
			System.out.println("데이터 접근에 실패하였습니다.");
		}
	}

}
