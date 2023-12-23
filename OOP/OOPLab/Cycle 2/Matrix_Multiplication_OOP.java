/*
Ex No. 3) Matrix Multiplication
Date: 04/10/2023
65) Sreelakshmi K S3 CSE
*/

class Matrix
{
   private int m[][];
   private int r,c;


   public Matrix(int r, int c,int m[][])
   {
      this.r = r;
      this.c = c;
      this.m = m;
   }

   public void Print()
   {
      int i,j;
      for(i = 0; i < r; i++)
      {
         for(j = 0; j < c; j++)
         {
            System.out.print(m[i][j] + " ");
         }
         System.out.println("");
      }
   }

   public void multi(Matrix a, Matrix b)
   {
      int i,j,k;

      for(i = 0; i < a.r; i++)
      {
         for(j = 0; j < b.c; j++)
         {
            for(k = 0; k < a.c; k++)
            {
                 m[i][j] += a.m[i][k] * b.m[k][j];
            }
         }
      }
   }
}



public class Matrix_Multiplication_OOP
{
   public static void main(String[] args)
   {
      
      int r1 = 3, c1 = 2, r2 = 2, c2 = 3;
      int[][] a = {{1,2},{3,4},{5,6}};
      int[][] b = {{1,2,3},{4,5,6}}; 
      int[][] c = new int[r1][c2];
      
      Matrix A = new Matrix(r1,c1,a);
      Matrix B = new Matrix(r2,c2,b);
      Matrix C = new Matrix(r1,c2,c);
     
      C.multi(A,B);

      System.out.println("Matrix A:");
      A.Print();
      System.out.println("Matrix B:");
      B.Print();

      System.out.println("The Product of the input matrices are:");
      C.Print();
   }
}
