package Array.MergeIntervals;

import java.util.*;

public class meregArrayIntervals {

    public static <Tuple> void main(String[] args) {

        List<List<Integer>> arrayList = Arrays.asList(Arrays.asList(6, 7), Arrays.asList(2, 4), Arrays.asList(5, 9));
        int min = 0;
        int max = 0;
        List<List<Integer>> tupleList = new ArrayList<List<Integer>>();
        Collections.sort(arrayList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        //System.out.println("arr = "+arrayList.toString());


        for(List<Integer> ele: arrayList){
            if(min == 0 && max == 0){
                min = ele.get(0);
                max = ele.get(1);
            }
            if(ele.get(0) <= max ){
                max = Math.max(max,ele.get(1));
            }else{
                tupleList.add(Arrays.asList(min,max));
                min = ele.get(0);
                max = ele.get(1);
            }
        }
        tupleList.add(Arrays.asList(min,max));
        System.out.println("res = "+tupleList.toString() );
    }
}
