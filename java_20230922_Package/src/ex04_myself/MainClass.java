package ex04_myself;

import java.util.Scanner;

public class MainClass extends Student {
	public static void main(String[] args) {
		/*
		 * 학생배열 생성 후 3명의 정보 입력 학생정보 출력 학생전체 총점 및 평균 출력
		 */
		
		
//scanner로 전부 입력받아서 넣어버렷음..
		/*
		 * getter setter쓰는 방법->private로 되어있는 변수에 접근할때 사용...
		 * 변수들 있는곳 타입으로 (상위가 되도록) 객체를 생성
		 * 객체1을 생성했다면 객체1.get~~~, 객체1.set~~~으로 값을 넣고 가져오고 해주면 됨
		 * */
		Student stu1 = new Student();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫 번째 학생의 정보 입력(이름, 나이, 국어, 영어, 수학 순) >>");
		String name1 = sc1.next();
		stu1.setName(name1);
		int age1 = sc1.nextInt();
		stu1.setAge(age1);
		int kor1 = sc1.nextInt();
		stu1.setKor(kor1);
		int eng1 = sc1.nextInt();
		stu1.setEng(eng1);
		int math1 = sc1.nextInt();
		stu1.setMath(math1);

		Student stu2 = new Student();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두 번째 학생의 정보 입력(이름, 나이, 국어, 영어, 수학 순) >>");
		String name2 = sc2.next();
		stu2.setName(name2);
		int age2 = sc1.nextInt();
		stu2.setAge(age2);
		int kor2 = sc1.nextInt();
		stu2.setKor(kor2);
		int eng2 = sc1.nextInt();
		stu2.setEng(eng2);
		int math2 = sc1.nextInt();
		stu2.setMath(math2);

		Student stu3 = new Student();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("세 번째 학생의 정보 입력(이름, 나이, 국어, 영어, 수학 순) >>");
		String name3 = sc2.next();
		stu3.setName(name3);
		int age3 = sc1.nextInt();
		stu3.setAge(age3);
		int kor3 = sc1.nextInt();
		stu3.setKor(kor3);
		int eng3 = sc1.nextInt();
		stu3.setEng(eng3);
		int math3 = sc1.nextInt();
		stu3.setMath(math3);

		//그냥 빈문자열 더해서 string으로 만ㄷ르어버림 근데 정보가 자세하게 안나오는게 좀 고쳐야할점 toString하는 것처럼 나도 name은 뭐고 age는 뭐고 이렇게 만들고 싶음
		//예상) 값입력->생성자를 사용해서 객체만들때 값넣어주고 sysout(st1.toString)을 하면 된다고 생각했는데 그러면 학생 배열이 의미가 없네.... 
		String[] st1 = { stu1.getName(), stu1.getAge() + "", stu1.getKor() + "", stu1.getEng() + "",
				stu1.getMath() + "" };
		String[] st2 = { stu2.getName(), stu2.getAge() + "", stu2.getKor() + "", stu2.getEng() + "",
				stu2.getMath() + "" };
		String[] st3 = { stu3.getName(), stu3.getAge() + "", stu3.getKor() + "", stu3.getEng() + "",
				stu3.getMath() + "" };

		System.out.println(stu1.getName()+"학생의 정보 출력 >>");
		for (int i = 0; i < st1.length; i++)
			System.out.print(st1[i] + " ");
		System.out.println();
		stu1.printTotal();
		stu1.printAvg();
		
		System.out.println();
		System.out.println(stu2.getName()+"학생의 정보 출력 >>");
		for (int i = 0; i < st1.length; i++)
			System.out.print(st2[i] + " ");
		System.out.println();
		stu2.printTotal();
		stu2.printAvg();
		
		System.out.println();
		System.out.println(stu3.getName()+"학생의 정보 출력 >>");
		for (int i = 0; i < st1.length; i++)
			System.out.print(st3[i] + " ");
		System.out.println();
		stu3.printTotal();
		stu3.printAvg();
	}

}
