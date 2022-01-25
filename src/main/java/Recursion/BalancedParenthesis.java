package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Using extended i/o method to create recursion tree
// For example, given n = 3, a solution set is:
// "((()))", "(()())", "(())()", "()(())", "()()()"
// Make sure the returned list of strings are sorted.

public class BalancedParenthesis {
    List<String> output = new ArrayList<>();

    public void move(int N){
        int open = N;
        int close = N;
        String curr_str = "";
        extendedMethod(open,close,curr_str);
    }

    public void extendedMethod(int open, int close, String curr){


        if ( open == 0 && close == 0){
            output.add(curr);
            return;
        }

        if(open != 0){
            String curr1 = curr;
            curr1 = curr1  + "(";
            extendedMethod(open-1,close,curr1);

        }

        if(close > open){
            String curr2 = curr;
            curr2 = curr2  + ")";
            extendedMethod(open,close-1,curr2);
        }

    }


    public static void main(String[] args) {
        BalancedParenthesis balancedParenthesis = new BalancedParenthesis();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number=");
        int N = sc.nextInt();

        balancedParenthesis.move(N);
        System.out.println("result=>"+balancedParenthesis.output.toString());

    }
}
