package Array.TwoPointer;

import java.util.Arrays;

public class NumberOfTriangle {

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 8, 16, 21};
        int count = 0;
        for(int i = 2; i < arr.length ; i++ ){
            int left = 0; int right = i-1;
            while(left < right){
                if(arr[left] + arr[right] > arr[i]){
                    count = count + (right - left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        System.out.println("no of triangles = "+count);

    }
}
