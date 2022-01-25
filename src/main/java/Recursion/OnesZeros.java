package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnesZeros {
    List<String> output = new ArrayList<>();

    public void move(int N){
        int ones = 0;
        int zeros = 0;
        int num = N;
        String curr_str = "";
        recursion(ones,zeros,num,curr_str);
    }

    public void recursion(int one, int zero,int num, String curr){


        if ( num == 0){
            output.add(curr);
            return;
        }

        if(num != 0){
            String curr1 = curr;
            curr1 = curr1  + "1";
            recursion(one+1,zero,num-1,curr1);
        }

        if(one > zero){
            String curr2 = curr;
            curr2 = curr2  + "0";
            recursion(one,zero+1,num-1,curr2);
        }

    }

    public static void main(String[] args) {
        OnesZeros onesZeros = new OnesZeros();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number=");
        int N = sc.nextInt();

        onesZeros.move(N);
        System.out.println(onesZeros.output.toString());

    }
}
