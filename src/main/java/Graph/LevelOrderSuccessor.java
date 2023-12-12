package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {

    Node root;
    ArrayList<Integer> ans = new ArrayList<>();

    private ArrayList<Integer> LevelSuccessor() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> temp = new ArrayList<>();

        while(queue.size() > 0){
            temp.add(queue.peek().data);
            int size = queue.size();

            for(int i = 0; i < size; i++){
                Node curr = queue.poll();

                if( curr.left != null ){
                    queue.add(curr.left);
                }
                if( curr.right != null ){
                    queue.add(curr.right);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        LevelOrderSuccessor tree = new LevelOrderSuccessor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Zik Zak order traversal of"
                + " binary tree is ");
        ArrayList<Integer> res = tree.LevelSuccessor();
        System.out.println(res.toString());
    }


}
