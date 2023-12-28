
import java.util.StringTokenizer;
import java.io.*;

public class Tokenizer
{
   public static void main(String[] args)
   {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         System.out.print("Enter a line of integers: ");
         String inputline = reader.readLine();

         StringTokenizer tokenizer = new StringTokenizer(inputline);

         int sum = 0;

         while(tokenizer.hasMoreTokens())
         {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);

            sum += number;
         }

         System.out.println("Sum of integers: " + sum);
      }
      catch(IOException ex)
      {
         ex.printStackTrace();
      }
   }
}


