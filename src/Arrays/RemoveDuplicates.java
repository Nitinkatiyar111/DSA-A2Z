package Arrays;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void removeDuplicate(int a[],int len){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < len; i++){
            hashSet.add(a[i]);
        }
     System.out.println(hashSet);
    }

    public static void main(String[] args){

        int a[] = {1,1,2,2,2,3,3};
        int len = a.length;

        removeDuplicate(a,len);
        
    }
}
