package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
// Is given array have subsets where partitions of array can give you equal sums for any 2 subsets.
public class EqualSumPartition {


    public boolean solve(int[] arr){
        int sum=0;
        int arr_len = arr.length;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i] ;
        }
        if(sum % 2 == 0){
            int sum_check = sum/2;
            Knapsack_01_SubsetSum subsetSum = new Knapsack_01_SubsetSum(arr_len+1,sum_check+1);
            Boolean memo_result = subsetSum.memoization(arr,sum_check,arr.length,subsetSum.res1);
            return memo_result;
        }
        else{
            return false;
        }

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

        EqualSumPartition eq = new EqualSumPartition();
        boolean result = eq.solve(arr);
        System.out.println("answer="+result);

    }
}
