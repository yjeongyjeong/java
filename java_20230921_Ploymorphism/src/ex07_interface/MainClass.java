package ex07_interface;

public class MainClass {
	public static void main(String[] args) {
		Printable prn = new LPrinter();
		//상위 클래스인 Printable은 자기 자신에게만 접근 가능한데 자신이 갖고있는 메서드를 Printer에서 오버라이딩했으므로 Printer(하위)에서 접근이 가능함
		
		String msg = "Hello World";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		
		//CSPrint타입이자 SPrinter로 생성된 p는 CS타입에만 접근할 수 잇음 CS안에는 cprint가 있는데 SPrinter에도 cprint가 있음 그리고 CSprint는 Printable을 상속받아서 print도 있는 상태임=> SPrint에도 print가 있음 => 둘다 오버리이딩되어서 SPrinter에 있는 메서드가 실행됨
		CSPrint p = new SPrinter();
		p.cprint(msg);
		p.print(msg);
		
		//아래의 경우 Printable에 print가 있는데 SPrinter에는 print, cprint가 있음 따라서 Sprint에 있는 print에는 접근가능(오버라이딩) 그러나 cprint는 Printable에 없는 애이므로 접근할 수 없는 영역의 데이터임
		Printable p2 = new SPrinter();
		p2.print(msg); 
		
	}
}
