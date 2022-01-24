package Recursion;

import java.util.*;

//all posibble purmutations with "*" or " " between characters
// "123" => 1*23, 12*3, 123, 1*2*3
public class PermutationWithSpace {
    List<String> output = new ArrayList<>();

    private void subset(List<String> input,String opList) {

        if(input.size() == 0){
            output.add(opList);
            return;
        }

        String op1 = opList;
        String op2 = opList;

        op1 = op1 + input.get(0);
        op2 = op2 + "*" + input.get(0);

        List<String> temp = input.subList(1,input.size());

        subset(temp,op1);

        subset(temp,op2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input string");

        String InputString = sc.next();
        List<String> inpput = new ArrayList<String>(Arrays.asList(InputString.split(""))); //[1,2,3] //[[1_2_3],[12_3],[]...]
        String opt = inpput.get(0);
        inpput.remove(0);
        //List<String> output = new ArrayList<>();

        PermutationWithSpace PermutationWithSpace = new PermutationWithSpace();
        //List<List<String>> temp = PermutationWithSpace.output;
        System.out.println("Printing input from main= "+inpput.toString());
        System.out.println("opt string= "+opt);

        PermutationWithSpace.subset(inpput,opt);
        System.out.println(PermutationWithSpace.output.toString());
        //System.out.println("Printing output from main= "+sets.toString());

    }


}
