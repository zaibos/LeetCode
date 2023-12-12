package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaxAreaHistogramInMatrix {



    public ArrayList<Integer> NSL(ArrayList<Integer> arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nsl = new ArrayList<>();
        for(int i=0; i< arr.size(); i++){
            if(stack.isEmpty()){
                nsl.add(-1);
                stack.add(arr.get(i));
            }else{
                while (stack.size() > 0 && stack.peek() >= arr.get(i)) {
                    stack.pop();
                }
                if(stack.size()==0){
                    nsl.add(-1);
                    stack.add(arr.get(i));
                }else{
                    nsl.add(stack.peek());
                    stack.add(arr.get(i));
                }
            }
        }
        return nsl;
    }

    public ArrayList<Integer> NSR(ArrayList<Integer> arr){
        Stack<Integer> stack1 = new Stack<>();
        ArrayList<Integer> nsr = new ArrayList<>();
        for(int i=arr.size(); i >= 0; i--){
            if(stack1.isEmpty()){
                nsr.add(-1);
                stack1.add(arr.get(i));
            }else{
                while (stack1.size() > 0 && stack1.peek() >= arr.get(i)) {
                    stack1.pop();
                }
                if (stack1.size()==0){
                    nsr.add(-1);
                    stack1.add(arr.get(i));
                }else{
                    nsr.add(stack1.peek());
                    stack1.add(arr.get(i));
                }
            }
        }
        Collections.reverse(nsr);
        return nsr;
    }


    public static void main(String[] args) {
        final int[][] matrix = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 }
        };
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int j = 0; j< col;j++){
            int i = 0;
            arr.add(matrix[i][j]);
        }
        System.out.println("arr = "+arr.toString());

        for(int j=0; j<col ; j++){
           int i=1;
           arr1.add(matrix[i][j] + arr.get(j));
        }
        System.out.println("arr1 = "+arr1.toString());

        for(int j=0; j<col ; j++){
            int i=2;
            arr2.add(matrix[i][j] + arr1.get(j));
        }
        System.out.println("arr2 = "+arr2.toString());

        for(int j=0; j<col ; j++){
            int i=3;
            if(matrix[i][j]!=0) {
                arr3.add(matrix[i][j] + arr2.get(j));
            }else{
                arr3.add(0);
            }
        }
        System.out.println("arr3 = "+arr3.toString());
        MaxAreaHistogramInMatrix obj = new MaxAreaHistogramInMatrix();
        System.out.println(obj.NSL(arr).toString());
        System.out.println(obj.NSR(arr).toString());
    }
}
