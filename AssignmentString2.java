import java.util.Scanner;

public class AssignmentString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "UseR#1";
		String password = "u1S2E3r";
		System.out.print("Enter Your User Id :: ");
		String u = sc.nextLine();
		u=u.trim();
		System.out.print("Enter Your Password :: ");
		String p = sc.nextLine();
		if(user.equalsIgnoreCase(u)&&password.equals(p)) {
			System.out.println("Enter A number :: ");
			int num = sc.nextInt();
			System.out.println("#MENU#");
			System.out.println("Press 1 :: to change into Binary");
			System.out.println("Press 2 :: to change into Octal");
			System.out.println("Press 3 :: to change into Hexadecimal");
			
			int q = sc.nextInt();
			if(q==1) {
				int n=num;
				int[] arr = new int[50];
				int i=0;
				while (n > 0) {
			        arr[i] = n % 2;
			        n = n / 2;
			        i++;
			    }
				System.out.print("Binary of "+num+" is ::  ");
				for (int j = i-1; j >= 0; j--) {
					System.out.print(arr[j]);
				}
			}
			else if(q==2) {
				int i = 0,n=num;
				int[] arr = new int[50];
			    while (n != 0) {
			        arr[i] = n % 8;
			        n = n / 8;
			        i++;
			    }
			    System.out.print("Octal of "+num+" is ::  ");
				for (int j = i-1; j >= 0; j--) {
					System.out.print(arr[j]);
				}
			}
			else if(q==3) {
				int i = 0,n=num;
				char[] arr = new char[50];
			    while(n!=0){   
			        int temp  = 0;
			        temp = n % 16;
			        if(temp < 10){
			        	arr[i] = (char)(temp + 48);
			            i++;
			        }
			        else{
			        	arr[i] = (char)(temp + 55);
			            i++;
			        } 
			        n = n/16;
			    }
			    System.out.print("Octal of "+num+" is ::  ");
				for (int j = i-1; j >= 0; j--) {
					System.out.print(arr[j]);
				}
			}
			else System.out.println("Invalid option!!!");
		}
		else System.out.println("Invalid User Id or Password!!");
	}

}
