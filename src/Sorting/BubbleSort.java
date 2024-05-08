package Sorting;

/*
push the maximum to the last by adjcent swapping
 */

public class BubbleSort {

    static void bubbleSort(int a[],int len) {

        for (int i = len - 1; i >= 0; i-- ){
            for (int j = 0; j <= i - 1; j++){
                if ( a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < len; i++) {
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
        bubbleSort(a,len);
    }

    }

