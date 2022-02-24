package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalindromePartRecur {

    public Boolean isPalindrome(String str,int i,int j){

        if (i == j) {
            return Boolean.TRUE;
        }
        else if (i > j ){
            return Boolean.TRUE;
        }
        else{
            while (j > i ){
                if (str.charAt(i) != str.charAt(j)){
                    return Boolean.FALSE;
                }
                i += 1;
                j -= 1;

            }
            return Boolean.TRUE;
        }
    }

    public int solve(String strings1, int i, int j) {

        int mn = Integer.MAX_VALUE;
        if( i >= j){ return 0;}
        if( isPalindrome(strings1,i,j) == Boolean.TRUE){
            return 0;
        }

        for (int k=i; k<j; k++){
            int temp = 1 + solve(strings1,i,k) + solve(strings1,k+1,j);
            mn = Math.min(mn,temp);
        }
        return mn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string =");
        String str1 = sc.next();
        List<String> strings1 = new ArrayList<String>(Arrays.asList(str1.split("")));

        PalindromePartRecur partRecur = new PalindromePartRecur();
        System.out.println("length of string=> "+str1.length());
        int res = partRecur.solve(str1, 0, str1.length() - 1);

        System.out.println("answer=>"+res);


    }
}
