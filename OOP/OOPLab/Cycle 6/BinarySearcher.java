
class Binary_Searcher {
    private int[] a;
    private int key;
    public final static int INVALID = -99999;

    public Binary_Searcher(int[] a, int key) {
        this.a = a;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public int search() {
        int l, r, mid;
        boolean present = false;

        l = 0;
        r = a.length - 1;

        while (l <= r && !present) {
            mid = (l + r) / 2;

            if (a[mid] == key) {
                present = true;
                System.out.println(key + " is PRESENT at " + (mid + 1));
                return mid;
            } else if (a[mid] > key) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(key + " is not present");
        return INVALID;
    }
}

public class BinarySearcher {

    public static void main(String[] args) {
        int a[] = { 4, 37, 61, 72, 84, 93 };

        Binary_Searcher b = new Binary_Searcher(a, 1);
        b.search();
    }
}
