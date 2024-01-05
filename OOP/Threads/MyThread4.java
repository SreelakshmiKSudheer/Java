public class MyThread4 {
    public static void main(String[] args) throws Exception {
        /*
         * Runnable hi = () ->
         * {
         * for (int i = 0; i < 5; i++) {
         * System.out.println("Hi");
         * try {
         * Thread.sleep(500);
         * } catch (Exception e) {}
         * }
         * }
         * ;
         * 
         * Runnable hello = () ->
         * {
         * for (int i = 0; i < 5; i++) {
         * System.out.println("Hello");
         * try {
         * Thread.sleep(500);
         * } catch (Exception e) {
         * }
         * }
         * }
         * ;
         */
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from " + Thread.currentThread().getName() + " with Priority "
                        + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Hello Thread");

        t1.setName("Hi Thread");

        // Default priority is 5 if we don't specify it
        t1.setPriority(1); // give integers
        t2.setPriority(Thread.MAX_PRIORITY); // giving max priority to the particular thread

        System.out.println("Priority of " + t1.getName() + " is " + t1.getPriority());
        System.out.println("Priority of " + t2.getName() + " is " + t2.getPriority());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("Bye");
    }
}
