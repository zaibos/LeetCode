package DynamicProgramming;

import java.util.Scanner;

public class MCM {
    int[][] mem_arr;
    MCM() {
        int size1 = 1001;
        int target1 = 1001;
        mem_arr = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                mem_arr[i][j] = -1;
            }
        }
    }


    public int memo(int[] arr, int i, int arr_len) {


        if (i >= arr_len) {
            return 0;
        }

        if(mem_arr[i][arr_len] != -1){
            return mem_arr[i][arr_len];
        }

        mem_arr[i][arr_len] = Integer.MAX_VALUE;

        for (int k = i; k <= arr_len - 1; k++) {
            int temp = memo(arr, i, k) + memo(arr, k + 1, arr_len) + arr[i - 1] * arr[k] * arr[arr_len];
            if (mem_arr[i][arr_len] > temp) {
                mem_arr[i][arr_len] = temp;
            }
        }


        return mem_arr[i][arr_len];
    }

    public static int recursion(int[] arr, int i, int arr_len) {
        int mn = Integer.MAX_VALUE;

        if(i >= arr_len){
            return 0;
        }
        for(int k=i; k <= arr_len-1; k++){
            int temp = recursion(arr, i, k) + recursion(arr, k+1, arr_len) + arr[i-1]*arr[k]*arr[arr_len];
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

        MCM mcm = new MCM();
        int res = mcm.recursion(arr,1,arr_len-1);
        System.out.println("answer=> "+ res);
        int res1 = mcm.memo(arr,1,arr_len-1);
        System.out.println("memo=> "+res1);
    }




}
