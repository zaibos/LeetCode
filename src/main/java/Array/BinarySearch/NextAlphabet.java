package Array.BinarySearch;

public class NextAlphabet {
//find celinig -> next character
    public char nextAlpha(char[] arr){
        int left = 0;
        int right = arr.length - 1;
        char floor = 'd';
        char res = 0;
        while(left <= right){
            int mid = right +left/2;
            if(arr[mid] <= floor){
                left = mid + 1;
            }
            else if(arr[mid] > floor){
                right = mid - 1;
                res = arr[mid];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] arr = {'a','b','c','f','g','i'};
        NextAlphabet nextAlphabet = new NextAlphabet();
        System.out.println("result = "+nextAlphabet.nextAlpha(arr));
;    }
}
