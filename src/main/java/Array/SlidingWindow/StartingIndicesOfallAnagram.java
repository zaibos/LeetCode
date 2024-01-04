package Array.SlidingWindow;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartingIndicesOfallAnagram {
    public static void main(String[] args) {
            String str = "cbaeabbacd";
            String str1 = "acb";

            int start = 0;
            int end = 0;
            int match = 0;

            Map<Character, Integer> map = new HashMap<Character, Integer>();
            List<Integer> indices = new ArrayList<Integer>();


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

                if(match == str1.length()){
                    System.out.println("Found Anagram");
                    indices.add(start);
                    //break;
                }

                if(i >= str1.length() -1){
                    char left = str.charAt(start);
                    start++;

                    if(map.containsKey(left)){
                        if(map.get(left) == 0){
                            match--;
                        }
                        map.put(left, map.get(left) + 1);
                    }

                }

            }

            System.out.println("Indices = "+indices.toString());

        }
}
