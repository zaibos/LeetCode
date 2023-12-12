package Array.TwoPointer;

import java.util.Arrays;
//Using Two Pointer only on sorted Array
public class UsingTwoPointerFindTwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        int i=0;
        int j = arr.length-1;
        int target = 6;
        int[] res = new int[2];

        while(i != j){
            if(arr[i]+arr[j] == target){
                res[0] = i;
                res[1] = j;
                System.out.println("print res => "+ Arrays.toString(res));
                return;
            }
            else if(arr[i]+arr[j] > target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("not present");
    }
}
