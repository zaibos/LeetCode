package InterviewEasyQues;
import java.util.HashSet;
import java.util.Set;
public class duplicateCheck {

    public boolean containsDuplicate(int[] nums) {
        // TODO: Write your code here
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int setLen = set.size();
        if(len != setLen) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        duplicateCheck obj = new duplicateCheck();
        System.out.println(obj.containsDuplicate(nums));
    }
}
