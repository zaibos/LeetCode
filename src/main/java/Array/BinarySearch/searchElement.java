package Array.BinarySearch;

public class searchElement {
    public int first(int[] arr, int N){
        int start = 0;
        int first = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) /2;
            if(arr[mid] == N){
                return mid;
            }
            // If the middle element is smaller than its previous element, then it is the minimum element
            if(mid > 0 && N == arr[mid-1]) {
                return mid-1;
            }

            // If the middle is greater than its next element, then the next element is the minimum element
            if(mid < end && N == arr[mid+1]) {
                return mid+1;
            }

            if( N < arr[mid]) { // left array is sorted. So the pivot (min element) is on the right side
                end = mid-2;
            } else { //right array is sorted. So the pivot (min element) is on the left side
                start = mid+2;
            }
        }
        //System.out.println("first index=> "+first);
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2};
        int N = 5;
        searchElement ob = new searchElement();
        int first = ob.first(arr,N);
        System.out.println("first=> "+first );
    }
}
