package org.example.model;

public class TreeNode extends Object implements Cloneable{
        public int val;
        public TreeNode left;
        public TreeNode right;

    public TreeNode(int x) {
            val = x;
        }
    public TreeNode clone() throws
            CloneNotSupportedException
    {
        return (TreeNode) super.clone();
    }
}