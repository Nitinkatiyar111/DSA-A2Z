package Arrays;

/*Intuition: prefix sum of a subarray ending at index i simply means that sum of
all the elements of that subarray
* */

import java.util.HashMap;

public class PrefixSum {
    public static int findAllSubarraysWithGivenSum(int a[],int k){
        int n = a.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int preSum = 0,count = 0;
        hmap.put(0,1); // setting 0 in the map

        for (int i = 0; i < n; i++){
            // add current element to prefix sum
            preSum += a[i];

            // calculate x-k;
            int remove = preSum - k;

            // number of subarrays to be removed
            count += hmap.getOrDefault(remove,0);

            // if prefix is in the map
            hmap.put(preSum,hmap.getOrDefault(preSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args){
     int a[] = {3,1,2,4};
     int k = 6;
     int count = findAllSubarraysWithGivenSum(a,k);
     System.out.println("The number of subarrays is: "+ count);
    }
}
