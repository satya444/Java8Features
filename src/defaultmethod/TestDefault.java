package defaultmethod;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */

public class TestDefault implements TestA1, TestB1{
	
	
	public static void main(String args[]){
		TestA1 ta= new TestDefault();
		ta.doSomething();
	}

}
 interface TestA1{
	public default void doSomething(){
		System.out.println("in TESTA");
	}
	
}
 interface TestB1 extends TestA1{
	 public default void doSomething() {
		System.out.println("in TESTB");
	}
}

