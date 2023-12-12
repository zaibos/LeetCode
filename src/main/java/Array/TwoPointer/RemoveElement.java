package Array.TwoPointer;

import java.util.Arrays;

//leetcode-27
public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int n = 3;
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != n){
                arr[start] = arr[i];
                start++;
            }
        }
        System.out.println(start);
    }
}
