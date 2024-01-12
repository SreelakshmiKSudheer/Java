public class JavaString {
    public static void main(String[] args) {

        String s = "Hello";

        String firstName = "Sreelakshmi K ";
        String secondName = "Stark";
        int JerseyNo = 35;
        String reveal = "My Jersey No. is ";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('e'));     // index of first occurance of 'e'

        s = s + " World";

        System.out.println(s);

        System.out.println("I am " + firstName.concat(secondName));
        System.out.println(reveal + JerseyNo);                          // str + int -> concat

    }
}
