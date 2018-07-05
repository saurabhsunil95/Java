
public class assignmentDiamondPattrn {

	public static void main(String[] args) {
		int rows=5,stars = 1;
	    int spaces = rows - 1;
	    for(int i=1; i<rows*2; i++)
	    {
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        for(int j=1; j<stars*2; j++)
	            System.out.print("*");
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

}
