class papa{
	void home() {
		System.out.println("in village");
	}
}
class son extends papa{
	void home() {
		System.out.println("in metro city");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		papa p1 = new papa();
		p1.home();
		papa p2 = new son();
		p2.home();
	}

}