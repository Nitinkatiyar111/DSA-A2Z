package Arrays;

public class MaximumSubArraySum {

    public static int maxSubArraySum(int a[],int len){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < len; i++){

            sum += a[i];

            if (sum > maxSum){
                maxSum = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){

        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int len = a.length;

        int result =  maxSubArraySum(a,len);
        System.out.println(result);
    }
}
