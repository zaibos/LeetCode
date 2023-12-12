package Array.TwoPointer;

public class WaterBucket {

    public static void main(String[] args) {
        int[] bucket = new int[]{3,0,0,2,0,4};
        int maximum = 0;
        int left=0; int right = bucket.length-1;
        while(left <= right){

            maximum = Math.max( Math.min(bucket[left],bucket[right]) * (bucket[right] - bucket[left]), maximum );

            if(bucket[left] < bucket[right]){
                left++;
            }else{
                right--;
            }

        }
        System.out.println("maximum bucket of size "+ maximum);
    }
}
