package Array.SlidingWindow;

import java.util.*;

public class MaxOfSubarrayK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int start = 0;
        int window = 3;

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < window; i++) {
            while(queue.size() > 0 && queue.peek() < arr[i] ){
                queue.remove();
            }
            queue.add(arr[i]);
        }
        result.add(queue.peek());

        for(int i = window; i < arr.length ; i++){
            if(queue.peek() == arr[start]){
                queue.remove();
            }
            start++;
            while(queue.size() > 0 && queue.peek() < arr[i] ){
                queue.remove();
            }
            queue.add(arr[i]);
            result.add(queue.peek());

        }

        System.out.println(result.toString());

    }

}
