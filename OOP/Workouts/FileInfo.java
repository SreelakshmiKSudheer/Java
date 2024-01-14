import java.io.File;

public class FileInfo {
    public static void main(String[] args) {

        File file = new File("FileHandling.txt");

        if (file.exists()) {
            System.out.println("File name " + file.getName());
            System.out.println("File absolute path " + file.getAbsolutePath());
            System.out.println("File readable " + file.canRead());
            System.out.println("File writable " + file.canWrite());
            System.out.println("File size in bytes " + file.length());
        } else {
            System.out.println("No file");
        }

        if (file.delete()) {
            System.out.println("Deleted File name " + file.getName());
        } else {
            System.out.println("Couldn't delete file");
        }
    }
}
