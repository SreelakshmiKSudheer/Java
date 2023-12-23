/*
Ex No.4 ) Employee Management
Date: 14/10/2023
65) Sreelakshmi K S3 CSE
*/

class Employee
{
   private String name;
   private int age;
   private String ph_no;
   private String address;
   private double salary;

   public void Print_salary()
   {
      System.out.println("Salary : " + this.salary);
   }

   public Employee(String name,int age,String ph_no,String address,double salary)
   {
      this.name = name;
      this.age = age;
      this.ph_no = ph_no;
      this.address = address;
      this.salary = salary;
   }
}

class Manager extends Employee
{
   private String specialization;

   public Manager(String name,int age,String ph_no,String address,double salary,String specialization)
   {
      super(name,age,ph_no,address,salary);
      this.specialization = specialization;

   }
}

class Officer extends Employee
{
   private String department;

   public Officer(String name,int age,String ph_no,String address,double salary,String department)
   { 
      super(name,age,ph_no,address,salary);
      this.department = department;

   }

}

public class Employee_Management
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee("Sharath",32,"9804657789","Hridya House,Pambady,Pin code: 884623,Kottayam",32000.00);
      System.out.print("Employee ");
      e1.Print_salary();
      Manager m1 = new Manager("Mithra",38,"9404256780","Mithra House,Kayamkulam,Pin code: 882423,Kottayam",40000.00,"AI");
      System.out.print("Manager ");
      m1.Print_salary();
      Officer o1 = new Officer("Nithya",38,"9404256780","Neerava House,Kochi,Pin code: 882423,Kottayam",60000.00,"Project Management");
      System.out.print("Officer ");
      o1.Print_salary();
      
   }
}
