import java.util.*;

class RandNumGen extends Thread {
    private static boolean isRunning = true;

    public static void stopRunning() {
        isRunning = false;
    }

    public void run() {
        Random random = new Random();

        while (isRunning) {
            int num = random.nextInt(20);
            System.out.println("Generated number: " + num);

            if (num % 2 == 0) {
                Even even = new Even(num);
                even.start();
            } else {
                Odd odd = new Odd(num);
                odd.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Even extends Thread {
    int num;

    public Even(int num) {
        this.num = num;
    }

    public void run() {
        long square = (long) num * num;
        System.out.println("Square: " + square);
    }
}

class Odd extends Thread {
    int num;

    public Odd(int num) {
        this.num = num;
    }

    public void run() {
        long cube = (long) num * num * num;
        System.out.println("Cube: " + cube);
    }
}

/*
 * class Compute extends Thread {
 * int num;
 * 
 * public Compute(int num) {
 * this.num = num;
 * }
 * 
 * public void run() {
 * if (num % 2 == 0) {
 * long square = (long) num * num;
 * System.out.println("Square: " + square);
 * } else {
 * long cube = (long) num * num * num;
 * System.out.println("Cube: " + cube);
 * }
 * }
 * }
 */

public class RandomNumGen {
    public static void main(String[] args) {
        RandNumGen rand = new RandNumGen();
        rand.start();

        try {
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        RandNumGen.stopRunning();
    }
}