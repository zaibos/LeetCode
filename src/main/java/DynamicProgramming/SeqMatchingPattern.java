package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SeqMatchingPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1=");
        String str1 = sc.next();
        List<String> strings1 = new ArrayList<String>(Arrays.asList(str1.split("")));
        System.out.println(strings1.toString());

        System.out.print("Enter string 2=");
        String str2 = sc.next();
        List<String> strings2 = new ArrayList<String>(Arrays.asList(str2.split("")));
        System.out.println(strings2.toString());

        LCSubseqTopDown longestCommonSubseqTopDown = new LCSubseqTopDown(strings1.size()+1,strings2.size()+1 );
        int res = longestCommonSubseqTopDown.solve(strings1,strings2,str1.length(),str2.length());
        System.out.println("answer="+res);

        if(res == str1.length()){
            System.out.println("Match subsequence pattern -> True");
        }else{
            System.out.println("UnMatch subsequence pattern -> False");
        }
    }
}
