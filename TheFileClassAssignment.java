import java.io.File;
import java.util.Scanner;


public class TheFileClassAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter path of Directory :: ");
		String path = sc.nextLine();
		
		File f = new File(path);
		
		File[] fa = f.listFiles();
		
		String filename[] = f.list();
		System.out.println("\n Name of files :: \n");
		for (int i = 0; i < filename.length; i++) {
			System.out.println(filename[i]);
		}
		
		int countJava=0,countMp3=0,countJpg=0,countTxt=0,countMp4=0;
		System.out.println("\nAll files of Directory :: ");
		for (int i = 0; i < fa.length; i++) {
			String name = fa[i].getName();
			 
			 
			 if(name.endsWith("java"))
				 countJava++;
			 else if(name.endsWith("mp3"))
				 countMp3++;
			 else if(name.endsWith("jpg"))
				 countJpg++;
			 else if(name.endsWith("txt"))
				 countTxt++;
			 else if(name.endsWith("mp4"))
				 countMp4++;
		}
		System.out.println("------------------------------------\n");
		System.out.println("Total number of Java File in Directory ::   "+countJava);
		System.out.println("Total number of Mp3 File in Directory ::   "+countMp3);
		System.out.println("Total number of JPG File in Directory ::   "+countJpg);
		System.out.println("Total number of TXT File in Directory ::   "+countTxt);
		System.out.println("Total number of MP4 File in Directory ::   "+countMp4);
		System.out.println("Total number of File in Directory ::   "+(countJava+countMp3+countJpg+countTxt+countMp4));

	}

}
