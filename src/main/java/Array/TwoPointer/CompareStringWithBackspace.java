package Array.TwoPointer;

public class CompareStringWithBackspace {
    public String compareStr(String str){
        int hashCount = 0;
        StringBuilder actual = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '#'){
                hashCount++;
                continue;
            }
            if(hashCount > 0){
                hashCount--;
            }
            else{
                actual.insert(0,str.charAt(i));
            }
        }
       return actual.toString();
    }
    public static void main(String[] args) {
        String str1 = "ab#c";
        String str2 = "az#c";
        CompareStringWithBackspace obj = new CompareStringWithBackspace();
        String actual1 = obj.compareStr(str1);
        String actual2 = obj.compareStr(str2);

        if(actual1.equals(actual2)){
            System.out.println("Both string are same = "+Boolean.TRUE);
        } else {
            System.out.println("Both string are not same = "+Boolean.FALSE);
        }

    }
}
