interface interface1{
	public static final String message = "Good morning ";
	
	 static void method() {
		System.out.print(" guys");
	}
	 public default void nonstaticmethod() {
			System.out.print(" guys");
		}
}

class impfoo implements interface1{
	
}
public class TheInterface {

	public static void main(String[] args) {
		System.out.print(interface1.message);
		interface1.method();
		
		interface1 f = new impfoo();
		f.nonstaticmethod();
			
	}

}
