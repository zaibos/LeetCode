package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
    List<Integer> person_arr = new ArrayList<>();

    public void joseph(List<Integer> person_arr, int kill,int start){
        if (person_arr.size() == 1){
            System.out.println(person_arr.get(0));
            return;
        }


        start = (kill+start) % person_arr.size();
        person_arr.remove(start);
        joseph(person_arr,kill,start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of person=");
        int person = sc.nextInt();
        Josephus joseph = new Josephus();


        for(int i=0; i<person; i++){
            joseph.person_arr.add(i+1);
        }
        System.out.print("index to kill=");
        int kill = sc.nextInt();
        int start =0;


        joseph.joseph(joseph.person_arr,kill-1,start);
        //System.out.println(res);

    }
}
