class Animal
{
  String color = "White";

  public eat()
  {
    System.out.println("eating...");
  }
}

class Dog extends Animal
{
  String color = "Black";

  void printColor()
  {
    System.out.println(color);
    System.out.println(super.color);
  }

  public eat()
  {
    System.out.println("eating bread...");
  }
  void bark()
  {
    System.out.println("Barking...");
  }

  void work()
  {
    super.eat();
    bark();
  }
}

class SuperKeyword1
{
  public static void main(String[] args)
  {
    Dog d = new Dog();
    d.printColor();
    d.work();
  }
}
