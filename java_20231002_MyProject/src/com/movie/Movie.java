package com.movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Movie {

	private long id;
	private String title;
	private String genre;
	
	private static final File file = new File("movies.txt");
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	
	public Movie(String title, String genre) {
		this(Instant.now().getEpochSecond(), title, genre);
	}

	public static List<Movie> findAll() throws IOException{
		List<Movie> movies = new ArrayList<Movie>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		while( (line = reader.readLine()) != null ) { //null값이면 끝남
			String[] temp = line.split(",");
			Movie movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
			movies.add(movie);
		}
		reader.close();		
		return movies;
		//buffer : buffer가 잇으면 java랑 file이 경로 오가면서 파일 인풋 아웃풋하는데 buffer가 잇으면 한번에 가져와서 속도 향상이 빨랐던거같은데 잘모르겠군 
		/* Scanner와 달리 BufferedReader는 개행문자만 경계로 인식하고 입력받은 데이터가 String으로 고정된다. 그렇기 때문에 따로 데이터를 가공해야하는 경우가 많다. 하지만 Scanner보다 속도가 빠르다!
		 * BufferedReader를 통해 읽어온 데이터는 개행문자 단위(Line 단위)로 나누어진다
		 * */
	}
	
	@Override
	public String toString() {
		return String.format("[%d] : %s(%s)", id, title, genre);
	}

	public void save() {
		try {
			FileWriter fw = new FileWriter(file,true);
//			FileWriter fw = new FileWriter(file); 이대로 하면 입력된 애들만 저장되어서 영화등록한 파일 하나만 저장되고 기존에 있던게 사라지게 됨 그리고 file, true하면 안되고 file,true로 해야 내가 생각한대로 저장이 되네.. 왜일까 띄어쓰기가 무슨차이인걸까... 오류인가...
/* FileWriter(File file, boolean append)
 * file : the File to write  입력받을 파일
 * append if true, then bytes will be written to the end of the file rather than the beginning
 * true값을 준다면 파일데이터 마지막에서 시작한다는 의미
 * */
			fw.write(this.toFileString()+"\n"); //저장하고 줄바꿈 한다는 의미
//movies.txt 저장할 때 한칸띄고 저장시킴
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}

	public static void delete(String movieId) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		String text = ""; //참조하고 있지만 비어있는 상태
		
		while( (line = reader.readLine()) != null) {
			String[] temp = line.split(","); //파일 읽어서 배열에 저장시킴
			
			if(movieId.equals(temp[0])) 
				continue; //입력한 값이(삭제할 아이디) 저장된 아이디와 동일하면 파일을 읽지 않음
			
			text += line + "\n";
//			만든 주소에 line과 같이 값을 넣어줌
			
		}
		reader.close();
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.close();
	}

	public static Movie findById(String movieId) {
		Movie movie = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			
			while( (line = reader.readLine()) != null ) {
				String[] temp = line.split(",");
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
				break; //break값이 if문 밖에 잇으면 안됨! -> null값으로 받아오게 되는 듯...?
//				if 조건대로 값이 같으면 값을 movie라는 곳에 저장하고 그대로 if에 남아잇어서 그러는걸까?
				}
				//읽어온값을 배열형태로 movie라는 객체에 담음
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}
}
