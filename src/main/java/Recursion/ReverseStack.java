package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public void reverse(Stack<Integer> stack){
        if (stack.size() == 1){
            return;
        }

        int temp1 = stack.pop();
        reverse(stack);
        insertLast(stack,temp1);
    }

    public void insertLast(Stack<Integer> stc, int temp){
        int size = stc.size();
        if (size == 0){
            stc.add(temp);
            return;
        }

        int temp2 = stc.pop();
        insertLast(stc, temp);
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
        ReverseStack sortStack = new ReverseStack();
        System.out.println("Input Stack = "+stk.toString());
        sortStack.reverse(stk);
        System.out.println("Output Stack = "+stk.toString());
    }
}
