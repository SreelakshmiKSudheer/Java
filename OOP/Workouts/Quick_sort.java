import java.util.Scanner;
import java.util.*;

public class Quick_sort {
    public static void main(String[] args) {
        int n, e;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            e = scanner.nextInt();
            a[i] = e;
        }

        for (int i : a) {
            System.out.println(i);
        }

        scanner.close();

        QuickSort q = new QuickSort(a);
        q.Quick_Sort(0, n - 1);
        q.display();

    }

}

class QuickSort {
    int[] a;

    public QuickSort(int[] a) {
        this.a = a;
    }

    public void Quick_Sort(int low, int high) {

        if (low >= high)
            return;

        int i = low + 1, j = high, pivot = a[low], temp;

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        Quick_Sort(low, i - 1);
        Quick_Sort(j + 1, high);
    }

    public void display() {
        System.out.println("Sorted array:");

        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }
}
