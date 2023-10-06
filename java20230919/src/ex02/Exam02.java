package ex02;

public class Exam02 {
	public static void main(String[] args) {
		int[] myArr = new int[5];
		
		/*
		 * int num = (int)(Math.random()*100)+1; // 0과 1사이의 실수인데 1부터 100사이의 값이 나오게 하고
		 * 싶다면 100곱해서 두자리수 나오게 해주고 최대값이 99일테니 1더해서 최대값을 100으로 해주면 됨(최소값도 1이 되는 효과가 있나? 0.001이런식으로 나오면 00이니까....)
		 * System.out.println(num);
		 */
		
		for (int i = 0; i < myArr.length; i++){
			myArr[i] = (int)(Math.random()*100)+1;
			System.out.println(myArr[i]);
		}

		
		/*
		 * int[] myArr = new int[5]; 
		 * for (int i = 0; i < myArr.length; i++)
		 * System.out.println(myArr[i]); 
		 * //초기값은 0
		 */	}
}
