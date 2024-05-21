package Arrays;

public class MissingElement {

    public static int missingNumber(int[] a,int N){

        // sum of N number
        int sum  = (N * (N + 1)) / 2;

         // array elements sum
        int sum1 = 0;
        for (int i = 0; i < N - 1; i++){
            sum1 += a[i];
        }
        int missingNumber = sum - sum1;
        return missingNumber;
    }

    public static void main(String[] args){

        int N = 5;
        int a[] = {1,2,4,5};

        int ans = missingNumber(a,N);
        System.out.println("The missing number is :"+ ans);

    }
}
