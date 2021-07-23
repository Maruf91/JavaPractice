package qaclickacademy;
import java.io.File;
import java.io.IOException;
public class DeleteCitrixDesktopInstance {

	public static void main(String[] args) throws IOException {
	 
      //Creating a File object for directory
      File directoryPath = new File("C:\\Users\\Maruf\\Downloads");
      //List of all files and directories
      File filesList[] = directoryPath.listFiles();
      //System.out.println("List of files and directories in the specified directory:");
      
      for(File file : filesList) {
         //System.out.println("File name: "+file.getName());
        // System.out.println("File path: "+file.getAbsolutePath());

	
      
      if (file.getName().contains("S2luZ2Zpc2hlciBDVkEtQ1ZEIFNpdGUuU0FQIFRlbXBsYXRlIE5ldyAkUzUxLTkx"))
      {
    	  
    	 file.delete();
    	 System.out.println("instance deleted successfully");
      }
      else
      {
    	  System.out.println("Instances not found");
      }
      }

}
}
