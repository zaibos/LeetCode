package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
// count of subsets(of numbers)/ways from int array which will give you difference equal to given input target num.
public class CountSubsetDiff {

    public int solve(int[] arr, int diff,int sum_arr){
        int s1 = (diff + sum_arr) /2;

        CountOfEqualSum eq = new CountOfEqualSum(arr.length+1,s1+1);
        int result = eq.solve(arr,s1);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterd array size");
        int arr_len = sc.nextInt();
        int sum=0;
        int[] arr = new int[arr_len];
        for(int i=0;i<arr_len;i++){
            System.out.println("input array elements");
            int v = sc.nextInt();
            arr[i]=v;
            sum = sum+ arr[i];
        }
        System.out.println("your input array is="+ Arrays.toString(arr));
        System.out.print("enter difference=");
        int diff = sc.nextInt();


        CountSubsetDiff countSubsetDiff = new CountSubsetDiff();
        int result = countSubsetDiff.solve(arr,diff,sum);
        System.out.println("answer="+result);
    }
}
