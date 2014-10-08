import java.util.function.Consumer;
import java.util.function.Function;


/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class ConsumerClassExample {

	public static void doSomething(Integer l){
		System.out.println("PRINTING "+l);
	}
	public static void main(String args[]){
		Consumer<Integer> consumer1= x -> doSomething(x);
		consumer1.accept(1);
		
		Consumer<Integer> consumer2= ConsumerClassExample::doSomething;
		consumer2.accept(11);
		 
		Function<String, Integer> mapper1 = x-> new Integer(x);
		int out=mapper1.apply("11");
		System.out.println(out);
		
		Function<String, Integer> mapper2 = Integer::new; 
		int out2= mapper2.apply("12");
		System.out.println(out2);
	}
}
