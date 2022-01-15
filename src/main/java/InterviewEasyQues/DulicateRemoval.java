package InterviewEasyQues;
import java.util.Scanner;

//Remove Duplicates in same sorted array and return the length of unique elements.

public class DulicateRemoval {
    public int removeDuplicates(int[] nums){
        int i=0;

        for(int j=1; j<nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

        }
        //System.out.println("No. of unique elements ="+(i+1));
        return i+1;
    }

    public static void main(String[] args) {
        DulicateRemoval obj = new DulicateRemoval();

        System.out.println("Enter Input Array Size");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if ( n <0 || n> 3*(10*10*10*10)){
            //System.out.println("wrong input size array");
            System.exit(1);
        }

        //System.out.println("Intput array size->"+n);

        int[] input= new int[n];
        for(int i=0; i<n; i++)
        {
            input[i]=sc.nextInt();
            if (input[i] < -100 || input[i] > 100){
                //System.out.println("wrong input element");
                System.exit(1);
            }
        }

        for (int i=0; i<(input.length)-1; i++ ){
            if (input[i] > input[i+1]){
                System.exit(1);
                //System.out.println("array is not in non-decreasing order"+input[i]+">"+input[i+1]);
            }

        }
        obj.removeDuplicates(input);
    }
}
