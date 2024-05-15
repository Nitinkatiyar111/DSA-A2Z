package Arrays;

public class LargestElement {
    static int largestElement(int a[],int len){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++){

            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {2, 5, 1, 3, 0,7,9,12};
        int len = a.length;

         System.out.println(largestElement(a, len));
    }
}
