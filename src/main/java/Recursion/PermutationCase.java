package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//prmutations with alphabets case
//abc => [abc, abC, aBc, aBC, Abc, AbC, ABc, ABC]
public class PermutationCase {
    List<String> output = new ArrayList<>();
    public void perm(List<String> input, String opt){
        if(input.size() == 0){
            output.add(opt);
            return;
        }

        String op1 = opt;
        String op2 = opt;

        op1 = op1 + input.get(0);
        op2 = op2 + input.get(0).toUpperCase();

        List<String> temp = input.subList(1,input.size());

        perm(temp,op1);
        perm(temp,op2);

    }

    public static void main(String[] args) {
        PermutationCase obj = new PermutationCase();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input string");

        String InputString = sc.next();
        String str = "";
        List<String> input = new ArrayList<String>(Arrays.asList(InputString.split("")));

        obj.perm(input,str);
        System.out.println(obj.output.toString());
    }
}
