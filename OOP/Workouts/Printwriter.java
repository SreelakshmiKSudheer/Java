import java.io.File;
import java.io.PrintWriter;

public class Printwriter {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Avengers assemble");
        writer.flush();
        writer.close();

        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("Test.txt"));
        writer1.write("Avengers assemble");
        writer1.flush();
        writer1.close();
    }
}
