package Array.SlidingWindow;

import java.util.HashMap;
//Longest Subarray with Ones after Replacement
public class LongestSubArrOfOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=2;
        int start=0;
        int maxCountOfRepeatingLetter = 0;
        int windowSize=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int end=0; end < arr.length; end++){
            if(arr[end] == 0){
                maxCountOfRepeatingLetter ++;
            }

            if( maxCountOfRepeatingLetter > k){
                if(arr[start] == 0){
                    maxCountOfRepeatingLetter --;
                }
                start++;
            }
            windowSize = Math.max(windowSize, end-start+1);
        }
        System.out.println("Longest -> "+windowSize);
    }
}
