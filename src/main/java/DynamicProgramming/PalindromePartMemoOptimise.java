package DynamicProgramming;

import java.util.Scanner;

public class PalindromePartMemoOptimise {

    int[][] mem_arr;
    int left =0;
    int right =0;

    PalindromePartMemoOptimise() {
        int size1 = 1001;
        int target1 = 1001;
        mem_arr = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                mem_arr[i][j] = -1;
            }
        }
    }

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

    public int memo(String arr, int i, int j) {

        int max_part = Integer.MAX_VALUE;


        if (i >= j) {
            return 0;
        }
        if( isPalindrome(arr,i,j) == Boolean.TRUE){
            return 0;
        }

        if(mem_arr[i][j] != -1){
            return mem_arr[i][j];
        }



        for (int k = i; k < j; k++) {
            if(mem_arr[i][k] != -1){

                left = mem_arr[i][k];
            }
            else{
                left = memo(arr,i,k);
                mem_arr[i][k] = left;
            }

            if(mem_arr[k+1][j] != -1){
                right = mem_arr[k+1][j];
            }else{
                right = mem_arr[k+1][j];
                mem_arr[k+1][j] = right;
            }
            int temp = 1+left+right;
            max_part = Math.min(temp,max_part);
            mem_arr[i][j] = max_part;
        }

        return mem_arr[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered String");
        String str = sc.next();

        System.out.println("String arr-> "+str);
        PalindromePartMemoOptimise palindromePartMemoOptimise = new PalindromePartMemoOptimise();

        int res1 = palindromePartMemoOptimise.memo(str,0,str.length() - 1);
        System.out.println("memo=> "+res1);
    }
}
