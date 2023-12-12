package Array.SlidingWindow;

import java.util.HashMap;

//Length of Longest substring of same letters after K Replacements
public class MaxLenSameLetterReplacement {
    public static void main(String[] args) {
        String inputStr = "abbcb";
        int k=1;
        int start=0;
        int maxCountOfRepeatingLetter = 0;
        int windowSize=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int end=0; end < inputStr.length(); end++){

            map.put(inputStr.charAt(end), map.getOrDefault(inputStr.charAt(end),0)+1);
            maxCountOfRepeatingLetter = Math.max(maxCountOfRepeatingLetter, map.get(inputStr.charAt(end)));

            if( (end-start+1) - maxCountOfRepeatingLetter > k){
                map.put(inputStr.charAt(start), map.get(inputStr.charAt(start)) - 1);
//                if(map.get(inputStr.charAt(start)) == 0 ){
//                    map.remove(inputStr.charAt(start) );
//                }
                start++;
            }
            windowSize = Math.max(windowSize, end-start+1);
        }
        System.out.println("Longest -> "+windowSize);
        }
}
