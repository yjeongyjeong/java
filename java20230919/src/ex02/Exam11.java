package ex02;

public class Exam11 {
	public static void main(String[] args) {
		String myStr1 = "java";
		String myStr2 = "java";
		
		System.out.println(myStr1 == myStr2); //true
		
		String myStr3 = new String ( "java");
		String myStr4 = new String ("java" );
		
		System.out.println(myStr3 == myStr4); //false
		
		System.out.println(myStr3.equals(myStr4)); // true
		//저장된 데이터까ㅣ지 보는 의ㅣㅁ 그냥 비교하면 에러남(같은애라서)
		
	}
}
