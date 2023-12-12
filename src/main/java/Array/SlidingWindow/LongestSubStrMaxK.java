package Array.SlidingWindow;

import java.util.HashMap;
//Longest Substring with maximum K distinct characters
public class LongestSubStrMaxK {


    public static void main(String[] args) {

        String inputStr = "aabacbebebe";
        int len = inputStr.length();
        int size = 3;
        int windowSize= 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int end=0; end<len; end++){
            map.put(inputStr.charAt(end), map.getOrDefault(inputStr.charAt(end),0)+1);

            while(map.size() > size){
                map.put(inputStr.charAt(start), map.get(inputStr.charAt(start)) - 1);
                if(map.get(inputStr.charAt(start)) == 0 ){
                    map.remove(inputStr.charAt(start) );
                }
                start++;
            }
            windowSize = Math.max(windowSize, end-start+1);
        }
        System.out.println("Longest -> "+windowSize);
    }


}
