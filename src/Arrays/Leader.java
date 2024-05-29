package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leader {
    public static ArrayList<Integer> printLeader(int a[],int len){
        ArrayList<Integer> ans = new ArrayList<>();

        int max = a[ len - 1 ];
        ans.add(a[len - 1]);

        for (int i = len - 2; i >= 0; i--)
            if (a[i] > max){
                ans.add(a[i]);
                max = a[i];
            }
        return ans;
    }
    public static void main(String[] args){

        int a[] = {10, 22, 12, 3, 0, 6};
        int len = a.length;

        ArrayList<Integer> ans = printLeader(a,len);

        Collections.sort(ans,Collections.reverseOrder());

        for (int i = 0; i < ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}
