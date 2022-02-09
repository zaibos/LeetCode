package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestCommonSubseqRecur {

    public int solve(List<String> s1, List<String> s2, int l1, int l2){

        if (l1 == 0 || l2 == 0){
            return 0;
        }

        else if(s1.get(l1-1).equals(s2.get(l2-1))){
           return 1 + solve(s1,s2,l1-1,l2-1);
        }
        else{
            return Math.max(solve(s1,s2,l1,l2-1),solve(s1,s2,l1-1,l2));
        }

    }


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

        LongestCommonSubseqRecur lngCmnSub = new LongestCommonSubseqRecur();
        int res = lngCmnSub.solve(strings1,strings2,str1.length(),str2.length());
        System.out.println("answer="+res);
    }
}
