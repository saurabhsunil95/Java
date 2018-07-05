interface pujarii{
	void korma();
	
}
interface molvii{
	void kuttukipakori();
	
}
interface doctor{
	void vaccine();
}
class fatheroflallu{
	public void vaccine() {
		
	}
}
class lalluu extends fatheroflallu implements pujarii,molvii,doctor{
	
	//not mandatory to override that abstract method of interface, if you inherite a class that contain same method of interface
		public void korma() {
	}

	public void kuttukipakori() {
	}
}

public class ClassExtendsImplementsBoth {

	public static void main(String[] args) {
		

	}

}
