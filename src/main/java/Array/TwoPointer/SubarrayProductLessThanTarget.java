package Array.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarrayProductLessThanTarget {
    public static void main(String[] args) {
        int[] arr = {2,5,5,10};
        int product = 30;
        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap();
//        for(int i=0; i < arr.length-1; i++){
//            map.put(i,arr[i]);
//        }

        for(int i = 0; i < arr.length - 2; i++){
            List<Integer> sub = new ArrayList<>();
            if(map.getOrDefault(i,0).equals(arr[i])) {
                continue;
            }
            if(arr[i] < product && arr[i+1] < product){
                int left = i;
                int right = i+1;
                map.put(i,arr[i]);
                map.put(i+1,arr[i+1]);
                res.add(new ArrayList<>(Arrays.asList(arr[left])));res.add(new ArrayList<>(Arrays.asList(arr[right])));

                if(arr[left] * arr[right] < product){
                    sub.add(arr[left]);sub.add(arr[right]);
                    res.add(sub);
                }
            }else if(arr[i] < product)res.add(new ArrayList<>(Arrays.asList(arr[i])));
            else if(arr[i+1] < product)res.add(new ArrayList<>(Arrays.asList(arr[i+1])));
        }
        System.out.println("Subarray = "+res.toString());
    }
}
