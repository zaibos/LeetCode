package Array.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfIntervals {

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,3),Arrays.asList(5,10),Arrays.asList(12,17));
        List<List<Integer>> arr1 = Arrays.asList(Arrays.asList(2,4),Arrays.asList(5,7),Arrays.asList(9,13));

        List<List<Integer>> res = new ArrayList<>();

        int ptr1 = 0;
        int ptr2 = 0;

        while(ptr1 < arr.size() && ptr2 < arr1.size()){
            int min = Math.max(arr.get(ptr1).get(0), arr1.get(ptr2).get(0));
            int max = Math.min(arr.get(ptr1).get(1), arr1.get(ptr2).get(1));

            if(min <= max){
                res.add(Arrays.asList(min,max));
            }
            if(arr.get(ptr1).get(1) < arr1.get(ptr2).get(1)){
                ptr1++;
            }else {
                ptr2++;
            }
        }

        System.out.println("intersection = "+res.toString());

    }
}
