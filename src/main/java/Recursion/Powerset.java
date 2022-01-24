package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
public class Powerset {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(0,nums, new ArrayList(),res);
        return res;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList(curr));

        for(int i = index; i<nums.length; i++){
            curr.add(nums[i]);
            generateSubsets(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        Powerset powerset = new Powerset();
        System.out.println("Adding static int array");
        int[] nums = {1,2,3};
        List<List<Integer>> result = powerset.subsets(nums);
        System.out.println(result.toString());

    }
} */
public class Powerset {
    List<List<String>> result = new ArrayList<>();

    private void generateSubsets(List<Integer> nums, String str) {
        if (nums.size() == 0){
            result.add(new ArrayList(Arrays.asList(str)));
            return;
        }

        String op1 = str;
        String op2 = str;

        op2 = op2 + nums.get(0);
        List<Integer> temp = nums.subList(1,nums.size());

        generateSubsets(temp, op1);
        generateSubsets(temp, op2);

    }

    public static void main(String[] args) {
        Powerset powerset = new Powerset();
        System.out.println("Adding static int array");
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
        String str = "";
        powerset.generateSubsets(nums,str);
        System.out.println(powerset.result.toString());

    }
}