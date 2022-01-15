package InterviewEasyQues;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExactSumIntArray {

    Map<Integer,Integer> map = new HashMap<>();

    public int[] exactSumInArr(int[] nums,int target){


        for (int j=0; j<nums.length; j++){
            map.put(nums[j],j);

        }

        for (int j=0; j<nums.length; j++){
            if(map.containsKey(target - nums[j]) && j != map.get(target - nums[j])){
                return new int[] {j,map.get(target - nums[j])};
            }

        }

        return new int[2];
    }

    public static void main(String[] args) {
        ExactSumIntArray obj = new ExactSumIntArray();

        //System.out.println("Enter Input Array Size");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if ( n <2 || n> Math.pow(10,4)){
            //System.out.println("wrong input size array");
            System.exit(1);
        }

        System.out.println("Input array size->"+n);

        int[] input= new int[n];
        for(int i=0; i<n; i++)
        {
            input[i]=sc.nextInt();
            if (input[i] < Math.pow(-10,9) || input[i] > Math.pow(10,9)){
                //System.out.println("wrong input element");
                System.exit(1);
            }
        }

        //System.out.println("Target value->");
        int target = sc.nextInt();
        if (target <= Math.pow(-10,9) || target >= Math.pow(10,9) ){
            //System.out.println("wrong input for target value");
            System.exit(1);
        }

        obj.exactSumInArr(input,target);
        //System.out.println("result int="+ Arrays.toString(res));
    }
}
