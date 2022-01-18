package InterviewEasyQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntToRoman {

    public String IntRoman(Integer number){
        int[] intCode = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder str = new StringBuilder();

        for (int i=0; i < intCode.length; i ++){
            while(number >= intCode[i]){
                str.append(code[i]);
                number = number - intCode[i];
            }
        }
        //System.out.println(str.toString());
        return str.toString();
    }

    public static void main(String[] args) {
        IntToRoman obj = new IntToRoman();

        //System.out.println("Enter Input Integer");
        Scanner sc= new Scanner(System.in);
        Integer n=sc.nextInt();
        if ( n <= 1 && n >= 3999 ){
            System.exit(1);
        }


        obj.IntRoman(n);
    }
}
