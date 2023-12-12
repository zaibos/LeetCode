package Array.BinarySearch;

import java.util.Scanner;

public class FloorInSortedArray {

    public int floorToSorted(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int floor = 5;
        int res = -1;

        while(left <= right){
            int mid = (left+right)/2;

            if(arr[mid] == floor){
                return arr[mid];
            }
            else if(arr[mid] > floor){
                right = mid - 1;
            }
            else { //catch observer the pattern in floor and ceiling
                res = arr[mid];
                left = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 9, 15, 15, 18, 21};
        FloorInSortedArray floorInSortedArray = new FloorInSortedArray();
        System.out.println("floor of number = "+floorInSortedArray.floorToSorted(arr));

    }

 /*
private static int findFloorBinarySearch(int[] a, int x) {
    int n = a.length;
    int start = 0;
    int end = n-1;

    int floor = -1;

        while(start <= end) {
        int mid = (start+end)/2;

        if(x == a[mid]) {
            // a[mid] is the floor
            return a[mid];
        } else if (x < a[mid]) {
            end = mid-1;
        } else {
            // a[mid] is the largest element found so far that is smaller than x. So it is a candidate for the floor of x
            floor = a[mid];
            start = mid+1;
        }
    }

        return floor;
}

    public static void main(String[] args) {

        int[] a = {1, 3, 9, 15, 15, 18, 21};
        int x = 5;

        FloorInSortedArray floorInSortedArray = new FloorInSortedArray();
        System.out.printf("Floor(%d) = %d%n", x, floorInSortedArray.findFloorBinarySearch(a, x));
    }

  */
}
