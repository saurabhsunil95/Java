import java.io.File;
import javax.swing.filechooser.FileSystemView;

public class Scan {
 
    public static void main(String[] args) {
         
        FileSystemView fsv = FileSystemView.getFileSystemView();
         
        File[] drives = File.listRoots();
        if (drives != null && drives.length > 0) {
            for (File aDrive : drives) {
                System.out.println("Drive Letter: " + aDrive);
                System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
                System.out.println("\tTotal space: " + (aDrive.getTotalSpace()/(1024*1024*1024)) +" GB");
                System.out.println("\tFree space: " + (aDrive.getFreeSpace()/(1024*1024*1024))+" GB");
                System.out.println();
            }
        }
    }
}