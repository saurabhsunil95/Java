import java.io.File;

public class TheFileClass6 {

	public static void main(String[] args) {
		String path = "e:";
		
		File f = new File(path);
		
		//get a list of all the resources inside this path
		File[] fa = f.listFiles();
		//fetch data from this array
		for (int i = 0; i < fa.length; i++) {
			String name = fa[i].getName();
			if(fa[i].isDirectory())
				System.out.println("Directory :: "+name);
			else if(fa[i].isFile())
				System.out.println("Files :: "+name);
			else if(fa[i].isHidden())
				System.out.println("Hidden " + fa[i]);
		}

	}

}
