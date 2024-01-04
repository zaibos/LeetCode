package Array.MergeIntervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumCPULoad {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(6,7,10),Arrays.asList(2,4,11),Arrays.asList(8,12,15));
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        int min = arr.get(0).get(0);
        int max = arr.get(0).get(1);
        int load = 0;

        for(int i=0; i < arr.size(); i++){
            if(arr.get(i).get(0) < max || arr.get(i).get(0) == max) {
                load = Math.max(load, arr.get(i).get(2) + load);
            }
            else{
                load = Math.max(load, arr.get(i).get(2));
            }
        }

        System.out.println("Maximum load = "+load);

    }
}
