package Arrays;

public class ConsecutiveOnes {

    public static int consecutiveOnes(int a[], int len) {
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                count = 0;
            }
        maxi = Math.max(maxi, count);
    }
        return maxi;
}

    public static void main(String[] args){
        int a[] = {1,1,0,1,1,1,0,0,1,1,1,1};
        int len = a.length;

        int result = consecutiveOnes(a,len);
        System.out.println(result);
    }
}
