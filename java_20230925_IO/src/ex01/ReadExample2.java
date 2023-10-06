package ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("c:/data/test2.db");
		
		byte[] data = new byte[100];
		while(true) {
			int num = is.read(data); //is.read로 읽으면 한번에 읽어와서 while안해도 되긴함,,,
			if(num == -1) break;
			
			for(int i =0; i<num; i++) {
				System.out.println(data[i]);
			}
		} 
		is.close();
	}

}
