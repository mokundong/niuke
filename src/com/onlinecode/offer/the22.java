package com.onlinecode.offer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by MKD on 2017/8/11.
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class the22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return list;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treenode = queue.poll();//移除队首元素，并将其作为此次判断有无子节点的节点
            list.add(treenode.val);
            if(treenode.left != null) queue.offer(treenode.left);
            if(treenode.right != null) queue.offer(treenode.right);
        }
        return list;
    }
}
