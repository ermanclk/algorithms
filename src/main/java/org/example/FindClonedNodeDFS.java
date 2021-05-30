package org.example;


import org.example.model.TreeNode;

/**
 * Completed, success
 */
class FindClonedNodeDFS {

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target) {
            return cloned;
        }
        TreeNode node = null;
        if (original.left != null) {
            node = getTargetCopy(original.left, cloned.left, target);
        }
        if (node == null) {
            node = getTargetCopy(original.right, cloned.right, target);
        }
        return node;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);
        TreeNode node8 = new TreeNode(9);
        TreeNode node9 = new TreeNode(10);
        TreeNode node10 = new TreeNode(11);


        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node2.left = node6;
        node3.right = node7;

        TreeNode clone = node.clone();
        System.out.println(getTargetCopy(node, clone, node5));
        //TreeNode cloned= node.

    }

}