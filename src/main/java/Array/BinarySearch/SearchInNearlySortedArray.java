package Array.BinarySearch;

public class SearchInNearlySortedArray {

    public int search(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int target = 30;
        int ans=0;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return ans = mid;
            }else if(arr[mid-1] == target){
                return ans = mid-1;
            }else if(arr[mid+1]==target){
                return ans = mid+1;
            }

            if(arr[mid]>arr[left] && target < arr[mid] ){
                right=mid-2;
            }else if(arr[mid] < arr[right] && target > arr[mid]){
                    left=mid+2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,20,40,30,50};
        SearchInNearlySortedArray obj = new SearchInNearlySortedArray();
        System.out.println("Mid element -> "+obj.search(arr));
    }
}
