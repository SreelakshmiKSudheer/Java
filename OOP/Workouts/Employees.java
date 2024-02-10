import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phNo;
    String address;
    float salary;

    public Employee(String name, int age, String phNo, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary : " + salary);
    }

    public void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone No. : " + phNo);
        System.out.println("Address: " + address);
        this.printSalary();
    }
}

class Officer extends Employee {
    String specification;

    public Officer(String name, int age, String phNo, String address, float salary, String specification) {
        super(name, age, phNo, address, salary);

        this.specification = specification;
    }

    public void printSpec() {
        System.out.println("Specification : " + specification);
    }

    public void printDetails() {
        super.printDetails();
        printSpec();
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, String phNo, String address, float salary, String department) {
        super(name, age, phNo, address, salary);

        this.department = department;
    }

    public void printDept() {
        System.out.println("Department : " + department);
    }

    public void printDetails() {
        super.printDetails();
        printDept();
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        {
            System.out.println("Enter employee details : ");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Age : ");
            int age = scanner.nextInt();
            System.out.print("Phone No. : ");
            String phNo = scanner.nextLine();
            phNo = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Salary: ");
            float salary = scanner.nextFloat();

            Employee employee = new Employee(name, age, phNo, address, salary);
            employee.printDetails();
        }

        {
            System.out.println("Enter Officer details : ");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Age : ");
            int age = scanner.nextInt();
            System.out.print("Phone No. : ");
            String phNo = scanner.nextLine();
            phNo = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Salary: ");
            float salary = scanner.nextFloat();
            System.out.print("Specification: ");
            String specification = scanner.nextLine();
            specification = scanner.nextLine();

            Officer officer = new Officer(name, age, phNo, address, salary, specification);
            officer.printDetails();
        }

        {

            System.out.println("Enter Officer details : ");
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Age : ");
            int age = scanner.nextInt();
            System.out.print("Phone No. : ");
            String phNo = scanner.nextLine();
            phNo = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Salary: ");
            float salary = scanner.nextFloat();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            department = scanner.nextLine();

            Manager manager = new Manager(name, age, phNo, address, salary, department);
            manager.printDetails();
        }

    }
}
