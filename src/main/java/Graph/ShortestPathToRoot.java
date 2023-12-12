package Graph;

public class ShortestPathToRoot {
    Node root;

    public int shortestPath(Node root){
        if(root == null) return Integer.MIN_VALUE;
        if(root.left == null && root.right == null ) return 0;
        return  1 + Math.min( shortestPath(root.left) , shortestPath(root.right) );
    }

    public static void main(String args[])
    {
        ShortestPathToRoot tree = new ShortestPathToRoot();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(7);

        System.out.println("Level order traversal of"
                + "binary tree is ");
        int res = tree.shortestPath(tree.root);
        System.out.println("Minimum Distance is = "+ res);
    }

}
