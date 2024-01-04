package Array.TwoPointer;

public class TripletSumCloseToTarget {
    public static void main(String[] args) {
        int[] arr = {-3,-1,1,2};
        int target = 1;
        int closeSum = 0;

        for(int i=0; i < arr.length - 1; i++){
            int left = i+1;
            int right = arr.length -1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    closeSum = Math.max(closeSum,sum);
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println("result = "+closeSum);
    }
}
