package ex04_myself2;

public class Student {
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	void sum() {
		this.sum = kor+eng+math; 
	}
	
	void avg() {
		this.avg = sum/3;
	}
	
	public Student() {
	}
	
	

//	public Student(String name, int age, int kor, int eng, int math) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}

	@Override
	public String toString() {
		return "입력하신 학생의 정보는\n이름 : " + name + ", 나이 : " + age + ", 국어점수 : " + kor + ", 영어점수 : " + eng + ", 수학점수 : " + math + ", 총합 : "
				+ sum + ", 평균 : " + avg + "입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	} 
	
	
}

