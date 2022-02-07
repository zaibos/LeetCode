package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class UnboundedKnpsack_RodCutting {

    int size1;
    int target1;
    int[][] res1;

    UnboundedKnpsack_RodCutting(int arr_len,int rod_len) {
        size1 = arr_len;
        target1 = rod_len;
        res1 = new int[size1][target1];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < target1; j++) {
                if (j == 0) {
                    res1[i][j] = 0;
                } else if (i == 0) {
                    res1[i][j] = 0;
                }
            }
        }

        System.out.println("*****res1******");
        for (int i=0;i<size1;i++) {
            System.out.println();
            for (int j = 0; j < target1; j++) {
                System.out.print(res1[i][j]+",");
            }
        }


    }

    public int top_down(int[] size_arr, int[] price_arr, int rod_length, int[][] res1) {
        int size = size_arr.length;
        for (int i=1;i<size+1;i++){
            for(int j=1;j<rod_length+1;j++){

                if(size_arr[i-1] <= j){
                    res1[i][j] = Math.max(res1[i-1][j] , price_arr[i - 1] + res1[i][j - size_arr[i - 1]] );
                }
                else if(size_arr[i-1] > j){
                    res1[i][j] = res1[i-1][j];
                }
            }
        }
        System.out.println("*****res1******");
        for (int i=0;i<(size+1);i++) {
            System.out.println();
            for (int j = 0; j < (rod_length+1); j++) {
                System.out.print(res1[i][j]+",");
            }
        }
        return res1[size][rod_length];

    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enterd rod size");
            int arr_len = sc.nextInt();
            int sum = 0;
            int[] arr = new int[arr_len];
            for(int i=0;i<arr_len;i++){
                System.out.println("input rod array elements");
                int v = sc.nextInt();
                arr[i]=v;
                sum =sum +arr[i];
            }
            System.out.println("your input array is="+ Arrays.toString(arr));
            //int size_arr = sc.nextInt();
            System.out.println("Enter price for rod pieces=");
            int[] prize = new int[arr_len];
            for(int i=0;i<arr_len;i++){
                System.out.println("input price in array");
                int v = sc.nextInt();
                prize[i]=v;
            }


            int rod_length = sum;
            System.out.println("rod length is sum of rod_length arr"+sum);

            UnboundedKnpsack_RodCutting Unknap = new UnboundedKnpsack_RodCutting(arr_len+1,rod_length+1);



            int memo_result = Unknap.top_down(arr,prize,sum,Unknap.res1);
            System.out.println("answer memo="+memo_result);
    }


}
