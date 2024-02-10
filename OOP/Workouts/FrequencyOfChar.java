import java.util.Scanner;

class Word {
    String word;
    int frequency;

    public Word(String word) {
        this.word = word;
    }

    public int Frequency(char c) {
        frequency = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c)
                frequency++;
        }
        return frequency;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        // System.out.println(word);

        System.out.print("Enter a character: ");
        char c = scanner.nextLine().charAt(0);

        Word w = new Word(word);

        System.out.println("Frequency : " + (w.Frequency(c)));
    }
}
