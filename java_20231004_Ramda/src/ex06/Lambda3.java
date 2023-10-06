package ex06;

interface Printable3 {
	void print(String msg);
//	void add(int a); 근데 두개면 어케 -> 람다식이 뭘 받아야할지 모름 -> functionalInterface를 붙여서 에러를 방지
}

public class Lambda3 {
	public static void main(String[] args) {
		// new printable3일게 뻔하니까.. 이름을 지움
		// 오버라이딩된것도 지우고 내용만 받아서 바꿈
		// String도 지워버림+문장이 하나면 중괄호 없어도 됨! 따라서
		Printable3 prn =  
				(msg) -> System.out.println(msg);
		
		prn.print("msg print3");		
	}
}
