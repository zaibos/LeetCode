package Array.TwoPointer;

import java.util.Arrays;

public class MergeTwoSortedWithoutUsingExtraSpace {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] arr1 = {0,2,6,8,9};
        int m=3;
        int n=4;
        int start = 0;
        int end = m;
        int i=arr.length-1;
        while(end >= 0 && start < n) {
            if (m >= 0 && arr[end] > arr1[start]) {
                int temp = arr[end];
                arr[i] = arr1[start];
                arr1[start] = temp;
                i--;
                end--;
                start++;
                //System.out.println(Arrays.toString(arr));
            }else{break;}
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
