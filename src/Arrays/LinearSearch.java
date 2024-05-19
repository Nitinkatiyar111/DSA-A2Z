package Arrays;

public class LinearSearch {

    public static void linearSearch(int a[],int len,int num){
             int i;
        for (i = 0; i < len; i++){
            if (a[i] == num){
                break;
            }

        }
        System.out.println(i);
    }

    public static void main(String[] args){

        int a[] = {1,2,3,4,5};
        int num = 3;
        int len = a.length;

        linearSearch(a,len,num);
    }
}
