package InterviewEasyQues;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//First two elements in array whose sum is equal to target
public class ExactSumIntArray {

    Map<Integer,Integer> map = new HashMap<>();
    int[] arr = new int[2];

    public int[] exactSumInArr(int[] nums,int target){


        map.put(nums[0],0);

        for (int j=1; j<nums.length; j++){
            int val = target - nums[j];
            if(map.containsKey(val) ){
                arr[0] = map.get(val);
                arr[1] = j;
                return arr;
            }else{
                map.put(arr[j],j);
            }

        }

        return arr;
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
            System.out.println("add element");
            input[i]=sc.nextInt();
            if (input[i] < Math.pow(-10,9) || input[i] > Math.pow(10,9)){
                //System.out.println("wrong input element");
                System.exit(1);
            }
        }

        System.out.println("Target value->");
        int target = sc.nextInt();
        if (target <= Math.pow(-10,9) || target >= Math.pow(10,9) ){
            //System.out.println("wrong input for target value");
            System.exit(1);
        }

        int[] res = obj.exactSumInArr(input,target);
        System.out.println("result int="+ Arrays.toString(res));
    }
}
