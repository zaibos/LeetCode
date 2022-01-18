package InterviewEasyQues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToRoman {
    Map<Character,Integer> map = new HashMap<>();

    public int Roman(String str){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        int test = 0;

        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            if ( map.get(c) < test){
                result = result - map.get(c);
            }else{
                result = result + map.get(c);
                test = map.get(c);
            }
        }
        System.out.println("result="+result);
        return result;
    }

    public static void main(String[] args) {
        NumberToRoman obj = new NumberToRoman();

        //System.out.println("Enter Input String");
        Scanner sc= new Scanner(System.in);
        String n=sc.next();
        if ( n.length() <= 1 && n.length() >= 15 ){
            //System.out.println("length issue");
            System.exit(1);
        }

        //String [] ch = n.split("");

//        for(int i=0; i< ch.length; i++)
//        {
//            System.out.println(ch[i]);
//
//            if ( ch[i] == "L"){
//                System.out.println("wrong input element");
//                System.exit(1);
//            }
//
//        }

        obj.Roman(n);
    }
}
