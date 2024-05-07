package Sorting;

public class SelectionSort {

    public static void selectionSort(int a[],int len){

        // select min and swap

        for (int i = 0; i < len - 1; i++){
            int min = i;
            for (int j = i + 1; j < len; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            // swap
            int temp  = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.println("After selection sort!");
        for (int i = 0; i < len; i++){
            System.out.print(a[i]+ " ");
        }
          System.out.println();
    }

    public static void main(String[] args){

        int a [] = {13,46,24,52,20,9};
        int len = a.length;

        System.out.println("Before selection sort:");
        for (int i = 0; i < len ; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        selectionSort(a,len);

    }

}
