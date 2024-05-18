package Arrays;

public class SortedCheck {

    public static void sortedCheck(int a[], int n) {
        int flag = 1;
        for (int i = 0; i < n-1; i++) {
            if (a[i + 1] > a[i]) {
                continue;
            } else
                flag = 0;
        }
        if (flag == 0) {
            System.out.println("Array is not sorted !!");
        } else
            System.out.println("Array is sorted !!");
    }

    public static void main(String[] args) {

        int n = 5;
        int a[] = {1,2,3,4,5};

        sortedCheck(a, n);
    }
}