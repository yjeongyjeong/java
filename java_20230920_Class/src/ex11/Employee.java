package ex11;

public class Employee extends Person {
/* Java 상속에서 생성자 연결은 상위 클래스의 생성자를 연결하기 위해 super 메서드 를 사용하여 일련의 생성자를 호출하는 것을 의미합니다 . 하위 클래스 생성자는 명시적으로나 암시적으로 슈퍼클래스 생성자를 호출해야 합니다. 어느 쪽이든 슈퍼 생성자를 정의해야 합니다.
 * => 즉, 상속받은채로 하위클래스 생성자를 만들려면 기본생성자가 필요하다는것인가?
 * 
 * 컴파일러는 Employee 생성자 에 슈퍼 호출을 삽입하므로 부모 클래스 Person 에서 매개 변수가 없는 생성자를 찾을 수 없습니다 .
 * => 즉, 상위 클래스에 기본생성자가 없는데 하위 클래스에서 어떤 생성자를 만들면 오류가 나는듯 
	*/
	
    Double salary;

    public Employee(String name, Integer age, Double salary) {
        this.salary = salary;
    }

    // setters and getters
}
