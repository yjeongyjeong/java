package ex02;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String con) { this.con = con;	}
	
	public Printable getPrinter() {
		return new Printer2();
	}
	
	private class Printer implements Printable{
		@Override
		public void print() {
			System.out.println(con);
		}
	}
	private class Printer2 implements Printable{
		@Override
		public void print() {
			System.out.println(con);
		}
	}
}

public class UseMemberInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메세지 출력해주세요.");
		
		Printable prn = p.getPrinter();
		prn.print();
		
//		상위클래스가 하위클래스 받아주는 것처럼.. 그리고 getPrinter에서 객체가 printer()가 아니라 printer2가 되어도 상관없음 내부로직이 뭐가되엇든 신경쓸 필요없다는 의미
		
		
		
//		내가 생각한 장점 : papers 객체 내의 클래스에 원래는 바로 접근할 수가 없는데 인터페이스를 구현한 클래스에서 인터페이스 형태로 객체를 만들게되면 papers 객체에 바로 접근이 가능한....? 동시에 아래 클래스를 사용할 수 있는 기분...? 그니까 이 말이 뭐냐면 인터페이스 객체를 만들었는데 바로 getprinter나 print를 사용할 수 있다는 의미...? 설명을 못하겠군..ㅜㅜ
//		인터페이스가 아니었다면 papers 객체를 만들고 그 객체를 받는 밑에 클래스 객체를 만들고 거기서 메서드 사용가능이니까......
		
	}
}
