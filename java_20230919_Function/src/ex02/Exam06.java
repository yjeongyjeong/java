package ex02;

public class Exam06 {
//로또만들기 : 1~45까지 6개 값 중복안되게!! 출력
	public static void main(String[] args) {
		/* 생각해보기... 먼저 random을 사용해서 1~45까지의 랜덤값을 출력하게 함
		 * 중복 데이터가 있으면 안되니까 boolean flag값을 사용하면 될 것 같음
		 * => 중복된 for문을 사용해서 for i번째와 j를 쭉 비교해서 중복이 있다면 true가 나오도록
		 * 중복이 없으면 끝!
		 * for()
		 * 	for(){
		 * if(i번째==j번째)
		 * 다시 랜덤숫자 뽑는 코드(재귀함수?->그럴려면 메서드로 뽑아내야함)
		 * flag=true;
		 * 
		 * }
		 * if(!flag) break; : 중복 없으면 끝
		 * 
		 * 이걸 아래에 짜봤는데 재귀함수 내용이 중복되는게 아쉬움
		 */
		
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;

		}
		
		for(int i=0; i<num.length;i++) { // i왜 데드코드된걸까.. 중복 나오는데?ㅋㅋ;
			boolean flag = false;
			for(int j=0;j<num.length;j++) {
			if(num[i] == num[j]) {
				randomVal();
				System.out.print(num[j]+" ");
				flag = true;
			}
			}
			if(!flag)
				System.out.println(num[i]+" ");
				break;
		}
	}
	
	static int[] randomVal() {
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i]+" ");
		}
		return num;
	}
}
