package Array.BinarySearch;

public class CountOccuranceOfK {

    public static int first() {
        int[] arr =  {5,4,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        int k =4;
        int first = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == k){
                first = k;
                end = mid-1;
            }
            //check on left of array , when you don't know your array is increasing or decreasing order.
            else if(arr[mid] > k && arr[start] < arr[end] || arr[mid] < k && arr[start] > arr[end]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return first;
    }

    public static int last() {
        int[] arr =  {5,4,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        int k =4;
        int last = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == k){
                last = k;
                end = mid+1;
            }
            //check on right of array , when you don't know your array is incresing or decreasing order.
            else if(arr[mid] < k && arr[start] < arr[end] || arr[mid] > k && arr[start] > arr[end]){
                end = mid + 1;
            }
            else {
                start = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        //int[] arr = {5,4,4,3,2,1};
        int N = 4;
        CountOccuranceOfK ob = new CountOccuranceOfK();
        int first = ob.first();
        System.out.println("first=> "+first );
        int last = ob.last();
        System.out.println("last=> "+last);
        int length = last - first +1;
        System.out.println(length);
    }
}
