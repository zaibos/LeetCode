package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
// Minimum number of ways to choose coins from int array to give you equal sum/target.
public class MinimumWaysCoin {
    int size1;
    int target1;
    int[][] res1;

    MinimumWaysCoin(int arr_len,int rod_len) {
        size1 = arr_len;
        target1 = rod_len;
        res1 = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                if (j == 0) {
                    res1[i][j] = 0;
                } else if (i == 0) {
                    res1[i][j] = Integer.MAX_VALUE -1;
                }
            }
        }


    }

    public int solve(int[] arr, int target) {
        for (int j=1;j<(target+1);j++){
            if(j % arr[0] == 0){
                res1[1][j] = j / arr[0];
            }
            else{
                res1[1][j] = Integer.MAX_VALUE -1;
            }
        }

        int size = arr.length;
        for (int i=2;i<size+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1] <= j){
                    res1[i][j] = Math.min(res1[i - 1][j] , 1 + (res1[i][j - arr[i - 1]]));
                }
                else if(arr[i-1] > j){
                    res1[i][j] = res1[i-1][j];
                }
            }
        }

        if (res1[size][target] == Integer.MAX_VALUE -1){
            return -1;
        }else{
            return res1[size][target];
        }


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
        System.out.println("your input array is="+ Arrays.toString(arr));
        System.out.println("enter sum=");
        int target = sc.nextInt();

        MinimumWaysCoin minimumWaysCoin = new MinimumWaysCoin(arr_len+1,target+1);
        int result = minimumWaysCoin.solve(arr,target);
        System.out.println("answer="+result);
    }

}
