import java.io.*;

public class CopyFile
{
   public static void main(String[] args)
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try
      {

         System.out.println("Enter input Filename: ");
	 String file1 = br.readLine();

	 FileReader reader = new FileReader(file1);
         StringBuilder content = new StringBuilder();

         int unit;
         while((unit = reader.read()) != -1)
         {
            content.append((char)unit);
         }
         reader.close();

         System.out.println("Enter output Filename: ");
         String file2 = br.readLine();

         FileWriter writer = new FileWriter(file2);
         BufferedWriter bw = new BufferedWriter(writer);

         bw.write(content.toString());
         bw.close();

         reader = new FileReader(file2);
         System.out.println("Contents of " + file2 + " : ");
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
