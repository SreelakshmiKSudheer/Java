import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaString2 {
    public static void main(String[] args) {
        String s = new String();
        String s1 = new String();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter a String: ");
            s = reader.readLine();

            System.out.print("Enter a String: ");
            s1 = scan.nextLine();

            System.out.print("Enter a char: ");
            String c = scan.nextLine();
            // System.out.print("Length of String1: " + s.length());

            if (s.contains(c)) {
                System.out.println("Found");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
