public class Constructor {

    // non-parameterized constructor
    int minutes;

    public Constructor() {
        System.out.println("Workout started");
    }

    // parameterized constructor
    public Constructor(int minutes) {
        this.minutes = minutes;
        System.out.println("Workout for " + minutes + " minutes");
    }

    // copy constructor
    public Constructor(Constructor c) {
        this(c.minutes);
        System.out.println("Workout for " + minutes + " minutes");
    }

    public void Done() {
        System.out.println("Workout done");
    }

    public static void main(String[] args) {

        // default constructor

        // non-parameterized
        Constructor w = new Constructor();
        w.Done();

        // parameterized constructor
        Constructor w1 = new Constructor(30);
        w1.Done();
    }
}
