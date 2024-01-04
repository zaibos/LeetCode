package Array.MergeIntervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumMeetingRoom {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,4),Arrays.asList(2,5),Arrays.asList(7,9));
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        int min = arr.get(0).get(0);
        int max = arr.get(0).get(1);
        int room = 0;

        for(int i=0; i < arr.size(); i++){
            if(arr.get(i).get(0) < max || arr.get(i).get(0) == max) {
                room++;
            }
        }

        System.out.println("Number of rooms = "+room);
    }
}
