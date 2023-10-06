package ex09_FunctionInterface;

@FunctionalInterface //추상 메서드가 하나만 존재
public interface SampleInterface {

	void sample();
//	void sample2(); 
// Invalid '@FunctionalInterface' annotation; SampleInterface is not a functional interface 추상메서드 하나만 있어야 하는데 두개 있다고 에러남
//	void sample() {}; 에러남
//	Abstract methods do not specify a body 추상메서드 아니라고
	default void sample2() {} //이건 가능
}
