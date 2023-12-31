package com.movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
	private static final File file = new File("reservation.txt");

	private long id; //발급 번호
	private long movieId; //영화 대표값
	private String movieTitle; //영화 제목
	private String seatName; //좌석 명
	
	public String getSeatName() {
		return seatName;
	}
	
	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}

	public Reservation(long movieId, String movieTitle, String seatName) {
		this(Instant.now().getEpochSecond(), movieId, movieTitle, seatName);
	}

	public static Reservation findById(String reservationId) {
		Reservation r =null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while( (line = reader.readLine()) != null ) {
				String[] temp = line.split(",");
				if(reservationId.equals(temp[0])) {
					r = new Reservation((Long.parseLong(temp[0])), (Long.parseLong(temp[1])), temp[2], temp[3]);
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	@Override
	public String toString() {
		return String.format("\n영화 : %s, 좌석 : %s", movieTitle, seatName);
	}

	public static Reservation cancel(String reservatonId) throws IOException {
		Reservation canceled = null;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		String text = ""; //참조하고 있지만(주소값있음) 비어있는 상태
		
		while( (line = reader.readLine()) != null) { //데이터가 없을때까지 쭉 읽어옴
			String[] temp = line.split(","); //파일 읽고 ,로 나눠서 배열에 저장시킴
			
			if(reservatonId.equals(temp[0])) {
				canceled = new Reservation((Long.parseLong(temp[0])), (Long.parseLong(temp[1])), temp[2], temp[3]);
				//삭제할 예매내역에 대한 정보가 canceled에만 저장되고 temp? 암튼 파일값에 저장되지는 않음 따라서 text에는 결국 삭제할 예매내역이 빠진 채 정보가 저장됨
			continue;
		}
			text += line + "\n";
//			만든 주소에 line과 같이 값을 넣어줌 -> continue된 객체는 데이터가 안들어감
			
		}
		reader.close();
		FileWriter fw = new FileWriter(file);
//		만든 주소에 line과 같이 값을 넣어줌 -> continue된 객체는 데이터가 안들어감 
//		==> 을 저장함~~
		fw.write(text);
		fw.close();
		//버퍼를 사용하면 항상 닫아줘야 데이터가 입력되는듯..?
		
		return canceled;
		//삭제할 예매내역에 대한 정보를 리턴함
	}

	public static List<Reservation> findByMovieId(String movieIdStr) throws IOException {
		//여러명이면 여러명정보를 받음...??? -> 같은 영화를 예매한 명단만 받..음...?
//		-> ex. 한 사람이 5명 자리 예매할 때
		List<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		while( ((line = reader.readLine()) != null) ) {
			String[] temp = line.split(",");
			if(movieIdStr.equals(temp[1])) { //reservation.txt에서 예매번호 index값이 1이라서
				long id = Long.parseLong(temp[0]);
				long movieId = Long.parseLong(temp[1]);
				String movieTitle = temp[2];
				String seatName = temp[3];
				
				Reservation reservation = new Reservation(id, movieId, movieTitle, seatName);
				reservations.add(reservation);
			}
		}
		reader.close();
		return reservations;
	}

	public Long getId() {
		return id;
	}

	public void save() throws IOException {
		FileWriter fw = new FileWriter(file,true);
		fw.write(this.toFileString() + "\n");
		fw.close();
	}

	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
	}
	
	
}
