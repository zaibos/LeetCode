package DynamicProgramming;

import java.util.Scanner;

public class PalindromePartMemo {
    int[][] mem_arr;
    PalindromePartMemo() {
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


        if (i >= j) {
            return 0;
        }
        if( isPalindrome(arr,i,j) == Boolean.TRUE){
            return 0;
        }

        if(mem_arr[i][j] != -1){
            return mem_arr[i][j];
        }

        mem_arr[i][j] = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = memo(arr, i, k) + memo(arr, k + 1, j) + 1;
            if (mem_arr[i][j] > temp) {
                mem_arr[i][j] = temp;
            }
        }


        return mem_arr[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered String");
        String str = sc.next();

        System.out.println("String arr-> "+str);
        PalindromePartMemo palindromePartMemo = new PalindromePartMemo();

        int res1 = palindromePartMemo.memo(str,0,str.length() - 1);
        System.out.println("memo=> "+res1);
    }
}
