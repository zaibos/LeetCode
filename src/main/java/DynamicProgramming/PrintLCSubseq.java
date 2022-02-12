package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// print longest common substring
//ABC - STR1
//ABSFC - STR2
// answer=ABC
public class PrintLCSubseq {

    List<String> str_ans = new ArrayList<>();

    public void solve(int[][] tab, List<String> str1, List<String> str2) {

        int i = str1.size();
        int j = str2.size();
        while(i > 0 && j > 0){
            if(str1.get(i-1).equals(str2.get(j-1))){
                str_ans.add(str1.get(i-1));
                i--;
                j--;
            }else{
                if(tab[i][j-1] > tab[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }

        //return str_ans;
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


        PrintLCSubseq printLCSubstring = new PrintLCSubseq();
        printLCSubstring.solve(longestCommonSubseqTopDown.res1, strings1, strings2);

        String reverse = "";
        for (int i=printLCSubstring.str_ans.size()-1; i >= 0; i--){

            reverse = reverse + printLCSubstring.str_ans.get(i);
        }
        System.out.println("answer=>"+reverse);

    }
}
