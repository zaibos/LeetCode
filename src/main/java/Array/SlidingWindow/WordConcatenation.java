package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

//Starting indices of first occurence of word array into given string
public class WordConcatenation {

    public static void main(String[] args) {
        String str = "catcatfoxfox";
        String[] words= {"cat", "fox"};

        int window = 0;
        int start = 0;
        List<Integer> listOfIndices = new ArrayList<Integer>();


        for(String word: words){
            StringBuilder check = new StringBuilder();
            for(int i=0; i < str.length(); i++){
                check.append(str.charAt(i));
                if((i-start+1) == word.length()){
                    if(check.toString().equals(word)){
                        listOfIndices.add(start);
                        break;
                    }else{
                        check.deleteCharAt(0);
                        start++;
                    }
                }
            }
            System.out.println("result = "+listOfIndices.toString());
        }
    }
}
