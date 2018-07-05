import java.io.File;
import java.util.Scanner;

public class FileClassAssgnmnt
{
 public static void main(String[] args)
 {
  // create object of scanner to get data from keyboard
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter a path: ");
  String path = sc.nextLine();
  
  // denote the path using file class
  File f = new File(path);
  
  // take some string variables to store some data
  String javaFileNames = "", mpegFileNames = "", jpegFileNames = "",
     txtFileNames = "";
  
  // take some int variables to store number of files
  int javaFiles = 0, mpegFiles = 0, jpegFiles = 0,
   txtFiles = 0;
  
  // fetch list of all the resources from the path
  File[] fa = f.listFiles();
  
  // fetch data (bole to resources of path) from the array using for loop
  for (int i = 0; i < fa.length; i++)
  {
   // check if resource is a file
   // if isFile() method returns true then resource is a file (remember..)
   if(fa[i].isFile())
   {
    // fetch the file name from the i'th element of array
    String fileName = fa[i].getName();
 
    // check the extension of files using endsWith() method of string class

    if(fileName.endsWith(".java")) // means its a java file
    {
     // concatenate the fileName in javaFileNames and also a new line
     javaFileNames = javaFileNames + fileName + "\n";
     
     // increment the counter for java files
     javaFiles++;
    }

    else if(fileName.endsWith(".txt")) // means its a text file
    {
     // concatenate the fileName in txtFileNames and also a new line
     txtFileNames = ">> " +txtFileNames + fileName + "\n";
     
     // increment the counter for text files
     txtFiles++;
    }

    else if(fileName.endsWith(".jpeg")
      || fileName.endsWith(".jpg")) // means its a image file
    {
     // concatenate the fileName in jpegFileNames and also a new line
     jpegFileNames = jpegFileNames + fileName + "\n";
     
     // increment the counter for image files
     jpegFiles++;
    }

    else if(fileName.endsWith(".mpeg")
      || fileName.endsWith(".mpg")) // means its a movie file
    {
     // concatenate the fileName in mpegFileNames and also a new line
     mpegFileNames = ">> " +mpegFileNames + fileName + "\n";
     
     // increment the counter for movie files
     mpegFiles++;
    }
    
   } // end of if
   
  } // end of for loop
  
   System.out.println("# Report of path "+path+" is given below #");
   
   System.out.println("\njava files ->");
   System.out.print(javaFileNames);
   System.out.println("** Total java file are "+javaFiles+" **");

   System.out.println("\ntext files ->");
   System.out.print(txtFileNames);
   System.out.println("** Total text file are "+txtFiles);

   System.out.println("\njpeg or jpg files ->");
   System.out.print(jpegFileNames);
   System.out.println("** Total jpeg file are "+jpegFiles+" **");

   System.out.println("\nmpeg or mpg files ->");
   System.out.print(mpegFileNames);
   System.out.println("** Total mpeg file are "+mpegFiles+" **");
   
   // calculate total number of files in this path
   int totalFiles = javaFiles + txtFiles + jpegFiles + mpegFiles;
   
   System.out.println("\n**Total files in this path are "+totalFiles+" **");
  
 } // end of main method
 
} // end of class