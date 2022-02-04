package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
// Find the minimum difference from subsets of int array
public class MinimumSubsetDiff {

    public Boolean[][] knap(int[] arr, int sum, Boolean[][] res, int len){
        for(int i=1;i<len+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1] <= j){
                    res[i][j] = (res[i - 1][j]) || (res[i - 1][j - arr[i - 1]]);
                }
                else if(arr[i-1] > j){
                    res[i][j] = res[i-1][j];
                }
            }
        }

        return res;
    }

    public int solve(int[] arr, int len){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        Boolean[][] res = new Boolean[len+1][sum+1];
        for(int i=0;i<len+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0){
                    res[i][j] = Boolean.TRUE;
                }
                else if(i==0){
                    res[i][j] = Boolean.FALSE;
                }
            }
        }

        Boolean[][] matrix = knap(arr,sum,res,len);

        int diff = Integer.MAX_VALUE;
        for(int i=sum/2 ; i >= 0 ; i--){
            if(matrix[len][i] == true){
                diff = sum - (2*i);
                break;
            }
        }

        return diff;

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

        MinimumSubsetDiff eq = new MinimumSubsetDiff();
        int result = eq.solve(arr,arr_len);
        System.out.println("answer="+result);
    }
}
