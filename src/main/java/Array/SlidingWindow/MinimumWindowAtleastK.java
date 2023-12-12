package Array.SlidingWindow;

import java.util.HashMap;

public class MinimumWindowAtleastK {

    public static void main(String[] args) {

        String inputStr = "aabacbebebe";
        char[] str1 = inputStr.toCharArray();
        String str = "abc";
        char[] str2 = str.toCharArray();

        int start = 0;
        int count = 3;
        int min = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str2.length; i++){
            map.put(str2[i], map.getOrDefault(map.get(str2[i]),0) + 1 );
        }

        for(int end=0; end<str1.length; end++){

            if(map.containsKey(str1[end])) {
                map.put(str1[end], map.get(str1[end]) - 1);
            }

            if(map.get(str1[end]) <= 0 ){
                count--;
            }


            while(count==0) {
                min = end-start +1;
                min = Math.min(min, end-start +1);
                if(map.containsKey(str1[start])){
                    map.put(str1[start], map.get(str1[start]) - 1);
                    if(map.get(str1[start]) < 0 ){
                        count++;
                    }
                }
                start++;
            }

        }
        System.out.println("Longest -> "+min);
    }


}
