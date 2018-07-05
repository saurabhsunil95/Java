import java.util.Scanner;

public class StringQues2 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a paragraph :: ");
		String str = sc.nextLine();
		System.out.println("Enter a word :: ");
		String word = sc.nextLine();
		int n = str.indexOf(word);
		int l = str.lastIndexOf(word);
		System.out.println("First index of First word "+word+" in paragraph is "+n);
		System.out.println("Last index of last word "+word+" in paragraph is "+l);
		
		String st[] = str.split(word); 
		int frq = st.length-1;
		
		System.out.println("Frequency of "+word+" is "+frq);
		
		String str1[] = str.split(" ");
		
		int len=0,j=1;
		for (int i = 0; i < str1.length; i++) {
			if(str1[i].equals(word)) {
				System.out.println("Index of "+j+" word "+(len+i));
				j++;
			}
			len = len + str1[i].length();
		}
	}

}
