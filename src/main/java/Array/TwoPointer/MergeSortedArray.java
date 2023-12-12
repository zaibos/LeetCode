package Array.TwoPointer;

import java.util.Arrays;

//using two pointer on sorted array
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,0};
        int[] arr1 = {2,5,6};
        int m=1;
        int n=2;
        int i=arr.length-1;
        while(n >= 0) {
            if (m >= 0 && arr[m] > arr1[n]) {
                arr[i] = arr[m];
                i--;
                m--;
                System.out.println(Arrays.toString(arr));
            }
            else{
                arr[i] = arr1[n];
                i--;
                n--;
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
