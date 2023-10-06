package ex04_sol;


public class MainClass2 extends Student {
	public static void main(String[] args) {
		/*
		 * 학생배열 생성 후 3명의 정보 입력 학생정보 출력 학생전체 총점 및 평균 출력
		 */
		
		Student[] students = new Student[3];
		int total = 0;
		double average = 0;
		//toString으로 인해서 private가 붙어있지만 값을 넣어줄 수 있음
		students[0] = new Student("James" , 54, 54, 54, 54);
		students[1] = new Student("Joe" , 87, 87, 87, 87);
		students[2] = new Student("Jacky" , 941, 4, 848, 34);
		
		for(Student s : students) {
			System.out.printf("%s,%d,%d,%d,%d,%d", s.getName(), s.getAge(), s.getKor(), s.getEng(),s.getMath(), s.getSum(),s.getAvg());
			System.out.println();
			total += s.sum();
		}
		average = (double)total/students.length;
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f", total, average);
	}

}
