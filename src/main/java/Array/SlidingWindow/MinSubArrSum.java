package Array.SlidingWindow;
//Smallest sub array window with a given sum
public class MinSubArrSum {
    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,2};
        int minWindow = Integer.MAX_VALUE;
        int start = 0;
        int windowSum = 0;
        int sum = 7;

        for(int i=0; i<arr.length; i++){
            windowSum = windowSum + arr[i];

            while(windowSum >= sum){
                minWindow = Math.min(minWindow,i-start+1);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        System.out.println("larget=> "+minWindow);
    }
}
