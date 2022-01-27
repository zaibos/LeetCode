package Tree;

public class MaxSum {
    Node root;
    int res=0;

    public int max(int a, int b){
        if(a>b){
            return a;
        }else
            return b;
    }

    private int maxSum(Node root){

        if(root == null){
            return 0;
        }

        int left = maxSum(root.left);
        int right = maxSum(root.right);

        int temp = max(max(left,right) + root.data, root.data);
        int ans = max(temp, root.data+left+right);
        res = max(res,ans);

        return temp;
    }

    public static void main(String[] args) {
        MaxSum bin = new MaxSum();
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


        int result = bin.maxSum(bin.root);

        System.out.println("daimeter of binary tree =" + result);
    }
}
