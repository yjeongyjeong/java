package ex02;
//선생님이 하신 것
public class Exam05 {
	public static void main(String[] args) {
		int[] students = new int[5];
		int total = 0;
		double avg = 0;

		for (int i = 0; i < students.length; i++) {
			students[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i]+" ");
			total += students[i];
		}
		avg = (double)total/students.length; //=>답이 실수가 나오도록
		System.out.println("\n총합 : " + total);
		System.out.printf("평균 : %.2f",avg);
		System.out.println();
		
		int max = students[0];
		int min = students[0];
		for(int i = 1; i<students.length;i++) {
			if(max<students[i])
				max = students[i]; // 큰값보다 크면 배열돌면서 큰값을 저장시킴
			if(min>students[i])
				min = students[i]; // 작은값보다 작으면 배열돌면서 작은값을 저장시킴
		}
		System.out.println("=============");
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
		
		//입력 데이터를 오름차순 정렬
		for(int i = 0; i<students.length;i++) {
			boolean flag = false;
			for(int j = 0; j<students.length-1;j++) {
				if(students[j]>students[j+1]) {
					int tmp = students[j];
					students[j] = students[j+1];
					students[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) break;
			//이미 값이 정렬되어잇는 경우 바로 끝나도록=> 정렬이 되어잇다면 if가 안돌테니까 flag값이 false로 남게됨 따라서 true라면 끝나도록함
		}
		System.out.println("정렬 데이터 : ");
		for(int i=0; i<students.length;i++) {
			System.out.print(students[i]+" ");
		}
	}
	
	
}
