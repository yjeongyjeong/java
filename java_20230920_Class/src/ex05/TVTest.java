package ex05;

public class TVTest {
	public static void main(String[] args) {
		TV tv = new TV(1000); //1000번 채널이 없는데 값을 출력할 수는 없으니까 생성자를 통해 체크하도록 함
		System.out.println(tv.channel);
		// this를 통해 아래에 다른 생성자를 호출해서 값을 초기화 시키고 밑에 sysout문장을 수행하는것까지가 생성자호출 시 일어나는 일 그리고 sysout(tv.channel)을 해줌
	}
}
