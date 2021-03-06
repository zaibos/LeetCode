package Recursion;

import java.util.Scanner;
import java.util.Stack;

//top to bottom decreasing
public class SortStack {

    public void sort(Stack<Integer> stack){
        if (stack.size() == 1){
            return;
        }

        int temp1 = stack.peek();
        stack.pop();
        sort(stack);
        insert(stack,temp1);
    }

    public void insert(Stack<Integer> stc, int temp){
        int size = stc.size();
        if (size == 0 || stc.peek() <= temp){
            stc.add(temp);
            return;
        }

        int temp2 = stc.peek();
        stc.pop();
        insert(stc, temp);
        stc.push(temp2);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers below =");
        for( int i=0; i< 5; i++){

            int in = scanner.nextInt();
            stk.push(in);
        }
        SortStack sortStack = new SortStack();
        System.out.println("Input Stack = "+stk.toString());
        sortStack.sort(stk);
        System.out.println("Output Stack = "+stk.toString());

    }
}
