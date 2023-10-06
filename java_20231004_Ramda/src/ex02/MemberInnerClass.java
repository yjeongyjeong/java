package ex02;
class Outer3{
	private int num = 0;
	class Member{
		void add(int n) { num += n; } //this로 num에 접근할 수 없음...
		int get() { return num; }
	}
}

class Outer4{
	private int num = 0;
	class Member{
		void add(int n) { num += n; } 
		int get() { return num; }
	}
}
public class MemberInnerClass {

	public static void main(String[] args) {
//		아까와 달리 static이 아니지만 class Member 안에 같은게 두개있음
//		또한 얘는 member 클래스 객체를 사용하고 싶어서 객체를 만들려고 해도 num이 outer에 있으니까 outer객체를 먼저 만들고 member 객체를 만들어줘야 함
//		아까처럼 전부 static이엇다면 outer3.member 로 객체 만들기 가능
		
		Outer3 o1 = new Outer3();
		Outer3 o2 = new Outer3();
		
//		Outer3.Member why = new Outer3(). : member가 안나옴
		Outer3.Member m1 = o1.new Member();
		Outer3.Member m2 = o1.new Member();
		Outer3.Member m3 = o2.new Member();
		Outer3.Member m4 = o2.new Member();
		
//		o1. : member 쓸 수 없음
		m1.add(5);
		System.out.println(m1.get());
		m2.add(15);
		System.out.println(m2.get()); 
//		outer3에 있는 num을 같이 사용하기 때문에 15를 사용하면 num = 5 + 15의 값이 나오게 됨.. 왜 공유하느냐 둘 다 o1의 객체로 생성햇기 때문에
//		클래스 안에 클래스 집어넣어서 왜 이렇게 사용하냐?? => 외부에 굳이 노출시킬 필요가 없을 때 사용함
		
		m3.add(1);
		System.out.println(m3.get());
		m4.add(15);
		System.out.println(m4.get());
//		마찬가지로 얘네는 o2를 같이 공유
		
	}
}
