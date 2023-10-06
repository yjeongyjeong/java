package ex08_singleton;

public class SingletonExam {
	public static void main(String[] args) {

		/*
		 * Signeton에 private가 붙어있어서 생성이 안됨 객체를 private static에서 만들고 있음 
		 * Singleton sp = new SingletonExam(); 
		 * sp.apple;
		 */
		Singleton s = Singleton.getInstance();
		System.out.println(s.apple);

	}
}
