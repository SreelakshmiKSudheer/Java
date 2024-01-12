class variable {
    public static boolean ordered = false;
    public static boolean o_confirmed = false;
    public static boolean paid = false;
    public static boolean prepare = false;
    public static boolean served = false;

    public synchronized void o_placed() {
        while (ordered != true) {
            ordered = true;
            break;
        }
    }

    public synchronized void Paid() {
        while (ordered == true && paid == false) {
            paid = true;
            break;
        }
    }

    public synchronized void confirm() {
        while (paid == true && o_confirmed != true) {
            o_confirmed = true;
            break;
        }
    }

    public synchronized void prepared() {
        while (prepare != true) {
            prepare = true;
            break;
        }
    }

    public synchronized void Serve() {
        while (served != true) {
            served = true;
            break;
        }
    }

}

class Customer extends Thread {
    variable v;

    public Customer(variable v) {
        this.v = v;

        Thread t = new Thread(this, "Customer");
        t.start();

    }

    public void run() {
        v.o_placed();
        System.out.println("Order placed");
        v.Paid();
        System.out.println("Paid");

    }
}

class CashCounter extends Thread {
    variable v;

    public CashCounter(variable v) {
        this.v = v;

        Thread t = new Thread(this, "Cash Counter");
        t.start();
    }

    public void run() {
        v.confirm();
        System.out.println("Order confirmed. Bill Paid. Prepare the food");
        v.prepared();
        System.out.println("Food prepared");
    }
}

class FoodCounter extends Thread {
    variable v;

    public FoodCounter(variable v) {
        this.v = v;
        Thread t = new Thread(this, "Cash Counter");
        t.start();
    }

    public void run() {
        v.Serve();
        System.out.println("Food Served");
    }
}

public class Cafetiria {
    public static void main(String[] args) {
        variable v = new variable();

        new Customer(v);
        new CashCounter(v);
        new FoodCounter(v);

    }
}
