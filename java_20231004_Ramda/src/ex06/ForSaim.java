package ex06;

import java.util.Arrays;

public class ForSaim {
	public static void main(String[] args) {
		System.out.println("사임이가 '집가고싶다'라고 몇 번 말했는지 세어보겠습니다!");
		
		String str = "집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어집가고싶어";
		String[] strArr = str.split("집가고싶어");
		System.out.println(strArr.length/5);
//		for(String s : strArr)
//			System.out.println(s+"회");
//		int num = (int) Arrays.stream(strArr).count();
//		System.out.println(num);
	}
}
