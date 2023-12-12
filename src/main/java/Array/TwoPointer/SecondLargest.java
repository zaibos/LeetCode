package Array.TwoPointer;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,7,7,5};

        int largest = arr[0]; int second = -1; //initiate with 1st element as largest
        // second as MIN-INTEGER OR negative value if there's no negative element in array

        for(int i = 1 ; i < arr.length-1 ; i++ ){
            if(arr[i] > largest){
                second = largest; //when we get largest value, automatically last largest value will be second largest.
                largest = arr[i];
            }else if(arr[i] == largest){
                continue;
            }else{
                second = arr[i];
            }
        }
        System.out.println("second largest = "+second);
    }
}
