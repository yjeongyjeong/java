package ex02;

public class Exam09_sol {
public static void main(String[] args) {
	int[] numA = new int [10];
	int[] numB = new int [10]; //int배열의 초기값은 0
	
	for(int i = 0; i<numA.length;i++)
		numA[i] = (int)(Math.random()*10);
	
	for(int i = 0; i<numA.length;i++)
		System.out.print(numA[i] + " ");//뽑힌애들
	
	System.out.println();
	System.out.println();
	for(int i = 0; i<numA.length;i++) //빈도수
		numB[numA[i]]++;
	//처음값에 만약에 1이 들어있었다면(numA[0] =1이라면) numB의 1번째에 +1을 해줌
	
	for(int i = 0; i<numA.length;i++)
		System.out.printf("%d의 개수 : %d\n",i,numB[i] );
}
}
