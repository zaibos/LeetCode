package Array;

import java.util.Arrays;

public class LCPrefix {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String[] input = {"flower","flow","flights"};
        Arrays.sort(input);

        //System.out.println(Arrays.toString(input));
        String a = input[0];
        String b = input[input.length-1];
        //int size = b.length;
        for(int i=0;i<a.length();i++){
            if(b.charAt(i) == a.charAt(i)){
                str.append(a.charAt(i));

            }else{
                System.out.println(str.toString());
                System.exit(0);
            }
        }
        System.out.println(str.toString());
        System.exit(0);
    }
}
