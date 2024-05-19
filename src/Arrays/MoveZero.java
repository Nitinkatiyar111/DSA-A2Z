package Arrays;

import java.util.ArrayList;

public class MoveZero {

    public static void moveZero(int a[],int len){

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i< len; i++) {
            if (a[i] != 0) {
                arr.add(a[i]);
            }

        }
        int nz = arr.size();
            for (int i = 0; i < nz; i++){
                a[i] = arr.get(i);
            }
            for (int i = nz; i < len; i++){
                a[i] = 0;
            }
            for (int i = 0; i < len; i++){
                System.out.print(a[i]+ " ");
            }
        }

    public static void main(String[] args){
        int a[] = {1,0,2,3,0,4,0,1};
        int len = a.length;

        moveZero(a,len);
    }
}
