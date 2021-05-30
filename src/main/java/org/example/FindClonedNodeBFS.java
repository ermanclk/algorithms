package org.example;


import org.example.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Completed, success
 * Breadt first solution node returning cloned node in tree
 */
class FindClonedNodeBFS {

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {


        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<TreeNode> clonedNodes = new LinkedList<>();

        nodes.offer(original);
        clonedNodes.offer(cloned);
        TreeNode found = null;
        TreeNode temp = original;
        TreeNode cloneTemp = cloned;
        while (nodes.size() > 0) {
            if (temp.left != null) {
                nodes.offer(temp.left);
                clonedNodes.offer(cloneTemp.left);
            }
            if (temp.right != null) {
                nodes.offer(temp.right);
                clonedNodes.offer(cloneTemp.right);
            }
            TreeNode removed = nodes.remove();
            TreeNode cloneRemoved = clonedNodes.remove();

            if (cloneRemoved != null && target == removed ) {
                found = cloneRemoved;
            }
            temp=removed;
            cloneTemp=cloneRemoved;
        }
        return found;
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