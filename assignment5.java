
public class assignment5 {

	public static void main(String[] args) {
		int start = 0;
		int end = 20;
		int number = 1;
		int choice = 0;
		System.out.print("if choice = 0 then HIDE that number which contain digit :: ");
		System.out.println(number);
		System.out.print("or if choice = 1 then PRINT that number which contain digit :: ");
		System.out.println(number);
		System.out.print("here choice is :: ");
		System.out.println(choice);
		
		if(choice == 1) {
			for(int i=start;i<=end;i++){
				int k;
				int j=i;
				while(j > 0) {
					k=j%10;
					j=j/10;
					if(k==number)
						System.out.println(i);
				}	
			}
		}
		else {
			for(int i=start;i<=end;i++){
				int k;
				boolean w = true;
				int j=i;
				while(j > 0) {
					k=j%10;
					j=j/10;
					if(k==number) {
						w = false;
						break;
					}
				}
				if(w==true)
					System.out.println(i);
			}
		}
		
		
	}
}
	
	


