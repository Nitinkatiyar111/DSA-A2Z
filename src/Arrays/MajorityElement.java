package Arrays;

public class MajorityElement {

    public static int majorityElement(int a[],int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {

                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return a[i];
            }

        }
        return -1;
    }
    /* Moore’s Voting Algorithm --> pick one element and keep a track of it
    whenever element found we will increase the count and when different element
    found we will decrease the count at last we will check the count with N/2
     */
      /*public static int majorityElement(int a[],int n){
          int count = 0; // for counting
          int element = 0; // choosing the element

          for (int i = 0; i < n; i++){
              if (count == 0){
                  count = 1;
                  element = a[i];
              } else if (element == a[i]) {
                  count++;
              }
                  else count--;
                  
              }
              // stored element is majority
              int count1 = 0;
              for (int i = 0; i < n; i++){
                  if (a[i] == element)
                      count1++;
              }
              if (count1 > (n/2))
                  return element;
              return -1;

          }*/
    public static void main(String[] args){

        int a[] = {2,2,1,1,1,2,2};
        int n = a.length;

        int result = majorityElement(a,n);
        System.out.println(result);
    }
}
