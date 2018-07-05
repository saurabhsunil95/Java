abstract class fooo{
	//static variable and method access by using class name
	static String daal = "arhar ki daal";
	static void katora() {
		System.out.println("mai chatni");
	}
	
	//non static variable and method is access by using upcasting or polymorphic assignment
	void hdd() 
	{
		System.out.println("4gb");
	}
	
	public abstract void show();//what to do
}

class jfoo extends fooo
{
	//overriding for accessing abstract method
	public void show()//how to do
	{
		System.out.println("access");
	}
}

public class TheAbstractClass {

	public static void main(String[] args) {
		fooo.daal = "empty";
		fooo.katora();
		
		fooo f = new jfoo();
		
		f.hdd();
		
		f.show();
		

	}

}
