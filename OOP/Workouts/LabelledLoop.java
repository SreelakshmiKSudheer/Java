public class LabelledLoop {
    public static void main(String[] args) {

        label: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2 && i == 2) {
                    break label;
                }
                System.out.println(j);
            }
        }
    }
}
