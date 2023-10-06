package ex09_inher;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color); //상위클래스에 있는 생성자 호출하려면 super사용
		//아래 객체에서 만들면 상위객체들도 전부 생성해야 할 수 잇음
		this.wifi = wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void youTube() {
		System.out.println("유튜브 접속");
	}
}
