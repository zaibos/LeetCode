package Array.BinarySearch;

import java.util.Scanner;

public class RotationCountRotatedSortedArray {

    private static int findRotationCount(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;

        while(start <= end) {

            if (a[start] <= a[end]) {
                return start;
            }

            int mid = (start + end) / 2;

            int next = (mid+1) % a.length;
            int prev = (mid+a.length-1) % a.length;

            if(a[mid] <= a[next] && a[mid] <= a[prev] ){
                return mid;
            }

            // If the middle element is smaller than its previous element, then it is the minimum element
            else if(a[mid] <= a[end]){
                end = mid-1;
            }
            else if(a[mid] >= a[start]){ //right array is sorted. So the pivot (min element) is on the left side
                start = mid+1;
            }
        }

        return -1; // the array has not been rotated
    }

    public static void main(String[] args) {

        int[] a = {12,13,14,15,18,2,4,5,6};

        System.out.printf("Rotation Count = %d%n", RotationCountRotatedSortedArray.findRotationCount(a));
    }
}
