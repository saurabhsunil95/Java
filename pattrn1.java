
public class pattrn1 {

	public static void main(String[] args) {
		int temp =5; int size=5;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<temp;j++)
				System.out.print(" ");
				temp--;
			for(int k=0;k<((2*i)-1);k++)
				System.out.print("*");
			System.out.println();
		}
		int tmp=1;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=tmp;j++)
				System.out.print(" ");
				tmp++;
			for(int k=((2*size)-2);k>((2*i)-1);k--)
				System.out.print("*");
			System.out.println();
		}

	}

}
