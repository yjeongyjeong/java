package ex03;

public class TV {

	String color;
	boolean power; //기본값 false
	int channel; //멤버변수
	//생성자의 역할 : 멤버변수 초기화에 이용될 수 있다,,
	TV(){
		System.out.println("기본생성자");
	}
	
//	TV(int channel /*지역변수*/) {
//		channel = channel; //이렇게하면 값이 안나옴
//	}
	TV(int channel /*지역변수*/) {
		this.channel = channel; //이렇게해줘야 값이 나옴!!
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
