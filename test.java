
public class test {

	public static void main(String[] args) {
		int start = 0;
		int end = 20;
		int number = 1;
		int choice = 0;
		int flag = 0;
		for(int i=start;i<=end;i++) {
			for(int j=i;j!=0;j=j/10) {
				int temp = j%10;
				if(temp==number) {
					flag=1;
					break;
				}
			}
			if(flag==choice) {
				System.out.println(i);
			}
			flag=0;
		}

	}

}
