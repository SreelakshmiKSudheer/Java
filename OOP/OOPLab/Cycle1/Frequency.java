/*
Ex No. 2) To find the frequency of a particular character in a given string
Date: 04/10/2023
65) Sreelakshmi K S3 CSE
*/

public class Frequency
{
   public static void main(String[] args)
   {
      int count = 0,i;
      char[] str = {'a','b','c','d','b','e','c','b','\0'};

      char key = 'b';

      for(i = 0; str[i] != '\0';i++)
      {
         if(str[i] == key)
            count++;
      }

      System.out.println("Frequency = "+count);
   }
}

