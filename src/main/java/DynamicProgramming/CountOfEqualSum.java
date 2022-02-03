package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfEqualSum {

    int size1;
    int target1;
    int[][] res1;

    CountOfEqualSum(int arr_len,int target) {
        size1 = arr_len;
        target1 = target;
        res1 = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                if (j == 0) {
                    res1[i][j] = 1;
                } else if (i == 0) {
                    res1[i][j] = 0;
                }
            }
        }
    }

    public int solve(int[] arr,int target) {
        int size = arr.length;
        for (int i=1;i<size+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1] <= j){
                    res1[i][j] = (res1[i - 1][j]) + (res1[i - 1][j - arr[i - 1]]);
                }
                else if(arr[i-1] > j){
                    res1[i][j] = res1[i-1][j];
                }
            }
        }

        return res1[size][target];
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterd array size");
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];
        for(int i=0;i<arr_len;i++){
            System.out.println("input array elements");
            int v = sc.nextInt();
            arr[i]=v;
        }
        System.out.println("your input array is="+ Arrays.toString(arr));
        System.out.println("enter sum=");
        int target = sc.nextInt();

        CountOfEqualSum eq = new CountOfEqualSum(arr_len+1,target+1);
        int result = eq.solve(arr,target);
        System.out.println("answer="+result);
    }
}
