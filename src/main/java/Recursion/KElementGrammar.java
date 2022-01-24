package Recursion;

import java.util.Scanner;

public class KElementGrammar {

    public int kthGrammar(int n, int k){

        int mid = (int)Math.pow(2,n-1) / 2;

        if (n==1 && k==1){
            return 0;
        }

        if (k <= mid){
            return kthGrammar(n-1, k);
        }
        else{
            return 1-kthGrammar(n-1,k-mid);
        }

        //return 1;
    }

    public static void main(String[] args) {
        System.out.print("input N=");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N <=1 || N >= 30) {
            System.exit(1);
        }

        System.out.print("Input K=");
        int K = sc.nextInt();

        if(K <= 1 || K >= (int)Math.pow(2,N-1)){
            System.exit(1);
        }

        KElementGrammar kElementGrammar = new KElementGrammar();
        int res = kElementGrammar.kthGrammar(N,K);
        System.out.println("print="+res);

    }
}
