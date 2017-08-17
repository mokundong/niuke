package com.onlinecode.offer;
import java.util.Stack;
import java.util.ArrayList;
/**
 * Created by MKD on 2017/8/7.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class the3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

}
