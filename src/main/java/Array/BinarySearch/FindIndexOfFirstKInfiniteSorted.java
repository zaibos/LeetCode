package Array.BinarySearch;
//find first occurence of 1 in binary soretd infinite array
public class FindIndexOfFirstKInfiniteSorted {

    public int firstOccurence(int[] arr, int s, int e){

        int start = s;
        int first = -1;
        int end = e;
        int N = 1;

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

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,1,1,1,1,1,};
        FindIndexOfFirstKInfiniteSorted obj = new FindIndexOfFirstKInfiniteSorted();
        int start = 0;
        int end = start+1;
        int key=1;
        while(key > arr[end]){
            start = end;
            end = end*2;
        }
        System.out.println("result = "+obj.firstOccurence(arr,start,end));
    }
}
