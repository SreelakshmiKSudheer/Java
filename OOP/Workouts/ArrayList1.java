import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<String>();

        Names.add("Sree");
        Names.add("Vichi");
        Names.add("Sid");
        Names.add("Sudhi");
        Names.add("Sree");

        for (String name : Names) { // using for each statement
            System.out.println(name);
        }

        System.out.println(Names); // prints as a list

        Iterator itr = Names.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
