import java.util.*;

class RandNumGen extends Thread
{
   private static boolean isRunning = true;
   public static void stopRunning()
   {
     isRunning = false;
   }

   public void run()
   {
      Random random = new Random();

      while (isRunning)
      {
         int randomnumber = random.nextInt(20);
         System.out.println("Generated Number :" + randomnumber);

         Compute compute = new Compute(randomnumber);
         compute.start();

         try
         {
            Thread.sleep(1000);
         }
         catch(InterruptedException ex)
         {
            System.out.println(ex);
         }
      }
   }
}


class Compute extends Thread
{
   private int num;

   public Compute	(int num)
   {
      this.num = num;
   }

   public void run()
   {
      if(num % 2 == 0)
      {
         int square = num * num;
         System.out.println("Square of " + num + ": " + square);
      }
      else
      {
         int cube = num * num * num;
         System.out.println("Cube of " + num + ": " + cube);

      }
   }
}


public class RandomNumberGenerator
{
   public static void main(String[] args)
   {
      RandNumGen rand = new RandNumGen();
      rand.start();

      try
      {
         Thread.sleep(5000);

      }
      catch(InterruptedException ex)
      {
         System.out.println(ex);
      }

      rand.stopRunning();
   }
}
