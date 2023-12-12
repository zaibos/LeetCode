package Array.TwoPointer;

import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        int low = 0;
        int high = arr.length-1;
        for(int i=0; i <= high;){

            if(arr[i] == 0){
                swap(arr,i,low);
                i++;
                low++;
            }else if(arr[i] == 1){
                i++;
            }
            else{
                swap(arr,i,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
