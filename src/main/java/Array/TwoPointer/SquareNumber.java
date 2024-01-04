package Array.TwoPointer;

//Square the sorted array and keep the array sorted even after negative number getting squared

import java.util.Arrays;

public class SquareNumber {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,2,4};
        int left = 0;
        int right = arr.length -1;
        int[] res = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }

        for(int pos = arr.length-1; pos >= 0; pos--){
            if(arr[left] < arr[right]){
                res[pos] = arr[right];
                right--;
            }
            else{
                res[pos] = arr[left];
                left++;
            }
        }
        System.out.println("Result = "+ Arrays.toString(res));
    }
}
