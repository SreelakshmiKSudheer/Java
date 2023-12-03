package Threads;

class Thread1 extends Thread {

    private int threadnum;

    public Thread1(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run() throws RuntimeException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread number " + threadnum);
        }
        if (threadnum == 3) {
            throw new RuntimeException();
        }

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

        }
    }

}

public class Thresd1 extends Thread {
    public static void main(String[] args) {
        Thread1 first = new Thread1(1);
        Thread1 second = new Thread1(2);
        Thread1 third = new Thread1(3);
        first.start();
        second.start();
        third.start();
    }

}