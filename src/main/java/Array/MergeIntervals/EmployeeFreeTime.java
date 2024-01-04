package Array.MergeIntervals;

import java.util.*;

public class EmployeeFreeTime {
    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1,3),Arrays.asList(9,12),Arrays.asList(2,4), Arrays.asList(6,8));
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        int min = 0;
        int max = 0;

        List<List<Integer>> tupleList = new ArrayList<List<Integer>>();

        for(List<Integer> ele: arr){
            if(min == 0 && max == 0){
                min = ele.get(0);
                max = ele.get(1);
            }
            if(ele.get(0) <= max ){
                max = Math.max(max,ele.get(1));
            }else{
                min = ele.get(0);
                tupleList.add(Arrays.asList(max,min));
                max = ele.get(1);
            }
        }
        //tupleList.add(Arrays.asList(min,max));

        System.out.println("res = "+tupleList.toString());
    }
}
