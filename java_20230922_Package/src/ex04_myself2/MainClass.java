package ex04_myself2;

import java.util.Scanner;

public class MainClass extends Student {
	public static void main(String[] args) {
		/*
		 * 학생배열 생성 후 3명의 정보 입력 학생정보 출력 학생전체 총점 및 평균 출력
		 */
		Scanner scstudent = new Scanner(System.in);
		System.out.println("정보를 입력할 학생의 수를 입력해주세요 >>");
		int studentCount = scstudent.nextInt();
		Student[] students = new Student[studentCount];

		// 학생수만큼 학생객체 생성+값넣기+
		/*
		 * 원래 student객체에 값을 입력받고 값을 넣어주고 배열을 만들어서 넣은 값을 배열에 넣고 출력해줌 그리고 모든 동작을 할 떄 for로 넣을 생각을 안함
		 * 이번에는 배열을 먼저 학생수만큼 만들고, 만들어진 배열안에 객체를 집어넣음
		 * 객체를 만들고 값을 넣는것을 전부 for반복으로 돌리고 입력받은 배열을 나중에 한꺼번에 출력함
		 * 기본생성자,필드생성자?, getter setter, toString을 했는데 기본생성자는 이 클래스에서 딱히 생성자를 만들지 않았으므로 안만들어도 상관없긴함
		 * 필드생성자는 내가 값을 입력한다면 필요하겠지만 나는 for과 scanner를 이용해서 입력했으므로 사실 이것도 굳이 필요하진 않음
		 * getter setter는 private변수들이기 때문에 값을 여기서 입력받고 저장하려면 필요!!
		 * toString은 출력 시 사용되었으므로 필요!!
		 * */
		
		for (int i = 0; i < studentCount; i++) {
			students[i] = new Student();
//			System.out.println(students[i]); //toString 된 상태로 출력
			Scanner sc = new Scanner(System.in);

			System.out.println((i + 1) + "번째 학생의 이름을 입력하세요");
			String name = sc.next();
			students[i].setName(name);
			System.out.println((i + 1) + "번째 학생의 나이을 입력하세요");
			int age = sc.nextInt();
			students[i].setAge(age);
			System.out.println((i + 1) + "번째 학생의 국어점수를 입력하세요");
			int kor = sc.nextInt();
			students[i].setKor(kor);
			System.out.println((i + 1) + "번째 학생의 영어점수를 입력하세요");
			int eng = sc.nextInt();
			students[i].setEng(eng);
			System.out.println((i + 1) + "번째 학생의 수학점수을 입력하세요");
			int math = sc.nextInt();
			students[i].setMath(math);
			students[i].sum();
			students[i].avg();
			
			System.out.println("\n입력이 완료되었습니다.\n");
		}
		for(int i = 0; i<studentCount;i++) {
			System.out.println(students[i]);
		}
	}

}
