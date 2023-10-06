package ex02;

public class Exam03 {
	public static void main(String[] args) {
		int[] myArr = new int[5];
		int[] myArr3 = new int[]{1,2,4};
		int[] myArr2 = {1,2,4};
		
		
		String[] myStr = new String[3];
		String[] myStr2 = {"g"};
		
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (int) (Math.random() * 100) + 1;
			System.out.println(myArr[i]);
		}
		for (int i = 0; i < myStr.length; i++) {
			System.out.println(myStr[i]);
		}

	}
}
