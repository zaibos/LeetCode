package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class AverageLevelBFS {

    Node root;
    ArrayList<Integer> ans = new ArrayList<>();

    private ArrayList<Integer> averageLevel() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> temp = new ArrayList<>();
        int level = 0;

        while(queue.size() > 0){

            int size = queue.size();
            level++;
            int sum = 0;

            for(int i = 0; i < size; i++){
                Node curr = queue.poll();
                sum = sum + curr.data;

                if( curr.left != null ){
                    queue.add(curr.left);
                }
                if( curr.right != null ){
                    queue.add(curr.right);
                }
            }


            ans.add(sum/level);


        }
        return ans;
    }

    public static void main(String[] args) {
        AverageLevelBFS tree = new AverageLevelBFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Zik Zak order traversal of"
                + " binary tree is ");
        ArrayList<Integer> res = tree.averageLevel();
        System.out.println(res.toString());
    }


}
