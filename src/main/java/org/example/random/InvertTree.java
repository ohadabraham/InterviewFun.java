package org.example.random;

public class InvertTree {
    public Node invertTree(Node root) {
        if ( root == null ){
            return null;
        }
        Node temp = root.left;
        root.left=root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
