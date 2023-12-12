package Array.BinarySearch;

import java.util.HashMap;
import java.util.Map;

//Leetcode 26
public class RemoveDuplicate {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {0,0,1,1,2,2,3,3};
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
        }

    }


}
