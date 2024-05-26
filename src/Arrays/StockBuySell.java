package Arrays;

public class StockBuySell {

    public static int maxProfit(int[] a){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++){
            minPrice = Math.min(minPrice,a[i]);
            maxPro = Math.max(maxPro,a[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args){
        int a[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(a);
        System.out.println("Max profit is: "+ maxPro);
    }
}
