package ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/data/test4.txt");
		
//		while(true) {
//			int read = reader.read();
//			if(read==-1) break;
////			System.out.print(read); //아스키코드로 나옴
//			System.out.print((char)read);
//		}
//		reader.close(); 
		
	
		//위에처럼 한글자씩 말고 한번에 읽어오기
//		reader = new FileReader("c:/data/test4.txt");
		char[] data = new char[50];
		while(true) {
			//파일읽기
			int num = reader.read(data);
			if(num == -1) break;
			//파일출력하기
			for(int i = 0; i<num; i++) 
				System.out.print(data[i]);
				System.out.println("\n---------------");
			
		}
		reader.close();
	}
}
