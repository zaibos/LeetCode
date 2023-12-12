package Array.SlidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//sliding window problem
public class FirstNegativeInArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {10, -1, -5, 7, -15, 20, 18, 24};
        int start = 0;
        int idx = 0;
        int window = 3;
        int sizeOfArray = arr.length;
        Queue<Integer> negativeList = new LinkedList<>();
        int[] firstNegative = new int[sizeOfArray - window + 1];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negativeList.add(arr[i]);
            }
            if(i - start + 1 == window){
                if(negativeList.isEmpty()){
                    firstNegative[idx] = 0;
                    idx++;
                }
                else{
                    int num =negativeList.peek();
                    firstNegative[idx] = num;
                    idx++;
                    if(num == arr[start]){
                        negativeList.remove();
                    }
                }
                start++;
            }
        }
        System.out.println(Arrays.toString(firstNegative));
    }
}
