
class str {
    char[] word;
    int length;
    boolean palindrome;
    String wordS;

    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    void get_str(char[] str) {
        word = str;
        wordS = toString(word);

    }

    int len() {
        int i;

        for (i = 0; word[i] != '\0'; i++)
            ;
        this.length = i;
        return i;
    }

    boolean palin() {
        palindrome = true;
        int l, r;

        l = 0;
        r = length - 1;
        while (l < r) {
            if (word[l++] != word[r--]) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }

    void display() {
        if (palindrome)
            System.out.println(wordS + " is a palindrome");
        else
            System.out.println(wordS + " is not a palindrome");
    }

}

public class Palindrome_str {
    public static void main(String[] arg) {
        str s1;
        s1 = new str();
        char[] s = { 'm', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm', '\0' };
        s1.get_str(s);
        s1.len();
        s1.palin();
        s1.display();
    }
}
