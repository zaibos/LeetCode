package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = new int[]{100,80,60,70,60,75,85};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                list.add(1);
                stack.add(arr[i]);
            }else {
                if (arr[i] > stack.peek()) {
                    while (stack.size() > 0 && arr[i] >= stack.peek()) {
                        count++;
                        stack.pop();
                    }
                    list.add(count);
                    stack.add(arr[i]);
                }
                else{
                    list.add(1);
                    stack.add(arr[i]);
                }
            }
        }
        System.out.println("ans = "+list.toString());
    }
}
