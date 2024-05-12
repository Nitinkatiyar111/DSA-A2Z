//{ Driver Code Starts
import java.util.*;


public class QuickSort {
        //Function to sort an array using quick sort algorithm.
        static void quickSort ( int arr[], int low, int high)
        {
            // code here
            if (low < high) {

                int pIndex = partition(arr, low, high);
                quickSort(arr, low, pIndex - 1);
                quickSort(arr, pIndex + 1, high);
            }
        }
        static int partition ( int arr[], int low, int high)
        {
            int pivot = arr[low];
            int i = low;
            int j = high;

            while (i < j) {
                while (arr[i] <= pivot && i <= high - 1) {
                    i++;
                }
                while (arr[j] > pivot && j >= low + 1) {
                    j--;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap pivot with element at index j
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;

            return j;
        }
           public static void main(String[] args){
            int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};
            int n = arr.length;
            System.out.println("Before Sorting: ");
            for (int i = 0; i < n; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            quickSort(arr,0,n-1);
            System.out.println("After Sorting: ");

            for (int i = 0; i < n; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
           }
    }


