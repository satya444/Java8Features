package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class SimpleListStream {

	List<Integer> integers= Arrays.asList(1,2,3,4);
	
	public void testStream(){
		integers.stream().forEach(System.out::println);
		Stream<Integer> s=integers.stream().filter(x-> x>=3);
		System.out.println( s.count());
		List<Integer> l= s.collect(Collectors.toList());
		System.out.println(l);
	
	}
	
	public static void main(String args[]){
		SimpleListStream sls= new SimpleListStream();
		sls.testStream();
	}
}
