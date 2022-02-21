package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimumInsertDelete {

    public void solve(int res, int l1, int l2){
        System.out.println("Deletion=> "+(l1-res));
        System.out.println("Insertion=> "+(l2-res));
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
        System.out.println("answer="+res);

        MinimumInsertDelete minimumInsertDelete = new MinimumInsertDelete();
        minimumInsertDelete.solve(res,strings1.size(),strings2.size());

    }
}
