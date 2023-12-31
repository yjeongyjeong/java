package ex01;

public class TVTest {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println(tv.channel);
		//7에서 --되어서 6으로 출력됨
		
		TV tv2 = new TV();
		System.out.println(tv2.channel);
		// 0 출력됨 tv와 별개!! 마치 int a = 1; int b =3;과 같이 클래스는 같지만 변수가 다름! 저장된 값도 다름!
		
		TV tv3;
		tv3 = tv;
		System.out.println(tv3.channel);
		//나의 예상은 7! 그러나 6... 계산이 끝난 변수의 값이 나옴!
		// 주소값을 넘겨준것이므로 같은 상태를 공유중임!! 따라서 tv에서 채널변수에 저장되어있는 6이 결과로 도출됨 왜냐면 그냥 tv에 있는 값을 가져온것과 같으므로..
		
		tv3.channel = 100;
		System.out.println(tv.channel);
		System.out.println(tv3.channel);
		
		/*둘다 100의 값이 나옴
		 * 왜냐면 tv3이 tv의 주소를 참조하고 있었는데 지가 바꿔버림,, 따라서 tv에서 변수를 출력해도 바꿔버린 변수가 출력되고 당연히 tv3에서도 바뀐 변수가 출력됨! => 이를 막으려면 외부에서 접근하기 힘들도록 private같은 애들로 변수 접근제한자를 두고 getter setter를 하던지 해주거나 값을 변화시키지 않을 애라면 final을 붙여서 값을 변화시키지 않게 막아주면 좋을 것 같음
		 * 쉽게 이해하려면 그림 그려보면 될듯! 
		 */
		tv.channel=5;
		System.out.println(tv3.channel);
		//이러면 또 같은 주소 공유중이니까 tv3도 5가 나옴
		
	}
}
