package Array.TwoPointer;

import java.lang.reflect.Array;
import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int tar = 6;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i< arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            int sum = tar - arr[i];
            while(left < right){
                int t = arr[left] + arr[right];
                if(t < sum){
                    left++;
                }else if(t > sum){
                    right--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);temp.add(arr[left]);temp.add(arr[right]);
                    left++;
                    res.add(temp);
                }
            }
        }
        System.out.println("answer -> "+res.toString());
    }

}
