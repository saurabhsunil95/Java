
public class labeledLoop {
	public static void main(String[] args) {
		test : for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
				System.out.println(j);
				if(j==5)
					break test;
			}
	System.out.println("test");
		}
	}
}
//using labeled loop we direct break the whole loop, 
//like above exaNmple we break the whole loop without printing test statement of main loop