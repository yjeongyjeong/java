package ex10;

public class 전화번호명단 {
	public static void main(String[] args) {
		대학동창 조 = new 대학동창("조조", 30, "컴퓨터 공학");
//		조.전공 = "컴퓨터 공학";
//		조.이름 = "조조";
//		조.나이 = 30;
//		System.out.println(조.get이름());
		
		조.사람info();
//대학동창이라는 곳에도 같은 애가 있음! 따라서 사람으로 안가고 대학동창에 있는 사람info를 함 
		
		동호회 동 = new 동호회("동동", 33, "피자먹기");
		동.사람info();
	}

}
