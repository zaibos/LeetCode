package Array.SlidingWindow;

import java.util.HashMap;

public class FruitsOfBasket {
    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        int len = fruits.length;
        int windowSize=0;
        int start=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int end=0; end < len; end++){
            map.put(fruits[end], map.getOrDefault(fruits[end],0)+1);

            while( map.size() > 2){
                map.put(fruits[start], map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            windowSize = Math.max(windowSize, end-start+1);
        }
        System.out.println("Max trees in a line with two kind of fruits => "+windowSize);
    }
}
