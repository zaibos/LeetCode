package Array.TwoPointer;

import java.lang.reflect.Array;
import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 1, 2};
        int tar = 0;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i< arr.length-2; i++){
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
            {continue;}
            int left = i+1;
            int right = arr.length-1;
            int sum = tar - arr[i];
            while(left < right){
                int t = arr[left] + arr[right];
                if(t < sum ){
                    left++;
                }else if(t > sum ){
                    right--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);temp.add(arr[left]);temp.add(arr[right]);
                    res.add(temp);
                    left++;
                    right--;
                    //while (left < right && arr[left] == arr[left - 1])
                        //left++; // skip same element to avoid duplicate triplets
                    //while (left < right && arr[right] == arr[right + 1])
                        //right--; // skip same element to avoid duplicate triplets

                }
            }
        }
        System.out.println("answer -> "+res.toString());
    }

}
