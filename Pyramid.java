import java.util.Scanner;

public class Pyramid {
	int term;
	Pyramid(){
		System.out.println("NO ARG. CONSTRUCTOR RUN");
	}
	
	public Pyramid(int term) {
		this.term = term;
	}
	void printUpperPart() {
		int rows=term,stars = 1;
	    int spaces = rows - 1;
	    for(int i=1; i<=rows; i++)
	    {
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        for(int j=1; j<=stars; j++)
	            System.out.print("* ");
	        System.out.println();
	        if(i<rows){
	            spaces--;
	            stars++;
	        }
	        else{
	            break;
	        }
	    }
	}
	void printLowerPart() {
		int rows=term,stars = term;
	    int spaces = 0;
	    for(int i=1; i<=rows; i++)
	    {
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        for(int j=1; j<=stars; j++)
	            System.out.print("* ");
	        System.out.println();
	        if(i<rows){
	            spaces++;
	            stars--;
	        }
	        else{
	            break;
	        }
	    }
		
	}
	void printFullPart() {
		int rows=term,stars = 1;
	    int spaces = rows - 1;
	    for(int i=1; i<rows*2; i++)
	    {
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        for(int j=1; j<=stars; j++)
	            System.out.print("* ");
	        System.out.println();
	        if(i<rows){
	            spaces--;
	            stars++;
	        }
	        else{
	            spaces++;
	            stars--;
	        }
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<5||x>12)
			x=5;
		Pyramid p=new Pyramid(x);
		System.out.println("#MENU#");
		System.out.println("Enter 1 for print lower part\nEnter 2 for print Upper part"
				+ "\nEnter 3 for print Full part");
		int y=sc.nextInt();
		
		if(y==1)
			p.printLowerPart();
		else if(y==2)
			p.printUpperPart();
		else if(y==3)
			p.printFullPart();
		System.out.println("---------");
	}

}
