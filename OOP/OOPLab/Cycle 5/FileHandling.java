import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileHandling
{
   public static void main(String[] args)
   {
      BufferedReader breader = new BufferedReader((new InputStreamReader(System.in)));

      try
      {
         System.out.print("Enter name of file: ");
         String nameoffile = breader.readLine();
 
         System.out.print("Enter content of file: ");
         String content = breader.readLine();

         FileWriter writer = new FileWriter(nameoffile);
         System.out.println("Writing to file: " + nameoffile);
         writer.write(content);
         writer.close();

         FileReader reader = new FileReader(nameoffile);
         System.out.println("Reading from file: " + nameoffile);

         int unit;
         while((unit = reader.read()) != -1)
         {
            System.out.print((char)unit);
         }

         System.out.println("\nFile read");
         reader.close();
 
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }

      

   }
}
