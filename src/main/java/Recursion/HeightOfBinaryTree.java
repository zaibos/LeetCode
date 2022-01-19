package Recursion;
class Node{
   int data;
   Node left, right;
   Node(int item){
       data = item;
       left=right=null;
   }
}
public class HeightOfBinaryTree {

    Node root;

    public int depth(Node root){

        if(root == null){
            return -1;
        }
        else{
           int left = depth(root.left);
           int right = depth(root.right);

           if(left > right){
               return (left +1);
           }else{
               return (right +1);
           }
        }
    }

    public static void main(String[] args) {
        HeightOfBinaryTree bin = new HeightOfBinaryTree();
        bin.root = new Node(1);
        bin.root.left = new Node(2);
        bin.root.right = new Node(3);
        bin.root.left.left = new Node(4);

        System.out.println("height of binary tree ="+bin.depth(bin.root));


    }
}
