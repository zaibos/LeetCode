package Graph;

public class PathSumDFS {
    Node root;

    private boolean pathSum(Node root, int sum) {
        if(root == null) return false;
        if(root.data == sum && root.left == null && root.right == null) return true;
        return pathSum(root.left, sum - root.data) || pathSum(root.right, sum - root.data) ;
    }

    public static void main(String args[])
    {
        PathSumDFS tree = new PathSumDFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(7);

        System.out.println("Level order traversal of"
                + "binary tree is ");
        int targetSum = 6;
        boolean res = tree.pathSum(tree.root, targetSum);
        System.out.println("sum present = "+ res);
    }


}
