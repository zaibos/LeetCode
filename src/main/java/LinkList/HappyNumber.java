package LinkList;

public class HappyNumber {

    public static int happy(int num){
        int sum =0;

        while(num != 0){
            sum += (int) Math.pow(num%10, 2);
            num = num / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 18;
        int slow = num; int fast = num;
        while(true){
            slow = happy(slow);
            System.out.println(slow);
            fast = happy(fast);
            System.out.println(fast);
            fast = happy(fast);
            System.out.println(fast);
            System.out.println("***********");
            if(slow == fast){
                System.out.println("Not a Happy Number");
                break;
            }else if(fast == 1){
                System.out.println("Happy number :)");
                break;
            }
        }
    }
}
