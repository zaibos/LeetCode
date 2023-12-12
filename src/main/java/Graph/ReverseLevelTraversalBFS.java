package Graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelTraversalBFS {

    Node root;
    Stack<Node> stack = new Stack<>();

    private void PrintReverseLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);


        while(queue.size() > 0){
            Node tempNode = queue.remove();
            if(tempNode.right != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
            stack.push(tempNode);
        }

    }

    public static void main(String args[])
    {
        ReverseLevelTraversalBFS tree = new ReverseLevelTraversalBFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of"
                + "binary tree is ");
        tree.PrintReverseLevelOrder();
        while(!tree.stack.isEmpty()){
            System.out.print(tree.stack.peek().data + " ");
            tree.stack.pop();
        }
    }


}
