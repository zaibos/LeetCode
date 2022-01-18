package HardQuestions;

import java.util.Scanner;

public class IntegerToAlpha {
    /*
    String[] FirstDigit = new String[]{"","","Hundered","Thousand","Million","Billion"};
    String[] OnesDigit = new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] TensDigit = new String[]{"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


    int quotient = 0;
    int reminder = 0;
    String str = new String();

    public String alpha(Integer number){


        if (number < 19){
            System.out.println(OnesDigit[number]);
            str = OnesDigit[number];
            return str;
        }

        //check how many digit number, accordingly loop will run
        int Numlen = String.valueOf(number).length();
        for(int i = Numlen; i>1; i--){
            if(i==2 && number < 20){
                str = str + OnesDigit[number];
            }
            if(i==2 && number > 19){
                quotient = number/10;
                reminder = number % 10;
                str = str +" "+ TensDigit[quotient] +" "+ OnesDigit[reminder];
            }

            if (i > 2 && i < 5){
                int temp = number / (int)Math.pow(10,(i-1));
                int minus = temp * (int)Math.pow(10,(i-1));
                str = str +" "+ OnesDigit[temp] +" "+ FirstDigit[i-1];

                number = number - minus;

                if ( number == 0){
                    return str;}
            }
        }
        return str;
    }
     */


    public String solve(int num){
        if(num==0){
            return "Zero";
        }
        if(num>=1000000000){
            return solve(num/1000000000)+" Billion "+solve(num%1000000000);
        }else if(num>=1000000){
            return solve(num/1000000)+" Million "+solve(num%1000000);
        }else if(num>=1000){
            return solve(num/1000)+" Thousand "+solve(num%1000);
        }else if(num>=100){
            return solve(num/100)+" Hundred "+solve(num%100);
        }
        else if(num>=20){
            return two_digit(num/10)+single_digit(num%10);
        }else if(num>=10){
            return other_num(num);
        }else{
            return single_digit(num);
        }
    }

    public String other_num(int n){
        switch(n){
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default:
                return "";
        }
    }

    // 1000000
    public String two_digit(int n){
        switch(n){
            case 2:
                return "Twenty ";
            case 3:
                return "Thirty ";
            case 4:
                return "Forty ";
            case 5:
                return "Fifty ";
            case 6:
                return "Sixty ";
            case 7:
                return "Seventy ";
            case 8:
                return "Eighty ";
            case 9:
                return "Ninety ";
            default:
                return "";
        }
    }

    public String single_digit(int n){
        switch(n){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "";
        }
    }

    public static void main(String[] args) {


        System.out.println("Enter input digit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        IntegerToAlpha integerToAlpha = new IntegerToAlpha();

        /*
        IntegerToAlpha integerToAlpha = new IntegerToAlpha();
        IntegerToAlpha integerToAlpha1 = new IntegerToAlpha();
        IntegerToAlpha integerToAlpha2 = new IntegerToAlpha();


        int decimal = String.valueOf(number).length();

        String res = "";


        if (decimal < 5) {
            res = res + integerToAlpha.alpha(number);
            System.out.println("Final Answer->" + res);
        }

        if ( decimal > 4 && number < 1000000){

            int number1 = number / 1000;
            res = res + integerToAlpha1.alpha(number1) +" "+"Thousands";
            System.out.println("Final Answer1->"+res);
        }

        if ( decimal > 6  && number >= 1000000 ){
            int number2 = number / 1000000;

            int reminder = number % 1000000;
            int reminder2 = reminder / 1000;
            res = res + integerToAlpha1.alpha(reminder2) +" "+"Thousands";

            res = integerToAlpha2.alpha(number2)+" "+"Million" + res;
            System.out.println(res);
        }

        if ( number >= 100000000){
            int number3 = number / 100000000;

            int reminder3 = number3 % 100000000;

            res = integerToAlpha2.alpha(number3)+"Billion"+" ";


            int number2 = number3 / 1000000;

            int reminder = number3 % 1000000;
            int reminder2 = reminder / 1000;
            String res_th = integerToAlpha1.alpha(reminder2) +" "+"Thousands";

            res = res + integerToAlpha2.alpha(number2)+" "+"Million" + res_th;
            System.out.println(res);
        }
    }
    */

        String rst=integerToAlpha.solve(number);
        System.out.println(rst);
//        if(rst[rst.length()-1]==' ')
//            rst.pop_back();
//        return rst;

    }
}
/*
//best solution
class Solution {
public:
    string numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        string rst=solve(num);
        if(rst[rst.size()-1]==' ')
        rst.pop_back();
        return rst;
    }
    string solve(int num){
        if(num==0){
            return "";
        }
        if(num>=1000000000){
            return solve(num/1000000000)+"Billion "+solve(num%1000000000);
        }else if(num>=1000000){
            return solve(num/1000000)+"Million "+solve(num%1000000);
        }else if(num>=1000){
            return solve(num/1000)+"Thousand "+solve(num%1000);
        }else if(num>=100){
            return solve(num/100)+"Hundred "+solve(num%100);
        }
        else if(num>=20){
            return two_digit(num/10)+single_digit(num%10);
        }else if(num>=10){
            return other_num(num);
        }else{
            return single_digit(num);
        }
    }

    string other_num(int n){
        switch(n){
            case 10:
                return "Ten ";
            case 11:
                return "Eleven ";
            case 12:
                return "Twelve ";
            case 13:
                return "Thirteen ";
            case 14:
                return "Fourteen ";
            case 15:
                return "Fifteen ";
            case 16:
                return "Sixteen ";
            case 17:
                return "Seventeen ";
            case 18:
                return "Eighteen ";
            case 19:
                return "Nineteen ";
            default:
                return "";
        }
    }

    // 1000000
    string two_digit(int n){
        switch(n){
            case 2:
                return "Twenty ";
            case 3:
                return "Thirty ";
            case 4:
                return "Forty ";
            case 5:
                return "Fifty ";
            case 6:
                return "Sixty ";
            case 7:
                return "Seventy ";
            case 8:
                return "Eighty ";
            case 9:
                return "Ninety ";
            default:
                return "";
        }
    }

    string single_digit(int n){
        switch(n){
            case 1:
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "Six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
            default:
                return "";
        }
    }
};
 */