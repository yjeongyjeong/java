package ex10;
//공통되는 부분을 상위클래스로 만들음
public class 사람 {
	private String 이름;
	int 나이;
	
//	public 사람() {
//		
//	}
	
	public 사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	
	public void 사람info() {
		System.out.println("=========");
		System.out.println(이름);
		System.out.println(나이);
	}
//	사실 직접 변수에 접근하지말고 getter setter를 통해서 왔다갔다 해야함
//	public String get이름() {
//		return 이름;
//	}
//	public int get나이() {
//		return 나이;
//	}
	

}
