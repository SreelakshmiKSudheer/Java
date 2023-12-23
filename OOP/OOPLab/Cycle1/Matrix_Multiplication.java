/*
Ex No. 3) Matrix Multiplication
Date: 04/10/2023
65) Sreelakshmi K S3 CSE
*/

public class Matrix_Multiplication
{
   public static void main(String[] args)
   {
      int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
      int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
      int r1 = 3, c1 = 3, r2 = 3, c2 = 3;
      int[][] c = new int[3][3];
      int i,j,k;

      for(i = 0; i < r1; i++)
      {
         for(j = 0; j < c2; j++)
         {
            for(k = 0; k < r2; k++)
            {
               c[i][j] += a[i][k] * b[k][j];
            }
         }
      }

      System.out.println("Matrix A:");
      for(i = 0;i < r1; i++)
      {
        for(j = 0; j < c1; j++)
        {
           System.out.print(a[i][j] + " ");
        }
        System.out.println("");
      } 

      System.out.println("Matrix B:");
      for(i = 0;i < r2; i++)
      {
        for(j = 0; j < c2; j++)
        {
           System.out.print(a[i][j] + " ");
        }
        System.out.println("");
      } 


     System.out.println("Matrix C(Product):");

     for(i = 0;i < r1; i++)
     {
        for(j = 0; j < c2; j++)
        {
           System.out.print(c[i][j] + " ");
        }
        System.out.println("");
     } 

   }
}

