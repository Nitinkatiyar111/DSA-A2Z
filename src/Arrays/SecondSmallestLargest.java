public class SecondSmallestLargest{

    public static  int secondLargest(int a[],int len){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++){

            if (a[i] > largest){
                secondLargest = largest;
                largest  = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest){
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }
    public static int secondSmallest(int a[],int len){
          int smallest = Integer.MAX_VALUE;
          int secondSmallest = Integer.MAX_VALUE;

          for (int i = 0; i < len; i++){

              if (a[i] < smallest){
                  secondSmallest = smallest;
                  smallest = a[i];
              }
              else if (a[i] < secondSmallest && a[i] != smallest){
                  secondSmallest = a[i];
              }
          }
          return secondSmallest;
    }

    public static void main(String[] args){
        int a[]  = {1,2,4,7,7,5};
        int len = a.length;
        System.out.println("Second Largest number is : "+ secondLargest(a,len));
        System.out.println("Second smallest number is: "+ secondSmallest(a,len));

    }
}