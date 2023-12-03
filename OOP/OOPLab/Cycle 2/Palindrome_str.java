
class str {
    private char[] word;

    public str(char[] word) {
        this.word = word;
    }

    public boolean palin() {

        int l = 0, r = word.length - 1;

        while (l < r) {
            if (word[l++] != word[r--]) {
                System.out.println("Not a palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }
}

public class Palindrome_str {
    public static void main(String[] arg) {
        char[] s = { 'm', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm' };

        str S = new str(s);
        S.palin();
    }
}
