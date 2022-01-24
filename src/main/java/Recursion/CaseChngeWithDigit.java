package Recursion;

import java.util.*;

public class CaseChngeWithDigit {
    List<List<String>> result = new ArrayList<>();
    Map<String,Integer>  map = new HashMap<>();

    private void generate(List<String> nums, String str) {
        if (nums.size() == 0){
            //map.put(str,1);
            result.add(new ArrayList(Arrays.asList(str)));
            return;
        }

        String digitFlag = nums.get(0);
        if(digitFlag.matches("^[a-zA-Z]*$")){

            String op1 = str;
            String op2 = str;

            op1 = op1 + nums.get(0).toLowerCase();
            op2 = op2 + nums.get(0).toUpperCase();
            List<String> temp = nums.subList(1,nums.size());

            generate(temp, op1);
            generate(temp, op2);
        }
        else{
            String op1 = str;
            op1 = op1 + nums.get(0);
            List<String> temp = nums.subList(1,nums.size());
            generate(temp, op1);
        }

    }

    public static void main(String[] args) {
        CaseChngeWithDigit caseChngeWithDigit = new CaseChngeWithDigit();
        System.out.println("Adding static int array");
        List<String> nums = new ArrayList<>(Arrays.asList("a","1","B","2"));
        String str = "";
        System.out.println(nums.toString());
        caseChngeWithDigit.generate(nums,str);
        System.out.println(caseChngeWithDigit.result.toString());
        System.out.println(caseChngeWithDigit.map);
    }
}
