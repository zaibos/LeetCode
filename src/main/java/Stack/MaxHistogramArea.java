package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaxHistogramArea {

    public ArrayList<Integer> NSL(int[] arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nsl = new ArrayList<>();
        for(int i=0; i < arr.length; i++){
            if(stack.isEmpty()){
                nsl.add(-1);
                stack.add(i);
            }else{
                while (stack.size() > 0 && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if(stack.size()==0){
                    nsl.add(-1);
                    stack.add(i);
                }else{
                    nsl.add(stack.peek());
                    stack.add(i);
                }
            }
        }
        return nsl;
    }

    public ArrayList<Integer> NSR(int[] arr){
        Stack<Integer> stack1 = new Stack<>();
        ArrayList<Integer> nsr = new ArrayList<>();
        int size = arr.length;
        for(int i=arr.length-1; i >= 0; i--){
            if(stack1.isEmpty()){
                nsr.add(size);
                stack1.add(arr[i]);
            }else{
                while (stack1.size() > 0 && stack1.peek() >= arr[i]) {
                    stack1.pop();
                }
                if (stack1.size()==0){
                    nsr.add(size);
                    stack1.add(arr[i]);
                }else{
                    nsr.add(stack1.peek());
                    stack1.add(arr[i]);
                }
            }
        }
        System.out.println("right = "+nsr.toString());
        Collections.reverse(nsr);

        return nsr;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};

        MaxHistogramArea obj = new MaxHistogramArea();
        ArrayList<Integer> right = obj.NSR(arr);
        System.out.println("result -> "+right.toString());
        int[] res = new int[right.size()];
        for(int z=0;z<arr.length;z++){
            res[z] = Arrays.binarySearch(arr,right.get(z));
        }
        System.out.println("index = "+Arrays.toString(res));

        //ArrayList<Integer> left = obj.NSL(arr);
        //System.out.println("result1 -> "+left.toString());
        //for(int z=0; z<right.size(); z++){
          //  int width = (right.get(z) - left.get(z) - 1);
        //}
    }
}
