package Threads;

class Thread2 implements Runnable {

    private int threadnum;

    public Thread2(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run() { // throws RuntimeException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread number " + threadnum);
        }
        /*
         * if (threadnum == 3) {
         * throw new RuntimeException();
         * }
         */

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }
    }

}

public class Threads2 extends Thread {
    public static void main(String[] args) {
        Thread2 first = new Thread2(1);
        Thread2 second = new Thread2(2);
        Thread2 third = new Thread2(3);

        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);

        t1.start();
        t2.start();
        try {
            t1.join();
            t1.isAlive(); // returns true if t1 is still is running
            t2.join(); // t3 waits outside of this try catch for t1 and t2 to die
        } catch (InterruptedException e) {

        }
        t3.start();
    }

}