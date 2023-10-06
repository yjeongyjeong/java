package ex03;

import java.io.File;
import java.io.IOException;

public class ExceptionEx02 {
	public static void main(String[] args) throws IOException {
		File file = new File("member.txt");
		
		if( ! file.exists() ) {
			file.createNewFile();
		}
	}
}
