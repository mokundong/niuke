package com.onlinecode.offer;

/**
 * Created by yousa on 2017/8/8.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class the18 {
    public void Mirror(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = null;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
