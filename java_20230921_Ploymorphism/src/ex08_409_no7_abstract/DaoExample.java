package ex08_409_no7_abstract;

public class DaoExample {
// 추상클래스로 만들어 봄
// 인터페이스 예제에서 하나만 구현받았기 때문에 바로 가능.. 왜냐면 추상클래스는 클래스간에 상속이니까 한번만 가능
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
//main메서드에서 dbwork메소드를 호출할 떄 oracle과 mysql을 매개로 주고 호출햇음
//dbwork메서드는 두 객체를 모두 받기 위해 dataaccessobject타입의 매개변수를 가지고 있음
//실행결과를 보고 dataacessobject인터페이스와 oracledao, mysqldao구현 클래스 작성
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	
} 
