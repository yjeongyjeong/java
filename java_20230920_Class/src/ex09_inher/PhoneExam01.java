package ex09_inher;

public class PhoneExam01 {
	public static void main(String[] args) {
		Phone p = new Phone("애플", "V11");
		p.bell();
		p.sendVoice("hello?");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("삼성", "S33", true);
		//smartphone클래스에 있는 생성자를 통해서 phone에 있는 생성자 호출
		
	}
}
