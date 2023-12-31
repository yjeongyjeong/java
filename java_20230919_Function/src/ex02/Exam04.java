package ex02;

import java.util.Arrays;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 * 1. 랜덤메서드를 통해서 5명 학생 점수를 입력받고 5명 점수 총점과 평균 구하기
		 * 2. 최대값 최소값 구하기-> 나는 정렬하고 0번째랑 마지막을 구함 sort메서드를 사용했는데
		 * if문 사용해서 직접 정렬해도 괜찮을 듯
		 * 구글링하면,, 다양한 방법이 있음,, 
		 * 3. 입력 데이터 오름차순 정렬
		 */
		int[] myArr = new int[5];
		int total = 0;
		int average = 0;


		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (int) (Math.random() * 100) + 1;
			System.out.print((i + 1) + "번째 학생의 점수 : " + myArr[i] + " ");
			total = total + myArr[i];
			System.out.println("누적합계 : " + total);
			
		}
		//두값을 비교하면서 아니면 뒤로가게 만들고 싶음
		int temp = 0;
		for(int i = 0; i<myArr.length;i++) {
			boolean flag = false;
			for(int j = 0; j<myArr.length-1;j++) {
				if(myArr[j] > myArr[j+1]) {
					temp = myArr[j];
					myArr[j] = myArr[j+1];
					myArr[j+1] = temp;

				//왜 비교를 하다마는걸까=> 내가 두개만 골라 비교해서 그럼!!! => for문 두개써서 하나 고정하고 나머지값과 전체비교하면서 정렬하기ㅠ
					flag = true;
				}
			}
			//j값 도는거 보면... 한번만 돌고 끝나는 건가?
			if(!flag) break;
			//이미 값이 정렬되어잇는 경우 바로 끝나도록=> 정렬이 되어잇다면 if가 안돌테니까 flag값이 false로 남게됨 따라서 true라면 끝나도록함
		}
		
		
		for(int i = 0; i<myArr.length;i++) {
				System.out.print(" "+myArr[i]);
		}
		Arrays.sort(myArr);
		System.out.println("\n===============================");
		System.out.println("최소값 : "+ myArr[0] + " 최대값 : "+myArr[4]);
		
		System.out.println("총합 : " + total);
		average = total / myArr.length; //for안에서만 살아있는줄..
		System.out.println("평균 : " + average);

	}

	
	
	
	
	
	// 쌤방법보고 피드백 -> 평균을 더블로 하는게 나았을 것 같음!
	
/*	선생님 방법
	int[] students = new int[5];
	int total = 0;
	double avg = 0;

	for (int i = 0; i < students.length; i++) {
		students[i] = (int) (Math.random() * 100) + 1;
	}
	for (int i = 0; i < students.length; i++) {
		sysout(students[i]+" ");
		total += students[i];
	}
	avg = (double)total/students.length; =>답이 실수가 나오도록
	sysout(total);
	sysout(%.2f,avg);
*/
}
