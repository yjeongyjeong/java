package ex02;

public class Exam15 {
	public static void main(String[] args) {
		addition(3,4);
		int result = subtraction(5,2);
	}

	static void addition(int i, int j) {
		System.out.println("더하기 : "+ (i+j));
	}

	static int subtraction(int i, int j) {
		System.out.println("빼기 : "+(i-j));
		return 1;
		//자바에서는 0이 false 1이 true
	}
}

/*
 * 아래처럼 출력되도록하기 
 * 더하기 : 7 빼기 : 3
 * 
 * 
 * 
 * 선생님은 
 * static int sub~(i,j){
 * return i-j하고 sysout 빼기를 add쪽으로 올림
 */



