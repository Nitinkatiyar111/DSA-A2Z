package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {

    //Dutch National flag algorithm
    public static void sortArray(ArrayList<Integer> a,int len){
     int low = 0, mid = 0, high = len - 1; // 3 pointer

        while (mid <= high){
            if (a.get(mid) == 0){
                // swapping a[low] and a[mid]
                int temp = a.get(low);
                a.set(low,a.get(mid));
                a.set(mid,temp);

                low++;
                mid++;
            }
            else if (a.get(mid) == 1){
                mid++;
            }
            else {

                int temp = a.get(mid);
                a.set(mid,a.get(high));
                a.set(high,temp);
                high--;
            }
        }



    }

    public static void main(String[] args){
        ArrayList<Integer> a =
                new ArrayList<>(Arrays.asList(new Integer[]{0,2,1,2,0,1}));
        int len = a.size();
        sortArray(a,len);
        System.out.println("After sorting");
        for (int i = 0; i < len ; i++){
            System.out.print(a.get(i)+ " ");
        }
        System.out.println();
    }
}
