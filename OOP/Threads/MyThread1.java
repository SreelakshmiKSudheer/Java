class T1 extends Thread {
    int[] values = { 1, 2, 3, 4, 5 };

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(values[i]);
            values[i] *= 2;
            // System.out.println(values[i]);
        }

    }
}

class T2 extends Thread {
    int[] values = { 1, 2, 3, 4, 5 };

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Let's go");

        }

    }
}

public class MyThread1 {
    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();

        t1.start();
        t2.start();

    }
}