package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConverterStreamExample {
	public static void main(String[] args) throws IOException {
		String str = "노인과 부녀자 등 21명을 연쇄 살인해 사형을 선고받고";
		write(str);
		String data = read();
		System.out.println(data);
	}
	
	static void write(String str) throws IOException{
		OutputStream os = new FileOutputStream("c:/data/test2.txt");
		
		Writer writer = new OutputStreamWriter(os, "utf-8");
		/* OutputStreamWriter(OutputStream out, String charsetName) 
		 * Parameters:
		 * out : An OutputStream
		 * charsetName : The name of a supported charset
		 * 
		 * utf-8로 하면 3byte씩 읽어옴
		 * */
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	static String read() throws IOException{
		InputStream is = new FileInputStream("c:/data/test2.txt");
		Reader reader = new InputStreamReader(is, "utf-8");
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
		/* String(char[] value, int offset, int count)
		 * Parameters:
		 * value : Array that is the source of characters
		 * offset : The initial 
		 * offsetcount : The length
		 * data라는 배열을 0번째부터 num까지 읽어서 문자열로 저장
		 * */
		
		return str;
	}
}
