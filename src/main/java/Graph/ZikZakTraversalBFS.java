package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZikZakTraversalBFS {
    Node root;
    ArrayList<Integer> ans = new ArrayList<>();

    private ArrayList<Integer> ZikZak() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean leftToRight = true;
        while(queue.size() > 0){
            //Node curr = queue.poll();
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++){
                Node curr = queue.poll();
                if( curr.left != null ){
                    queue.add(curr.left);
                }
                if( curr.right != null ){
                    queue.add(curr.right);
                }
                temp.add(curr.data);
            }
            if(leftToRight){

            }
            else{
                Collections.reverse(temp);
            }
            for (int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }
            leftToRight = !(leftToRight);

        }
        return ans;
    }

    public static void main(String[] args) {
        ZikZakTraversalBFS tree = new ZikZakTraversalBFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Zik Zak order traversal of"
                + " binary tree is ");
        ArrayList<Integer> res = tree.ZikZak();
        System.out.println(res.toString());
    }

}
