package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerToLeft {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,4};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
                stack.add(arr[i]);
            } else {
                while (stack.size() > 0 && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if(stack.size()==0){
                    list.add(-1);
                    stack.add(arr[i]);
                }else{
                    list.add(stack.peek());
                    stack.add(arr[i]);
                }
            }
        }
        System.out.println("Answer = "+list.toString());
    }
}
