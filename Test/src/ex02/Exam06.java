package ex02;

public class Exam06 {
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		case 4: System.out.println("4"); break;
		default : System.out.println("default"); break;
		}
		
		// break 없으면 해당하는 부분 이후로 전부 출력시킴
	}

}
