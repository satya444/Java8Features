import java.util.Arrays;
import java.util.List;


/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class ForEachTest {

	public void test(){
		List<Integer> integers= Arrays.asList(1,2,3,4);
		integers.forEach(x -> {System.out.println(x);} );
		System.out.println("***************************************");
		integers.forEach(System.out::println);
		
	}
	public static void main(String args[]){
		ForEachTest fet= new ForEachTest();
		fet.test();
	}
}
