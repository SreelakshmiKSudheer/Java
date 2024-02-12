import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.Math;

public class OddEvenPrimeWriter {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in); // for user input
            FileWriter writer = new FileWriter("2Num.txt"); // write to file

            System.out.print("Enter starting number: "); // reads starting number
            int n = scanner.nextInt();
            writer.write(n);

            System.out.print("Enter endiing number: "); // reads ending number
            n = scanner.nextInt();
            writer.write(n);

            writer.close(); // file writing closes

            FileReader reader = new FileReader("2Num.txt"); // read file

            int count = 0, unit, start = 0, end = 0;
            while ((unit = reader.read()) != -1) { // read as integers
                if (count == 0)
                    start = unit;
                else if (count == 1)
                    end = unit;
                count++;
            }
            System.out.println(start + " " + end);

            FileWriter writerodd = new FileWriter("OddFile.txt"); // write odd numbers
            FileWriter writereven = new FileWriter("EvenFile.txt"); // write even numbers
            FileWriter writerprime = new FileWriter("PrimeFile.txt"); // write prime numbers

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) { // check for even numbers
                    writereven.write(i);
                    // System.out.println(i + " ");
                } else // check for odd numbers
                    writerodd.write(i);
            }
            writerodd.close();
            writereven.close();

            int primestart;
            if (start > 1) // setting the starting number for prime number check to avoid 1 from the list
                primestart = start;
            else
                primestart = 2;

            for (int i = primestart; i <= end; i++) { // check for prime numbers
                int last = (int) Math.sqrt(i);
                boolean prime = true;

                for (int j = 2; j <= last; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }

                }
                if (prime)
                    writerprime.write(i);
            }
            writerprime.close();

            // reading odd number file
            reader = new FileReader("OddFile.txt");

            System.out.println("Reading from File with odd numbers");
            while ((unit = reader.read()) != -1) {
                System.out.print(unit + " ");
            }
            System.out.println();
            // reading complete

            // reading even number file
            reader = new FileReader("EvenFile.txt");

            System.out.println("Reading from File with Even numbers");
            while ((unit = reader.read()) != -1) {
                System.out.print(unit + " ");
            }
            System.out.println();
            // reading complete

            // reading prime number file
            reader = new FileReader("PrimeFile.txt");

            System.out.println("Reading from File with Prime numbers");
            while ((unit = reader.read()) != -1) {
                System.out.print(unit + " ");
            }
            System.out.println();
            // reading complete

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
