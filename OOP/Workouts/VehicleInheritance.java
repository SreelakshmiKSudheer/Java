class Brand
{
  protected String brand = "Ford";

  public void honk()
  {
    System.out.println("Tuut");
  }
}

class Car extends Brand
{
  private String modelName = "Mustang";

  public sttic void main(String[] args)
  {
    Car myCar = new Car;

    myCar.honk();  // parent class method

    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
