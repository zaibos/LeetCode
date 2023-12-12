package Array.TwoPointer;

public class MinimumSortWindow {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,8,7,6,5,9};
        int i ;
        int left=0; int right=arr.length-1;
        for(left = 0 ; left < right ; left ++){
            if(arr[left] > arr[left+1]){
                break;
            }
        }
        if(left==right){
            return; // sorted array
        }
        for(right = arr.length-1; right > 0; right-- ){
            if(arr[right-1] > arr[right]){  break;}
        }
        int max = arr[left]; int min = arr[left];
        for(i = left+1; i <= right; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < max){ min = arr[i]; }
        }

        for(i=0; i < left; i++){
            if(arr[i] > min){
                left=i;
                break;
            }
        }
        for(i = arr.length-1; i >= right+1; i--){
            if(arr[i] < max){
                right=i;
                break;
            }
        }
        System.out.println("indexs are = "+left+" , "+right);

    }
}
