package Arrays;

public class SubArraySum {

    public static int findAllSubArrayWithGivenSum(int a[],int n,int k){
        int count = 0; // number of subArrays

        for (int i = 0; i < n ; i++){
            int sum = 0;
            for (int j = i; j < n; j++ ){

                sum += a[j];

                // if sum == k increase the count

                if (sum == k)
                    count++;
            }
        }
         return count;
    }


    public static void main(String[] args){

        int a [] = {3,1,2,4};
        int n = a.length;
        int k = 6;
        int count = findAllSubArrayWithGivenSum(a,n,k);
        System.out.println("The number of SubArrays is: "+count);
    }
}
