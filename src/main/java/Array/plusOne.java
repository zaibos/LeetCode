package Array;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9};
        int size = arr.length;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != 9){
                arr[i]++;
                break;
            }else{
                arr[i]=0;
            }
        }
        if(arr[0]==0){
            int[] new_arr = new int[size+1];
            new_arr[0]=1;
            System.out.println(Arrays.toString(new_arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
