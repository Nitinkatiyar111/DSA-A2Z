package Arrays;

import java.util.ArrayList;

public class RearrangeBySign {

    public static int[] RearrangeBySign(int[] a,int len){

        ArrayList<Integer> pos = new ArrayList<>(); //for positive
        ArrayList<Integer> neg = new ArrayList<>(); // for negative

        for (int i = 0; i < len; i++){

            // dividing an array into positive and negative
            if (a[i] > 0) pos.add(a[i]);
            else neg.add(a[i]);

        }

        // positives on even indices, negative on add.
        for (int i = 0; i < len/2;i++){
            a[2*i] = pos.get(i);
            a[2*i+1] = neg.get(i);
        }
        return a;
    }

    public static void main(String[] args){
        int a[] = {1,2,-4,-5};
        int len = a.length;

        int ans[] = RearrangeBySign(a,len);

        for (int i = 0; i < len; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
