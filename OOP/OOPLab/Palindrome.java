import java.util.Scanner;

class Word {
    String word;
    boolean palindrome;

    public Word(String word) {
        this.word = word;
    }

    boolean palin() {
        palindrome = true;

        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(j))) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }

        return palindrome;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        // System.out.println(word);

        Word w = new Word(word);
        if (w.palin())
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }
}
