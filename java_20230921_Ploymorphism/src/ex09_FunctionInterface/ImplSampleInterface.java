package ex09_FunctionInterface;

public class ImplSampleInterface implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("이 녀석은 무조건 구현!!!");
	}
	
	public void sample2() {
		System.out.println("구현해도 에러 안나고 구현 안해도 에러 안나고 => 선택해서 해라\n마치 추상인터페이스에 일반메서드가 있으면 상속받았을 때 구현해도되고 안해도 되는 것처럼");
	}

	public static void main(String[] args) {
		SampleInterface s1 = new ImplSampleInterface();
		s1.sample();
		s1.sample2();
		
	}
}
