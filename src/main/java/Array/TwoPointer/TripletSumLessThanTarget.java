package Array.TwoPointer;

public class TripletSumLessThanTarget {

    public static void main(String[] args) {
        int[] arr = {-2,0,1,3};
        int tar = 2;

        int count = 0;
        for(int i=0; i< arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                if(tar > sum){
                    count = count + (right-left);
                    left++;
                }else if(sum > tar){
                    right--;
                }else{
                    right--;
                }
            }
        }
        System.out.println("answer -> "+count);
    }

}
