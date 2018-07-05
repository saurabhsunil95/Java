
public class Test2 {
	int len,width,area;
	String creator;
	void insert(int a,int b,String n){  
		len=a;
		width=b;
		creator=n;
	}
	public static void main(String[] args) {
		Test2 abc=new Test2();
		Test2 xyz=new Test2();
		Test2 wxy=new Test2();
//		abc.insert(10, 20, "abc");
//		xyz.insert(10, 10, "xyz");
//		wxy.insert(30, 10, "wxy");
		
		abc.len=10;
		abc.width=20;
		abc.creator="abc";
		xyz.len=10;
		xyz.width=10;
		xyz.creator="xyz";
		wxy.len=30;
		wxy.width=10;
		wxy.creator="wxy";
		
		abc.area=abc.len*abc.width;
		xyz.area=xyz.len*wxy.width;
		wxy.area=wxy.len*wxy.width;
		
		if(abc.area<=xyz.area&&xyz.area<=wxy.area)
			System.out.println(abc.creator+" "+abc.len+" "+abc.width);
		else if(xyz.area<=abc.area&&abc.area<=wxy.area)
			System.out.println(xyz.creator+" "+xyz.len+" "+xyz.width);
		else
			System.out.println(wxy.creator+" "+wxy.len+" "+wxy.width);
	}

}
