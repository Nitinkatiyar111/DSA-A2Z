package Arrays;

public class LeftRotate {

    public static void leftRotate(int a[], int len) {

        // storing first array element in a temp variable

        int temp = a[0];

        for (int i = 0; i < len - 1; i++) {
            a[i] = a[i + 1];
        }
        a[len - 1] = temp;

        // for printing
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        int len = a.length;

        leftRotate(a, len);
    }
}