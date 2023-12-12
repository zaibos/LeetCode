package Array.SlidingWindow;

public class MinCostToReach {
    public static int MinCostToReach(int n, int[] b) {
        if(n==1) return  b[0];
        if(n==0) return 0;

        int stepOne=0,stepTwo=0;
        int result=0;
        for(int i=0;i<n;i++){
            result= b[i] + Math.min(stepOne,stepTwo);
            stepTwo=stepOne;
            stepOne=result;
        }
        return Math.min(stepOne,stepTwo);
    }

    public static void main(String[] args) {

        int[] b = {2, 5, 3, 1, 7, 3, 4};
        int n = b.length;
        int res = MinCostToReach.MinCostToReach(n,b);
        System.out.println("results-> "+res);
    }
}
