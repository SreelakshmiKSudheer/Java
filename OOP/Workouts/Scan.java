import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = scan.nextLine();
        System.out.println("Entered a String is " + s);

        System.out.println("Enter a integer: ");
        int integer = scan.nextInt();
        System.out.println("Entered a Integer is " + integer);

        System.out.println("Enter a float: ");
        float Float = scan.nextFloat();
        System.out.println("Entered a Integer is " + Float);
    }
}
