package ex01;

public class Ex01_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Programming"); //hello에 문자열 programming추가
		System.out.println(sb);
		
		sb.insert(6, "java "); //여섯번째에 문자열 삽입
		System.out.println(sb);
		
		sb.replace(1, 4, "Good"); //인덱스 1부터 네번째까지 문자열 good으로 변경
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb); //1~5까지 삭제
		
		sb.reverse();
		System.out.println(sb); //문자열 역순으로 출력
		
		
		
		Integer intJ = null; //에러안남 => 객체라서 참조하는 값이 없다는 의미
//		int i = null; //에러남 객체 아닌데 null이라,,
	}
}
