package ex08_singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	int apple = 100; //모든 참조되는 곳에서 함께 존재하지만 기본타입으로 접근제한되어있으므로 다른 패키지에서 쓰려면 public 붙여주기
	//static으로 인해서 기본적으로 new singleton이 힙에 만들어지게 되고(동시에) 100이란 값이 들어가게됨
	//싱글톤이기 때문에 모두 같은 데이터를 가르키게 되므로 apple의 값은 100으로 존재하게 됨
	private Singleton() { // 생성자에 private를 붙여서 클래스 내부에서만 가능하도록 함
		
	}
	public static Singleton getInstance() { //위에 객체생성된거에 직접접근할 순 없음 따라서 주소를 받아와서 접근함(바로갈 수 없으니까 한번 거쳐서 접근하는 느낌) 언제든 접근할수있도록 public + static을 붙이고 singleton 변수도 참조해야하므로 private로 만들어줌 
//		
		return singleton;
	}
/*
 * singleton 사용이유 : 객체를 하나만 생성해서 공유하자는 의미
 * 클래스 자체를 공유하겠다는 의미... 
 * ex. DB연결할 때 DriverManager.getConnection 이것도 마찬가지!!
 * 이것이 자바다 293페이지
 * 
 * 
 *내가 이해한 싱글톤 패턴은 한클래스를 공유하기 위해서는 객체생성을 제한해야하므로 private를 붙여줌
 *그러나 private를 붙이면 현재 클래스내에서만 사용할 수 있으므로 다른데에서 쓰지를 못함,,
 *따라서 다른 곳에서 사용할 수 있게 하려면 직접 접근하지 않고 한번 거쳐서 접근하도록 만들어주는 것
 *이를 위해서 언제든 접근할 수 있도록 static에 올려주고 싱글톤 내에서 생성된 객체는 마찬가지로 static 메서드를 통해 주소값을 리턴하도록 해줌
 *이 리턴된 주소를 다른 클래스에서 가져와서 사용함
 */

}


