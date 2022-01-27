package Tree;
// Any leaf to leaf node longest distance
class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left=right=null;
    }
}
public class DiameterOfTree {
    Node root;
    int res=0;

    public int max(int a, int b){
        if(a>b){
            return a;
        }else
            return b;
    }

    private int daimeter(Node root){

        if(root == null){
            return 0;
        }

        int left = daimeter(root.left);
        int right = daimeter(root.right);

        int temp = max(left,right) + 1;
        int ans = max(temp,1+left+right);
        res = max(res,ans);

        return temp;
    }

    public static void main(String[] args) {
        DiameterOfTree bin = new DiameterOfTree();
        bin.root = new Node(1);

        bin.root.left = new Node(2);
        bin.root.left.left = new Node(3);
        bin.root.left.left.left = new Node(4);
        bin.root.left.left.left.left = new Node(5);
        bin.root.right = new Node(6);
        bin.root.right.left = new Node(7);
        bin.root.right.left.left = new Node(8);
        bin.root.right.left.left.left = new Node(9);
        bin.root.right.left.left.left.left = new Node(10);
        bin.root.right.left.left.left.left.left = new Node(11);
        bin.root.right.left.left.left.left.left.left = new Node(12);
        bin.root.right.left.left.left.left.left.left.left = new Node(13);



        int result = bin.daimeter(bin.root);

        System.out.println("daimeter of binary tree ="+result);


    }

}
