package Array.TwoPointer;

import java.util.ArrayList;

import java.util.List;

public class SumOfFour {

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1,2,3,3,4,4};
        int tar = 10;

        for(int i = 0; i < arr.length-3; i++){
            if( i!=0 && arr[i] == arr[i-1] ){continue;}
            for(int j=i+1; j < arr.length-2; j++){
                if( j!=i+1 && arr[j] == arr[j-1] ){continue;}
                int left = j+1;
                int right = arr.length - 1;
                while(left < right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum < tar){
                        left++;
                    }else if(sum>tar){
                        right--;
                    }else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);temp.add(j);temp.add(left);temp.add(right);
                        ans.add(temp);
                        left++; right--;

                        while(left < right && arr[left] == arr[left-1]){
                            left++;
                        }
                        while(left < right && arr[right] == arr[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        System.out.println("answer = "+ans.toString());
    }
}
