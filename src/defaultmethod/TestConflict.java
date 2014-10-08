package defaultmethod;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class TestConflict implements TestA, TestB{
	public void doSomething(){
		System.out.println("OVERRIDDEN THE METHOD TO AVOID CONFLICT");
	}
	public static void main(String args[]){
		TestConflict tc= new TestConflict();
		tc.doSomething();
	}

}
interface TestA{
	public default void doSomething(){
		System.out.println("in test A");
	}
}
interface TestB{
	public default void doSomething(){
		System.out.println("in test B");
	}
}
