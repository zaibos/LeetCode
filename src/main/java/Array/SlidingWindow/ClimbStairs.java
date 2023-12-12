package Array.SlidingWindow;
//Backward sliding window
public class ClimbStairs {
    public static int climbStairs(int n) {
        if(n==0||n==1) return  1;
        int stepOne=1,stepTwo=1;
        int result=0;
        for(int i=2;i<=n;i++){
            result=stepOne+stepTwo;
            stepTwo=stepOne;
            stepOne=result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = ClimbStairs.climbStairs(n);
        System.out.println("results-> "+res);
    }
}
