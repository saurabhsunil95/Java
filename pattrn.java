
public class pattrn {

	public static void main(String[] args) {
		int i=1;
		name : for(int j=0;j<=5;j++){
			if(j<i)
				System.out.print("*");
			
			else{
				System.out.print("\n");
				i++;
				j=-1;
				continue name;
			}
		}
	}
}