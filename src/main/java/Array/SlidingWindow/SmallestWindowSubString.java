package Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubString {

    public static void main(String[] args) {
        String str = "aezbfacb";
        String str1 = "acb";

        int start = 0;
        int end = 0;
        int match = 0;
        int window = Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0 ) + 1);
        }

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) - 1);
                if(map.get(str.charAt(i)) == 0){
                    match++;
                }
            }

            while(match == str1.length()) {
                System.out.println("Found Anagram");
                window = Math.min(window, i - start + 1);
                //break;

                char left = str.charAt(start);
                start++;

                if (map.containsKey(left)) {
                    if (map.get(left) == 0) {
                        match--;
                    }
                    map.put(left, map.get(left) + 1);
                }

            }
        }
        System.out.println("result = "+window);
    }
}
