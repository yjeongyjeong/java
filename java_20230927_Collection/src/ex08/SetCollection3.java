package ex08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//@NoArgsConstructor 기본생성자?
class Car {
	private String model;
	private String color;

	@Override
	public String toString() {
		return model + " : " + color;
	}
	
	@Override
	public int hashCode() {
		return (model.hashCode()+color.hashCode())/2; 
//		어차피 해시코드 숫자니까 간단하게 만들어줌
	}
	
	@Override
	public boolean equals(Object obj) { //두 개 인자의 값이 같으면 false나오도록 해줌
		String _model = ((Car)obj).model;
		String _color = ((Car)obj).color;
		
//		if(model.equals(_model) && color.equals(_color))
//			return true;
//		else
//			return false;
		
		return
		model.equals(_model) && color.equals(_color) ? true : false;
	}
}

public class SetCollection3 {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>();

		set.add(new Car("소나타", "흰색"));
		set.add(new Car("그랜저", "검정색"));
		set.add(new Car("소나타", "검정색"));
		set.add(new Car("제네시스", "흰색"));
		set.add(new Car("제네시스", "검정색"));
		set.add(new Car("소나타", "검정색"));

		Iterator<Car> iter = set.iterator();
		
		while(iter.hasNext()) {
			Car c = iter.next();
			System.out.println(c.toString());
		}
		
//		for (Car ss : set)
//			System.out.println(ss);
		
		
	}
}
