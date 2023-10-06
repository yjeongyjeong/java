package ex03;

interface Printable{
	void print();
}
//로컬이너클래스 : 메서드안에 클래스 집어넣음 printer를 다른데서 사용하는데가 없고 printable에서만 사용하는 경우....?
//밖에서 생성불가능 심지어 paper에서도 생성 불가능 메서드 안에서만 생성가능함
class Papers{
				//	Printer p = new Printer(); 에러남
	private String con;
	public Papers(String con) { this.con = con;	}
	
	public Printable getPrinter() {
		class Printer implements Printable{
				//			Printer p = new Printer(); 에러안남
			@Override
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	
	}
}

public class UseLocalInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메세지 출력해주세요.");
		
		Printable prn = p.getPrinter();
		prn.print();
				
	}
}
