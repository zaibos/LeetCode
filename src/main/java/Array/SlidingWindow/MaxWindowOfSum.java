package Array.SlidingWindow;
//Maximum window of given sum
public class MaxWindowOfSum {
    public static void main(String[] args) {
        int[] arr = {2,-5,5,2,3,2};
        int maxWindow = Integer.MIN_VALUE;
        int start = 0;
        int windowSum = 0;
        int sum = 4;

        for(int i=0; i<arr.length; i++){
            windowSum = windowSum + arr[i];

            while(windowSum >= sum){
                maxWindow = Math.max(maxWindow, i-start+1 );
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        System.out.println("larget=> "+maxWindow);
    }
}
