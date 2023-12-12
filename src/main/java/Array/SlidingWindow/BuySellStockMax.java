package Array.SlidingWindow;

public class BuySellStockMax {
    public static void main(String[] args) {
        int[] arr = {7,1,5,9,6,4};
        int maxProfit = 0;
        int maxRight = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            maxRight = Math.max(maxRight,arr[i]);
            maxProfit = Math.max(maxProfit, maxRight-arr[i]);
        }
        System.out.println(maxProfit);
    }
}
