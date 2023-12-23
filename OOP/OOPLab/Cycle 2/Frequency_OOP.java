/*
Ex No. 2) To find the frequency of a particular character in a given string
Date: 04/10/2023
65) Sreelakshmi K S3 CSE
*/

class string
{
   public char key;
   public int count;
   public char[] str;

   

   public string(char[] word)
   {
      str = word;
   }

   void get_char(char c)
   {
      key = c;
   }
   
   int freq()
   {
      int i;
      count = 0;

      for(i = 0; str[i] != '\0';i++)
      {
         if(str[i] == key)
         {
            count++;
         }
      }
      System.out.println("Frequency of " + key + " is " + count);
      return count;
   }
}


public class Frequency_OOP
{
   public static void main(String[] arg)
   {

      char[] s = {'a','b','c','b','c','a','b','\0'};
      //string s1;
      string s1 = new string(s);

      s1.get_char('b');
      s1.freq();
   }
}
