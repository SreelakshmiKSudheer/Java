/*
Ex No.5 ) Abstract class Shape
Date: 14/10/2023
65) Sreelakshmi K S3 CSE
*/

abstract class Shape
{
   public abstract int NumberOfSides();
}

class Rectangle extends Shape
{
   public int NumberOfSides()
   {
      System.out.println("Number of sides of Rectangle : " + 4);
      return 4;
   }
}

class Triangle extends Shape
{ 
   public int NumberOfSides()
   {
      System.out.println("Number of sides of Triangle : " + 3);
      return 3;
   }
}

class Hexagon extends Shape
{ 
   public int NumberOfSides()
   {
      System.out.println("Number of sides of Hexagon : " + 6);
      return 6;
   }
}

public class Shapes
{
   public static void main(String args[])
   {
      Shape r1 = new Rectangle();
      Shape t1 = new Triangle();
      Shape h1 = new Hexagon();

      r1.NumberOfSides();
      t1.NumberOfSides();
      h1.NumberOfSides();
   }
}


