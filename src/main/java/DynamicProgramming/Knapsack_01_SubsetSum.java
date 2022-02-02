package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_01_SubsetSum {

    int size1;
    int target1;
    Boolean[][] res1;

    Knapsack_01_SubsetSum(int arr_len,int target){
        size1 = arr_len;
        target1 = target;
        res1 = new Boolean[size1][target1];

        for (int i=0;i< size1;i++){
            for(int j=0;j< target1;j++){
                if(j==0){
                    res1[i][j] = Boolean.TRUE;
                }
                else if(i==0){
                    res1[i][j] = Boolean.FALSE;
                }
            }
        }

        System.out.println("*****res1******");
        for (int i=0;i<arr_len;i++) {
            System.out.println();
            for (int j = 0; j < target; j++) {
                System.out.print(res1[i][j]+",");
            }
        }

    }


    public void solve(int[] arr, int target){
        int size = arr.length;
        Boolean[][] res = new Boolean[size+1][target+1];
        for (int i=0;i<size+1;i++){
            for(int j=0;j<target+1;j++){
                if(j==0){
                    res[i][j] = Boolean.TRUE;
                }
                else if(i==0){
                    res[i][j] = Boolean.FALSE;
                }
            }
        }

        boolean result = topDown(res,arr,target);
        System.out.println("answer="+result);
        for (int i=0;i<size+1;i++) {
            System.out.println();
            for (int j = 0; j < target + 1; j++) {
                System.out.print(res[i][j]+",");
            }
        }
    }



    public boolean topDown(Boolean[][] res,int[] arr, int target){

        int size = arr.length;
        for (int i=1;i<size+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1] <= j){
                    res[i][j] = (res[i - 1][j]) || (res[i - 1][j - arr[i - 1]]);
                }
                else if(arr[i-1] > j){
                    res[i][j] = res[i-1][j];
                }
            }
        }

        return res[size][target];
    }

    public boolean memoization(int[] arr, int target, int arr_len, Boolean[][] res1){

        if(res1[arr_len][target] != null){
            return res1[arr_len][target];
        }

        if(arr[arr_len-1] <= target){
            return res1[arr_len][target] = memoization(arr,target - arr[arr_len-1],arr_len-1,res1) || memoization(arr,target,arr_len-1,res1) ;
        }
        else if(arr[arr_len-1] > target){
            return memoization(arr,target,arr_len-1,res1);
        }

        return res1[arr.length+1][target];
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
        System.out.println("your input array is="+Arrays.toString(arr));
        //int size_arr = sc.nextInt();
        System.out.println("Enter target=");
        int target = sc.nextInt();
        //subsetSum.solve(arr,target);

        Knapsack_01_SubsetSum subsetSum = new Knapsack_01_SubsetSum(arr_len+1,target+1);



        Boolean memo_result = subsetSum.memoization(arr,target,arr.length,subsetSum.res1);
        System.out.println("answer memo="+memo_result);

    }
}
