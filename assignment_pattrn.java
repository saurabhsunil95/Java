
public class assignment_pattrn {

	public static void main(String[] args) {
		int i=1;
		boolean w=false;
		name : for(int j=0;j<=5;j++){
			if(w!=true) {
			if(i!=j)
				System.out.print("*");
			
			else{
				System.out.print("\n");
				i++;
				j=-1;
				if(i==6) {
					w=true;
					i=i-2;
				}
				continue name;
			}
			}
			else {
				if(i!=j)
					System.out.print("*");
				
				else{
					System.out.print("\n");
					i--;
					j=-1;
					if(i==-1)
						break name;
					continue name;
				}
			}
		}
		}

	}


