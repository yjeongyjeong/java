package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws IOException {
		OutputStream os  = new FileOutputStream("c:/data/test2.db");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array);
		os.flush(); //버퍼클리어
		/*
		 * FileWriter내부 버퍼의 내용을 파일에 wireter한다. flush를 호출하지 않으면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상호아이 나올 수 잇다. 즉 메소드는 버퍼에 데이터가 가득차있건 아니건 버퍼에서 강제로 밀어내도록 하는 메소드이다.
		 * */
		os.close();
	}
}
