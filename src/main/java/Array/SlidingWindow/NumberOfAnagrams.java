package Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfAnagrams {

    public static void main(String[] args) {
        String strr = "aabaabaa";
        char[] strOrginal = strr.toCharArray();

        String str = "aaba";
        char[] strArr = str.toCharArray();

        int start = 0;
        int a = 3;
        int b = 1;
        int count = 4;
        int ans = 0;
        for(int i = 0; i < strOrginal.length; i++){
            if(strOrginal[i] == 'a'){
                a--;
                count--;
            }
            else if(strOrginal[i] == 'b'){
                b--;
                count--;
            }

            if(i-start+1 == strArr.length){
                if(count == 0){
                    ans++;
                    start++;
                    a=3;
                    b=1;
                    count=4;
                }
                else if(count != 0){
                    if (strOrginal[start] == 'a' ){
                        a++;
                        count++;
                        start++;
                    }
                    else if(strOrginal[start] == 'b'){
                        b++;
                        count++;
                        start++;
                    }
                }

            }
        }
        System.out.println("answer = "+ans);
    }
}
