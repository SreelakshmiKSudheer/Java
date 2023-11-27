class QuickSort {
    private String[] names;

    public QuickSort(String[] names) {
        this.names = names;
    }

    public void sort() {
        quicksort(0, names.length - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int index = partition(low, high);

            quicksort(low, index - 1);
            quicksort(index + 1, high);
        }

    }

    private int partition(int low, int high) {
        String pivot = names[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(names[j], pivot) <= 0) {
                i++;

                // Swap names[i] and names[j]
                String temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }

        // Swap names[i + 1] and pivot
        String temp = names[i + 1];
        names[i + 1] = names[high];
        names[high] = temp;

        return i + 1;
    }

    private int compare(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int n = minlen(alen, blen);

        for (int i = 0; i < n; i++) {
            char ach = a.charAt(i);
            char bch = b.charAt(i);

            if (ach != bch) {
                if (ach > bch)
                    return 1;
                else
                    return -1;
            } else {
                continue;
            }
        }
        return 0;
    }

    private int minlen(int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return a;
    }

    public void display() {
        System.out.print("Sorted Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

}

public class Quick_Sort {
    public static void main(String[] args) {
        String[] names = { "John", "Alice", "Bob", "David", "Eva" };

        QuickSort quicksort = new QuickSort(names);
        quicksort.sort();
        quicksort.display();
    }
}

/*
 * class QuickSort {
 * private String[] names;
 * 
 * public QuickSort(String[] names) {
 * this.names = names;
 * }
 * 
 * public void sort() {
 * quickSort(0, names.length - 1);
 * }
 * 
 * private void quickSort(int low, int high) {
 * if (low < high) {
 * int partitionIndex = partition(low, high);
 * 
 * quickSort(low, partitionIndex - 1);
 * quickSort(partitionIndex + 1, high);
 * }
 * }
 * 
 * private int partition(int low, int high) {
 * String pivot = names[high];
 * int i = low - 1;
 * 
 * for (int j = low; j < high; j++) {
 * if (compare(names[j], pivot) <= 0) {
 * i++;
 * 
 * // Swap names[i] and names[j]
 * String temp = names[i];
 * names[i] = names[j];
 * names[j] = temp;
 * }
 * }
 * 
 * // Swap names[i + 1] and pivot
 * String temp = names[i + 1];
 * names[i + 1] = names[high];
 * names[high] = temp;
 * 
 * return i + 1;
 * }
 * 
 * private int compare(String str1, String str2) {
 * int len1 = str1.length();
 * int len2 = str2.length();
 * int minLength = Math.min(len1, len2);
 * 
 * for (int i = 0; i < minLength; i++) {
 * char c1 = str1.charAt(i);
 * char c2 = str2.charAt(i);
 * 
 * if (c1 != c2) {
 * return c1 - c2;
 * }
 * }
 * 
 * return len1 - len2;
 * }
 * 
 * public void display() {
 * System.out.print("Sorted Names: ");
 * for (String name : names) {
 * System.out.print(name + " ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * String[] names = {"John", "Alice", "Bob", "David", "Eva"};
 * 
 * QuickSort quickSort = new QuickSort(names);
 * quickSort.sort();
 * quickSort.display();
 * }
 * }
 * 
 */