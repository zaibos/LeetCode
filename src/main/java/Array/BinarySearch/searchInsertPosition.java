package Array.BinarySearch;
//leetcode-35
//Binary Search
public class searchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {8,5,4,1};
        int N = 7;

        int low = 0;
        int high = arr.length -1;

        while( low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == N){
                System.out.println(mid);
                System.exit(0);
            }else if((arr[low] < arr[high] ) && (N < arr[mid]) || (arr[low] > arr[high]) && (N > arr[mid])){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(low);

    }
}
