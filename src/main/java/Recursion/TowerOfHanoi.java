package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {
    public static Stack<Integer>[] tower = new Stack[4];
    int count=0;

    public void move(int source, int hel, int des, int N) {

        if(N > 0) {

            move(source, des, hel, N-1);

            int item = tower[source].pop();
            tower[des].push(item);
            count++;

            System.out.println("From="+tower[source].toString()+"Using="+tower[des].toString()+"To="+tower[hel].toString());

            move(hel,source,des, N-1);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("size of stack");
        //int stackSize = scanner.nextInt();

        tower[1] = new Stack<>();
        tower[2] = new Stack<>();
        tower[3] = new Stack<>();

        System.out.println("Enter number of disk below =");
        int disks = scanner.nextInt();
        for( int i = disks; i > 0 ; i--){

            tower[1].push(i);
        }
        TowerOfHanoi sortStack = new TowerOfHanoi();
        System.out.println("Input Stack = "+tower[1].toString());
        sortStack.move(1,2,3,disks);
        System.out.println("Output Stack = "+tower[3].toString());
        System.out.println("count"+ sortStack.count);
    }


}
