package ex04_myself;

public class Student {
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	void printTotal() {
		this.sum = kor+eng+math; 
		System.out.println("총합 : " + sum);
	}
	
	void printAvg() {
		this.avg = sum/3;
		//대신 이 메서드는 앞에 토탈이  실행되어야 sum이 생기므로 이전에 해야하는 단점이 있ㄷ다...
		//->printTotal에서 sysout 하지않고 계산만하게 만들어서 내부에서 printTotal()실행되도록 만들기
		System.out.println("평균 : "+ avg);
		//printTotal을 불러서 값을 넣게 하는것도 괜찮겠다.
		//this로 다 넣어주거나..
		
	}
	
	public Student() {
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

