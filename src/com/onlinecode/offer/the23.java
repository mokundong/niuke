package com.onlinecode.offer;

/**
 * Created by MKD on 2017/8/12.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 【思路】后续遍历法，左子树->右子树->根节点 总是会有去掉根节点，左边小于右边，例如
 * 5 8 |6 -> 11 16 |14 ->|| 10，可用递归求解，分别判断左右子树
 */
public class the23 {
    public static boolean VerifySquenceOfBST(int[] sequence){
        if(sequence.length == 0) return false;
        return IsTreeBST(sequence,0,sequence.length-1);
    }
    public static boolean IsTreeBST(int[] sequence,int start,int end){
        if(end <= start) return true;
        int i = start;
        for (;i<end;i++){
            if(sequence[i]>sequence[end]) break;
        }
        for(int j = i;j<end;j++){
            if(sequence[j]<sequence[end]) return false;
        }
        return IsTreeBST(sequence,start,i-1) && IsTreeBST(sequence,i,end-1);
    }
    public static void main(String[] args){
        int a[]={5,8,6,11,16,14,10};
        boolean b = VerifySquenceOfBST(a);
        System.out.println(b);
    }
}
