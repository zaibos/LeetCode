package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class RemoveMiddleElm {

    public Stack<Integer> middleElement(Stack<Integer> stack, int index){

        if (index == 1){
            stack.pop();
            return stack;
        }

        //Base condition
        if (stack.size() == 1 ){
            stack.pop();
            return stack;
        }


        int temp = stack.pop();
        index--;
        middleElement(stack,index);
        stack.push(temp);

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers below =");
        for( int i=0; i< 5; i++){

            int in = scanner.nextInt();
            stk.push(in);
        }

        int index = (stk.size() / 2 ) + 1;
        RemoveMiddleElm sortStack = new RemoveMiddleElm();
        System.out.println("Input Stack = "+stk.toString());
        sortStack.middleElement(stk, index);
        System.out.println("Output Stack = "+stk.toString());
    }
}
