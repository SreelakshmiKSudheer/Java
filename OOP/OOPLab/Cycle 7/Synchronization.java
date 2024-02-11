class Shareddata {
   int counter = 1;
   static int N;
}

class OddNumberGen extends Thread {
   Shareddata sd;

   public OddNumberGen(Shareddata sd) {
      this.sd = sd;
   }

   public void run() {
      synchronized (sd) {
         while (sd.counter < sd.N) {
            while (sd.counter % 2 == 0) {
               try {
                  sd.wait();
               } catch (InterruptedException ex) {
                  ex.printStackTrace();
               }
            }
            System.out.print(sd.counter + " ");
            sd.counter++;
            sd.notify();
         }
      }
   }
}

class EvenNumberGen extends Thread {
   Shareddata sd;

   public EvenNumberGen(Shareddata sd) {
      this.sd = sd;
   }

   public void run() {
      synchronized (sd) {
         while (sd.counter < sd.N) {
            while (sd.counter % 2 == 1) {
               try {
                  sd.wait();
               } catch (InterruptedException ex) {
                  ex.printStackTrace();
               }
            }
            System.out.print(sd.counter + " ");
            sd.counter++;
            sd.notify();
         }
      }
   }
}

public class Synchronization {
   public static void main(String[] args) {
      Shareddata sd = new Shareddata();
      sd.N = 10;

      OddNumberGen odd = new OddNumberGen(sd);
      EvenNumberGen even = new EvenNumberGen(sd);

      odd.start();
      even.start();

      try {
         odd.join();
         even.join();

      } catch (InterruptedException ex) {
         ex.printStackTrace();
      }
   }
}
