import java.io.*;

class Student {
    int No;
    String Name;

    public Student(int No, String Name) {
        this.No = No;
        this.Name = Name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        Student s = new Student(24, "Sree");

        try {
            FileOutputStream fout = new FileOutputStream("Serialize.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject("Sree");
            out.flush();
            out.close();

            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
