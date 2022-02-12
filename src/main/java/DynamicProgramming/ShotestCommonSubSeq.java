package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Print length of shortest common subsequence
// Enter string 1=AGGTAB
//[A, G, G, T, A, B]
//Enter string 2=GXTXAYB
//[G, X, T, X, A, Y, B]
// answer = 9 [AGGXTXAYB]
public class ShotestCommonSubSeq {

    public int solve(int res, int m, int n) {
        int length = m + n - res ;
        return length;
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

        LCSubseqTopDown longestCommonSubseqTopDown = new LCSubseqTopDown(strings1.size()+1,strings2.size()+1 );
        int res = longestCommonSubseqTopDown.solve(strings1,strings2,str1.length(),str2.length());

        ShotestCommonSubSeq shotestCommonSubSeq = new ShotestCommonSubSeq();
        int result = shotestCommonSubSeq.solve(res,strings1.size(),strings2.size());

        System.out.println("answer=>"+result);

    }
}
