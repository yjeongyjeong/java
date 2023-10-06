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
	
	public Movie(String title, String genre) {
		this(Instant.now().getEpochSecond(), title, genre);
	}
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}
	public static List<Movie> findAll() throws IOException{
		List<Movie> movies = new ArrayList<Movie>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = reader.readLine()) != null) {
			String[] temp = line.split(",");
			Movie movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
			
			movies.add(movie);
		}
		reader.close();
		return movies;
	}
	
	@Override
	public String toString() {
		return String.format("[%d] : %s(%s)",id,title,genre);
	}

	public void save() {
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(this.toFileString()+"\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String toFileString() {
		return String.format("%d,%s,%s", id,title,genre);
	}

	public static void delete(String movieId) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		String text = "";
		
		while((line = reader.readLine()) != null){
			String[] temp = line.split(",");

			if(movieId.equals(temp[0]))
				continue;
			
			text += line + "\n";
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
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(movieId.equals(temp[0])) {
					movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
					break;
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}
}

















