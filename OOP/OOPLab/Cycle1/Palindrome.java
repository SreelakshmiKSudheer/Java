/*
Ex No. 1) Check whether a string is palindrome or not
Date: 04/10/2023
65) Sreelakshmi K S3 CSE
*/

public class Palindrome
{
	public static void main(String[] args)
	{
	   int i, l =  0, r;
	   boolean palindrome = true;

	   char[] str = {'m','a','l','a','y','a','l','a','m','\0'};

	   for(i = 0; str[i] != '\0'; i++);
		
	   r = i - 1;

	   while(l < r)
	   {
	      if(str[l] != str[r])
	      {
                  palindrome = false;
                  break;
              }
              l++;
              r--;
           }

           if(palindrome)
           {  
              System.out.println("It is a palindrome");
           }
           else
           {
              System.out.println("It is not a palindrome");
           }
	 }
}
