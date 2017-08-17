package com.onlinecode.offer;

import java.util.List;

/**
 * Created by MKD on 2017/8/7.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39
 */
public class the7 {
    public static int Fibonacci(int n){
        if(n ==0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int num1 = 0;
        int num2 = 1;
        int curnum = 0;
        for(int i=2;i<=n;i++){
            curnum = num1 + num2;
            num1 = num2;
            num2 = curnum;
        }
        return curnum;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(Fibonacci(n));
    }
}
