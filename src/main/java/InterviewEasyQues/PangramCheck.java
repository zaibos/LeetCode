package InterviewEasyQues;

//A pangram is a sentence where every letter of the English alphabet appears at least once.

import java.util.HashMap;
import java.util.Map;

public class PangramCheck {

    public Boolean pangram(String str){

        Map<Character,Integer> alphabet = new HashMap<Character,Integer>();
        alphabet.put('A',0);
        alphabet.put('B',0);
        alphabet.put('C',0);
        alphabet.put('D',0);
        alphabet.put('E',0);
        alphabet.put('F',0);
        alphabet.put('G',0);
        alphabet.put('H',0);
        alphabet.put('I',0);
        alphabet.put('J',0);
        alphabet.put('K',0);
        alphabet.put('L',0);
        alphabet.put('M',0);
        alphabet.put('N',0);
        alphabet.put('O',0);
        alphabet.put('P',0);
        alphabet.put('Q',0);
        alphabet.put('R',0);
        alphabet.put('S',0);
        alphabet.put('T',0);
        alphabet.put('U',0);
        alphabet.put('V',0);
        alphabet.put('W',0);
        alphabet.put('X',0);
        alphabet.put('Y',0);
        alphabet.put('Z',0);

        int len = str.length();
        for(int i=0; i<len; i++){
            char c = str.charAt(i);
            char z = Character.toUpperCase(c);
            int value = alphabet.get(z);
            value++;
            alphabet.put(z,value);
        }
        for (Map.Entry<Character,Integer> entry : alphabet.entrySet()){
            //System.out.println("map **"+entry.toString());
            if(entry.getValue() == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "TheQuickBrownFoxJumpsOverTheLazyDog";
        PangramCheck obj = new PangramCheck();
        System.out.println(obj.pangram(str));
    }

}
