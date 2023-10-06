package ex05;

public class TV {

	String color;
	boolean power; //기본값 false
	int channel; //멤버변수
	//생성자의 역할 : 멤버변수 초기화에 이용될 수 있다,,
	TV(){
		this("white",11, false);
		//생성자 호출 아래에 매개변수 3개 해당하는 애한테 값을 줘서 변수설정함
		System.out.println("this는 맨 위에 잇어야 함!");
	}
	
	TV(int channel /*지역변수*/) {
		this("white",channel, false);
	}
	TV(String color /*지역변수*/) {
		this(color,11, false);
	}
//굳이 이렇게 하는 이유? => 값을 체크할 수 있음
	TV(String color,	int channel, boolean power){
		this.color = color;
		this.power = power;
		this.channel = channel;
		
		if(channel>100)
			this.channel = 100;
		else
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
