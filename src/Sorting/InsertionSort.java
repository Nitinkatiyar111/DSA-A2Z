package Sorting;

/*
Take a element and place it at its correct position
 */
public class InsertionSort {

    static void insertion_sort(int[] a,int n){

        for (int i = 0; i <= n - 1; i++){
            int j = i;

            while (j > 0 && a[j -1] > a[j]){
                   int temp = a[j - 1];
                   a[j - 1] = a[j];
                   a[j] = temp;
                   j--;
            }
        }

        System.out.println("After insertion sort :");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int a []  = {13,46,24,52,20,9};
        int len = a.length;

        System.out.println("Before using insertion sort ;");
        for (int i = 0; i < len; i++){
            System.out.print(a[i]+ " ");

        }
        System.out.println();
        insertion_sort(a,len);
    }
}
