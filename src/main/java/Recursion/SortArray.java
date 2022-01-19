package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArray {
    int temp1;

    public void sort(List<Integer> arr){

        if (arr.size() == 1){
            return;
        }

        int size = arr.size();

        int temp1 = arr.get(size - 1);
        arr.remove(size - 1);
        sort(arr);
        insert(arr,temp1);
    }

    private void insert(List<Integer> arr, int temp) {
        int size = arr.size();
        if (size == 0 || arr.get(size - 1) <= temp){
            arr.add(temp);
            return;
        }

        int temp2 = arr.get(size - 1);
        arr.remove(size - 1);
        insert(arr, temp);
        arr.add(temp2);

    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 5 number below =");
        for( int i=0; i< 5; i++){

            int in = scanner.nextInt();
            list.add(in);
        }

        System.out.println("Input string = "+list.toString());
        sortArray.sort(list);
        System.out.println("Output string = "+list.toString());
    }
}
