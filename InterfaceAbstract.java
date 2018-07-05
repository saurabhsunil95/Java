interface roo{
	public abstract void s();
	public abstract void k();
	
}

class Improo implements roo{
	public void s(){
		System.out.println("s method ");
	}
	public void k() {
		System.out.println("k method");
	}
}
public class InterfaceAbstract {

	public static void main(String[] args) {
		roo r = new Improo();
		r.s();
		r.k();

	}

}
