package ex03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");

		Iterator<String> itr = list.iterator(); // 반복자 획득

		String str;
		while (itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box")) 
				itr.remove();
			//"Box"라는 값이 있으면 지우는 건데 이미 str은 itr의 값을 다 받은 상태라 "Box"의 값도 출력됨 list에서 값은 지워진 상태임!!
			System.out.println(str);
			// itr에 다음줄(데이터)이 있어서 itr.hasNext가 true가 되고 next()로 인해 toy 값이 str에 저장 & 출력됨 이 반복
		}
		
		itr = list.iterator(); //위에서 박스 지운상태인 배열이 출력됨
		System.out.println("------------------");
		while (itr.hasNext()) { //이미 end지점에 잇어서(위에서 전부 출력시키고 멈춘상태) true가 안됨(다음 데이터가 없음)
			//다시 돌게 만드려면 itr = list.iterator()를 while위에 추가해서 itr에 다시 데이터를 넣어줌(반복자 다시 획득)
			str = itr.next();
			System.out.println(str); 
		}
	}
}
