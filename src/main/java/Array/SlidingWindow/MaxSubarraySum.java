package Array.SlidingWindow;
//Sliding window
//Maximum sum of sub array of size K
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int windowSum = 0;
        int size = 3;

        for(int i=0; i<arr.length; i++){
            windowSum = windowSum + arr[i];

            if(i-start+1 == size){
                maxSum = Math.max(maxSum,windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        System.out.println("larget=> "+maxSum);
    }
}
