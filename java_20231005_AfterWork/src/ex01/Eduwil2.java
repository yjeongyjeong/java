package ex01;

//오류 없애보기

class Car2 extends Vehicle2{
	public Car2(String car) {
		super(car);
	}
	
	public String getName2(String val) {
		return "Car name : " + val;
	}
	public String getName2(byte val[]) {
		return "Car name : " + val;
	}
}

public class Eduwil2 {
	public static void main(String[] args) {
		Car2 obj = new Car2("Spark");
		
		System.out.println(obj.getName2());
	}
}
