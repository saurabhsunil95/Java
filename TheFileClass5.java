import java.io.File;

public class TheFileClass5 {

	public static void main(String[] args) {
		String path = "c:/windows/system32";
		
		File f = new File(path);
		
		String name = f.getName();
		System.out.println("name of resourse "+name);
		String parent = f.getParent();
		System.out.println("parents name :: "+parent);

	}

}
