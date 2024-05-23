package Arrays;

public class LongestSubArraySum {

    public static int getLongestSubArraySum(int[] a, int sum) {

        int n = a.length;

        int left = 0, right = 0; // 2 pointers
        int sum1 = a[0];
        int maxLen = 0;

        while (right < n) {
            // if sum > k, reduce the subArray from left
            // until sum becomes less or equals to k:
            while (left <= right && sum1 > sum) {
                sum1 -= a[left];
                left++;
            }

            // answer

            if (sum == sum1) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // move forward the right pointer

            right++;
            if (right < n) {
                sum1 += a[right];
            }


        }
        return maxLen;
    }

    public static void main(String[] args){
        int a[] = {2,3,5,1,9};
        int sum = 10;

        int len = getLongestSubArraySum(a,sum);
        System.out.println("The length of the longest subArray is: "+ len);

    }
}
