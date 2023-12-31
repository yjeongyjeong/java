package ex04;

public class TV {

	String color;
	boolean power; //기본값 false
	int channel; //멤버변수
	//생성자의 역할 : 멤버변수 초기화에 이용될 수 있다,,
	TV(){
		//기본값을 줌(초기화)
		this.channel = 11;
		this.color = "white";
		this.power = false;
	}
	
	TV(int channel /*지역변수*/) {
		this.channel = channel; 
		this.color = "white";
		this.power = false;
	}
	TV(String color /*지역변수*/) {
		this.color = color;
		this.color = "white";
		this.power = false;
		//이렇게해줘야 값이 나옴!!
	}

	TV(String color,	boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}
