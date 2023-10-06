package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
//파일 만드는게 output이네.. 읽어오는게 input이고...!
/*
 * 자바에서 입출력 진행하려면 한쪽에서 다른쪽으로 전달하는 무언가가 필요-> 스트림 -> 동시불가
 * 그래서 파일 만드는게 만들고 스트림으로 보내야하니까 output 파일 읽는게 파일을 스트림으로 가져와야 하니까 input?*/
	public static void main(String[] args) {
		//타입이 다른데 받을 수 있는건 상속관계라는 의미(클래스 혹은 인터페이스)
		try {
			OutputStream os = new FileOutputStream("c:/data/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a); //1byte씩 출력
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");
	}

}
