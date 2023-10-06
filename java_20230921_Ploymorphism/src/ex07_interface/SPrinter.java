package ex07_interface;

public class SPrinter implements CSPrint{
//CS가 P를 상속받았으므로 여기선 다 구현
	@Override //어노테이션 상위클래스에 있는거 재정의함
	public void print(String msg) {
		System.out.println("삼성 프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.println("삼성 프린터 컬러 출력 : ");
		System.out.println(msg);
	}

	
}
