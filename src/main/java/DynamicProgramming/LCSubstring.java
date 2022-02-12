package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LCSubstring {

    int size1;
    int target1;
    int[][] res1;

    LCSubstring(int arr_len, int target) {
        size1 = arr_len;
        target1 = target;
        res1 = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                if (i == 0 || j == 0) {
                    res1[i][j] = 0;
                }
            }
        }
    }

    public int solve(List<String> s1, List<String> s2, int l1, int l2) {
        int result = 0;
        for (int i=1; i<(l1+1); i++){
            for(int j=1; j<(l2+1); j++){
                if(s1.get(i-1).equals(s2.get(j-1))){
                    res1[i][j] = 1 + res1[i-1][j-1];
                    result = Math.max(result,res1[i][j]);
                }
                else{
                    res1[i][j] = 0;
                }
            }
        }
        return result;
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

        LCSubstring lc = new LCSubstring(strings1.size()+1,strings2.size()+1 );
        int res = lc.solve(strings1,strings2,str1.length(),str2.length());
        System.out.println("answer="+res);
        System.out.println("*****res1******");
        for (int i=0;i< strings1.size()+1;i++) {
            System.out.println();
            for (int j = 0; j < strings2.size()+1; j++) {
                System.out.print(lc.res1[i][j]+",");
            }
        }
    }
}
