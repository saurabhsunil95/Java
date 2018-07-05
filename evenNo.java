
public class evenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using for loop ::");
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("using while loop ::");
		int x=1;
		while(x<11) {
			if(x%2==0)
				System.out.println(x);
			x++;
		}
		System.out.println("using do while loop ::");
		int j=1;
		do{
			if(j%2==0)
				System.out.println(j);
			j++;
		}
		while(j<11);
		
	}

	}


