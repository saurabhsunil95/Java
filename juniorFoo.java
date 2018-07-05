
public class juniorFoo extends Foo {
	//define a non static method
	void access() {
		//access the variable of superclass
		System.out.println(super.i);
		//access the method of superclass
		super.j();
	}

}
