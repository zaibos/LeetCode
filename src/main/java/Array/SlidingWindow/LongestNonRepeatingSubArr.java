package Array.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//Longest substring with distinct characters.
public class LongestNonRepeatingSubArr {
    public static void main(String[] args) {
        String[] arr = {"p","w","w","k","e","w"};
        Set<String> map = new HashSet<>();
        int windowSize = 0;
        int start = 0;

        for(int end=0; end < arr.length; end++){

            while(map.contains(arr[end])){
                map.remove(arr[start]);
                start++;
            }
            map.add(arr[end]);
            windowSize = Math.max(windowSize, end-start+1);
        }
        System.out.println("Longest non repeating -> "+map.size());
    }
}
