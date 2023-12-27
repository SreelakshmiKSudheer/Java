class EvenException extends Exception
{
   public String toString()
   {
      return "Even";
   }
}

class OddException extends Exception
{
   public String toString()
   { 
      return "Odd";
   }
}

public class TryExcept
{
   public static void check_num(int n) throws EvenException,OddException
   {
      if(n % 2 == 0)
      {
         throw new EvenException();
      }
      else
      {
         throw new OddException();
      }
   }
   public static void main(String[] args)
   {
      int num = 2;

      try
      {
          check_num(num);
      }
      catch(EvenException a)
      { 
            System.out.println("The input number is " + a);
      }
      catch(OddException a)
      {
            System.out.println("The input number is " + a);

      }

   }
}
