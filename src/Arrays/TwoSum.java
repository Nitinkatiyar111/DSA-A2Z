package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static boolean twoSum(int a[],int len,int target){

        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i< len; i++) {
            int num = a[i];
            int required = target - a[i];

            if (hmap.containsKey(required)){
                return true;
            }
            hmap.put(a[i],i);
        }
        return false;
    }

    public static void main(String[] args){

        int a[] = {2,6,5,8,11};
        int target = 14;
        int len = a.length;

        boolean result = twoSum(a,len,target);

        System.out.println(result);

    }
}
