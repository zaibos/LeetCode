package Array.BinarySearch;
//Binary Search
public class MinimumDifference {

    public int mini(int[] arr){
        int n = 6;
        int low = 0;
        int size = arr.length-1;

        if (n < arr[0])
            return arr[0];
        if (n > arr[size - 1])
            return arr[size - 1];

        while(low <= size){
            int mid= (low + size)/2;

            if( arr[mid] == n ){
               return arr[mid];
            }else if(n < arr[mid]){
                size = mid-1;
            }else{
                low = mid+1;
            }
        }

        if((arr[low] - n) < ( n - arr[size])){
            return arr[low];
        }
        return arr[size];
    }
    public static void main(String[] args) {
        int[] arr = {5,8,9,10};
        MinimumDifference minimumDifference = new MinimumDifference();

        int res = minimumDifference.mini(arr);
        System.out.println("result = "+res);

    }
}
