package Array.TwoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//leetcode 1
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Target -> "+N);
        int[] arr = {2,3,5,7};
        HashMap<Integer, Integer> map = new HashMap<>();

        //Filling
        for(int i=0; i<arr.length;i++){
            map.put(arr[i],i);
        }
        //Checking
        for(int i=0; i<arr.length;i++){
            if(arr[i] < N){
                int ele = N - arr[i];
                if(map.containsKey(ele)){
                    int index = map.get(ele);
                    if(index==i){
                        continue;
                    }
                    //return new int[]{i,index};
                    System.out.println(i+" , "+index);
                    return;
                }
            }

        }



    }
}
