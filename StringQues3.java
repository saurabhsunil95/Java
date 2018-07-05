import java.util.Scanner;

public class StringQues3 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a paragraph :: ");
		String str = sc.nextLine();
		
		String str1[] = str.split(" ");
		int len = str1.length;
		
		System.out.println("Total no of word in paragraph is :: "+ len);
		
		if(len<10) {
			System.out.println("Insufficient words!!");
		}
		else {
			for (int i = 0; i < str1.length; i++) 
	        {
	            for (int j = i + 1; j < str1.length; j++) 
	            {
	                if (str1[i].compareTo(str1[j])>0) 
	                {
	                    String temp = str1[i];
	                    str1[i] = str1[j];
	                    str1[j] = temp;
	                }
	            }
	        }
			System.out.println("---------------------------------");
			System.out.println("Sorted order of word is :: ");
			for (int i = 0; i < str1.length; i++) {
				System.out.print(str1[i]+" ");
			}
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("Sorted order of word is :: ");
			for (int i = str1.length-1; i >= 0; i--) {
				System.out.print(str1[i]+" ");
			}
		}
	}

}
