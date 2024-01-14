import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileHandling {
    public static void main(String[] args) {

        /*
         * try {
         * File file = new File("FileHandling.txt");
         * 
         * if (file.createNewFile())
         * System.out.println("File created successfully");
         * else
         * System.out.println("File already exists. Couldn't create a new one");
         * } catch (IOException e) {
         * System.out.println("Error occured");
         * e.printStackTrace();
         * 
         * }
         * 
         */

        try {
            FileWriter writer = new FileWriter("FileHandling.txt");

            writer.write("Avengers");
            writer.close();
            System.out.println("Wrote");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("FileHandling.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
