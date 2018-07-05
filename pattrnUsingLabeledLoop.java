
public class pattrnUsingLabeledLoop {
	public static void main(String[] args) {
		int i=1;
		name : for(int j=0;j<=5;j++){
			if(i!=j)
				System.out.print("*");
			
			else{
				if(j!=5) {
				System.out.print("\n");
				i++;
				j=-1;
				continue name;
				}
				else break name;
			}
		}
	}
}
