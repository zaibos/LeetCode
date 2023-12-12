package Array.BinarySearch;
//Binary Search
public class FirstLastOccurenceLength {

    public int first(int[] arr, int N){
        int start = 0;
        int first =- 1;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start) /2;
            if(arr[mid] == N){
                end = mid-1;
                first = mid;
            }
            else if( (arr[start] < arr[end] ) && (N < arr[mid]) || (arr[start] > arr[end]) && ( N > arr[mid]) ){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        //System.out.println("first index=> "+first);
        return first;
    }

    public int last(int[] arr, int N) {
        int start = 0;
        int last = -1;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == N) {
                start = mid + 1;
                last = mid;
            } else if ((arr[start] < arr[end] ) && (N < arr[mid]) || (arr[start] > arr[end]) && ( N > arr[mid]) ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //System.out.println("last index => "+last);
        return last;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,4,3,2,1};
        int N = 4;
        FirstLastOccurenceLength ob = new FirstLastOccurenceLength();
        int first = ob.first(arr,N);
        System.out.println("first=> "+first );
        int last = ob.last(arr,N);
        System.out.println("last=> "+last);
        int length = last - first +1;
        System.out.println(length);
    }
}
