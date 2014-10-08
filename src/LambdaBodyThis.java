import java.util.Arrays;
import java.util.List;

/**
 * @author Dilip
 *
 *         github Profile: https://github.com/satya444
 *
 */
public class LambdaBodyThis {

	private static final LambdaBodyThis lbt = new LambdaBodyThis();
	private List<Integer> integers = Arrays.asList(1, 2, 3, 4);

	/**
	 * method shows anonymous inner class are not same as lambda
	 */
	public void doSomething() {
		integers.forEach(x -> {
			if (this == lbt) {
				System.out
						.println("this has different behavior compared to anonymous inner class this");
			}
		});
	}
	public static void main(String args[]){
		lbt.doSomething();
	}
}
