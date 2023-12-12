package Array.TwoPointer;

import java.util.Arrays;

public class DuplicateRemoval {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,4,5};
        int i = 0;
        for(int j=1; j < arr.length ; j++){

            if(arr[i] == arr[j]){
                continue; //do nothing
            }
            else{
                arr[i+1] = arr[j]; //bring j value in front of i (next to current i position)
                i=i+1; //update i position by 1
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
