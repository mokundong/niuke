package com.xiaomi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/18.
 题目描述：
 兔子从A地到B地，当中每1公里有一个休息站。兔子体力每次最多可连续行走2公里，也就是说兔子可以选择行走1公里或者2公里进行休息，然后继续前进。假设A地到B地距离N公里，求兔子的行走休息方案有多少种(每一种组合算一种)。
 备注：可不考虑整型溢出的问题，测试样例结果保证不超出2^31。
 输入
 输入一个整型，表示A地到B地的距离
 输出
 输出一个整型，表示行走方案数目

 样例输入
 0
 1
 2
 5
 样例输出
 1
 1
 2
 8
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            long n = sc.nextLong();
            System.out.println(result(n));
        }
    }
    public static long result(long n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n>2){
            return result(n-1) + result(n-2);
        }
        return 0;
    }
}
