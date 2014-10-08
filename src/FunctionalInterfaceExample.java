
/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class FunctionalInterfaceExample {

	@FunctionalInterface
	interface PasswordEncoder{
		public String encode(String password ,String name); 
	}
	
	public PasswordEncoder passwordEncoder(){
		System.out.println("first call");
		return (password,name)->password.toUpperCase();
	}
	
	public void doSomething(PasswordEncoder encoder){
		System.out.println("calling encode");
		String encode= encoder.encode("abc", "satya");
		System.out.println(encode);
	}
	
	PasswordEncoder ti= passwordEncoder();

	public void call(){
		System.out.println("calling do something");
		doSomething(ti);
	}
	public static void main(String args[]){
		FunctionalInterfaceExample fie= new FunctionalInterfaceExample();
		fie.call();
	}
}
