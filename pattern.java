
public class pattern {
	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print('*');
				if(i==j)
					break;
					
			}
			System.out.print("\n");
		}
	}
}
