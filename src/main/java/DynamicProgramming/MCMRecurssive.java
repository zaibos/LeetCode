package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MCMRecurssive {

    public static int solve(int[] arr, int i, int arr_len) {
        int mn = Integer.MAX_VALUE;

        if(i >= arr_len){
            return 0;
        }
        for(int k=i; k <= arr_len-1; k++){
            int temp = solve(arr, i, k) + solve(arr, k+1, arr_len) + arr[i-1]*arr[k]*arr[arr_len];
            if (temp < mn){
                mn = temp;
            }
        }

        return mn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered array size");
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];
        for(int i=0;i<arr_len;i++){
            System.out.println("input array elements");
            int v = sc.nextInt();
            arr[i]=v;
        }
        int res = solve(arr,1,arr_len-1);
        System.out.println("answer=> "+ res);
    }


}
