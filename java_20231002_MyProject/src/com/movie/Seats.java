package com.movie;

import java.util.List;

public class Seats {
	public static final int MAX_ROW = 5;
	public static final int MAX_COL = 9;
	private String[][] map = new String[MAX_ROW][MAX_COL]; 
	//5줄 9칸 2차원 배열 생성 map[0][0] ~ map[4],[8]
	
	public Seats(List<Reservation> reservations) throws Exception {
		for(int i = 0; i < MAX_ROW; i++)
			for(int j = 0; j < MAX_COL; j++)
				map[i][j] = "0"; //모든 좌석이 전부 비어있는 상태(모든좌석이 0인 상태)
		for(int i = 0; i <reservations.size(); i++) { //여러명이 예매한경우
			Reservation r = reservations.get(i);
			String seatName = r.getSeatName(); //reservation파일에 있는 좌석번호가 r.getSeatName에 저장되어잇음
			mark(seatName); //mark가 자기 호출한애한테 예외던져서 얘도 그냥 던져버림
			
		}
	}

	public void mark(String seatName) throws Exception {
		char[] temp = seatName.toCharArray(); // 예를 들어 A-4라는 값이 들어오면 A, -, 4로 배열이 저장된다는 의미
//		A-4라는 배열이 있다면 배열로 치면 => [0][3]
//		따라서 A(65)에서 A(65)를 빼면 0이고 4에서 1빼면 3
		int row = temp[0] - 'A';
		int col = temp[2] - '1';
		
		if("X".equals(map[row][col]) ) {
			throw new Exception("이미 예매된 좌석입니다.");
			
		}
		
		map[row][col] = "X";
	}

	public void show() {
		System.out.println("-------------------------");
		System.out.println("-------S C R E E N-------");
		System.out.println("-------------------------");
		for(int i = 0; i < MAX_ROW; i++) {
			System.out.printf("%c", 'A'+i); //아스키코드 
			for(int j = 0; j < MAX_COL; j++) {
				System.out.printf(" %s", map[i][j]);
			}
			System.out.println();
		}
		System.out.println("  1 2 3 4 5 6 7 8 9");
	}
}
