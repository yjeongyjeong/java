package ex02;
// 0, 1, 2, ... 9의 개수가 몇개인지 쭉 적어주기,,,
public class Exam09 {
	public static void main(String[] args) {
		int[] numA = new int[10];

		for (int i = 0; i < numA.length; i++)
			numA[i] = (int)(Math.random()*10); 

		for (int i = 0; i < numA.length; i++)
			System.out.print(numA[i] + " ");
		
		for(int i=0; i<numA.length; i++) { 
//			boolean flag = false;
			int k = 0;
			for(int j=0;j<numA.length;j++){
				if(numA[i] == numA[j]) {
					k++;
//					flag = true;
				}
			}
			System.out.printf("\n%d의 개수 : %d\n",i,k );
			//왜멈추냐!?!? 0번째만 되고 그 뒤로 안됨..i++이 데드코드가 된 이유가 뭘까..
//			if(!flag) 
//				System.out.println("중복 없음");
//				break;
		}
		

	}
}
