package ex07_interface;

public class LPrinter implements Printable{

	@Override
	public void print(String msg) {
		System.out.println("엘지 프린터 흑백 출력 : ");
		System.out.println(msg);
	}

}
