import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//create object of random
		Random r = new Random();
		//get a random number in the range of 
		//-2^31 to 2^31-1
		int a  = r.nextInt();
		System.out.println(a);
		//get a random number in the range of 
		//0 to range-1 
		int b = r.nextInt(10);
		System.out.println(b);
	}

}
