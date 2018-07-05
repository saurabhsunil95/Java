interface pujari{
	void korma();
	
}
interface molvi{
	void kuttukipakori();
	
}
class lallu implements pujari,molvi{
	//you must override all abstract method of interfaces
	public void korma() {
	}

	public void kuttukipakori() {
	}
}
public class MultipleInterface {

	public static void main(String[] args) {
		

	}

}
