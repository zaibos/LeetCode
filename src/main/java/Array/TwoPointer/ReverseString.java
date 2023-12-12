package Array.TwoPointer;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        int start = 0;
        char[] s = {'h','e','l','l','o'};
        int length = s.length;
        int end = length-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
}
