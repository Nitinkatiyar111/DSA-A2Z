package Arrays;

import java.util.HashMap;
import java.util.Map;

public class AppearOnes {

    public static int appearOnes(int a[],int len){

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < len; i++){

            int value = hmap.getOrDefault(a[i],0);
            hmap.put(a[i],value+1);

        }
        for (Map.Entry<Integer,Integer> it : hmap.entrySet()){
            if (it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int a[] = {4,1,2,1,2};
        int len = a.length;

        System.out.println(appearOnes(a,len));
    }
}
