package InterviewEasyQues;

import java.util.Arrays;
//merge sorted array
public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int next;

        for(int i=0;i<n+m-2;i++){
            for(int j=0;j<n;j++){
                if(nums1[i] == nums2[j]){ //i=1 j=0 2=2
                    next = nums1[i+1]; // i=2 next=3
                    nums1[i+1] = nums1[i]; // i=2 -> 3
                    nums1[i+2]=next;
                    i=i+1;
                    System.out.println("printing  array ->"+ Arrays.toString(nums1));
                    break;
                }else if(nums1[i] > nums2[j]){
                    next = nums1[i+1];
                    nums1[i+1] = nums1[i];
                    nums1[i] = nums2[j];
                    nums1[i+2]=next;
                    i=i+1;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println("printing sorted array ->"+ Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Leetcode88 obj = new Leetcode88();
        obj.merge(nums1,m,nums2,n);
    }
}
