public class JavaString {
    public static void main(String[] args) {

        String s = "Hello";

        String firstName = "Sreelakshmi K ";
        String secondName = "Stark";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('e'));

        s = s + " World";

        System.out.println(s);

        System.out.println(firstName.concat(secondName));

    }
}
