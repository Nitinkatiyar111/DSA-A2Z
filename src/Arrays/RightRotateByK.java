package Arrays;

public class RightRotateByK {

    // for rotate
    public static void rightRotateByK(int[] a,int n,int k){

        // reverse first n-k element
        Reverse(a,0,n-k-1);
        // reverse last k element
        Reverse(a,n-k,n-1);
        // reverse whole array
        Reverse(a,0,n-1);
    }
    public static void Reverse(int a[],int start, int end){
        while (start <= end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6,7};
        int k  = 2;
        int len = a.length;

        rightRotateByK(a,len,k);
        System.out.println("After roatating the k elements to left");
        for (int i = 0; i < len; i++){
           System.out.print(a[i]+ " ");
        }
    }
}
