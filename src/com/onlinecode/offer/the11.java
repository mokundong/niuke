package com.onlinecode.offer;

/**
 * Created by MKD on 2017/8/7.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 1的二进制是 前面都是0，最后一位为1，也就是只有一个1，每次向左移位一下，
 * 使得flag的二进制表示中始终只有一个位为1，每次与n做位与操作，这样就相当于逐个检测n的每一位是否是1了。
 */
public class the11 {
    public static int NumberOf1(int n){
        int count = 0;
        while(n != 0){
            ++count;
            n = (n-1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
    }
}
