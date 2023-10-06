package ex08_409_no7;

public class DaoExample {

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
	
	/* 나의 풀이->  dbWork는 인터페이스를 매개변수(dao)로 받으니까 인터페이스내에 일단 네 가지 기능이 구현되어 있어야 함
	 * 따라서 data어쩌고 인터페이스를 만들고 4개의 메서드?를 구현함
	 * 메서드 타입은 내가 정해야 하는데 결과 출력해야하니까 void로 해서 sysout을 통해 출력하게 함
	 * new OracleDao()는 결국 DataAccessObject aaa = new OracleDao();와 같으므로 
	 * 일단 OracleDao라는 클래스를 만들어야 하고(생성자를 사용해서 객체를 생성해야하니까 클래스가 만들어져야함)
	 * aaa(= new OracleDao())에서 원하는 기능을 수행하려면 interface를 implements 시킨 후 내가 원하는 내용이 나오도록 메서드를 재정의하면 됨
	 * 그러면 이제 aaa(= new OracleDao())는 인터페이스 타입이라 아무 내용도 없는 메서드 즉, 추상 메서드를 가지고 있지만 재정의(오버라이드) 되었으므로 인터페이스와 이름은 같고 내용은 다른 메서드를 사용할 수 있음 
	 *  끝!
	 * 
	 * 
	 * 
	 * 선생님 풀이
	 * 일단 public static void dbWork(DataAccessObject dao)에서 DataAccessObject는 상위로 만들거나 인터페이스로 만들어줘야함
	 * 
	 * */
}
