package com.xiaomi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/18.
 求任一正整数的阶乘（注意：是任意正整数）
 输入
 输入一个正整数
 输出
 输出一个正整数

 样例输入
 3
 10
 样例输出
 6
 3628800
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            long n = sc.nextInt();
            long times = n;
            int i = 1;
            loop:while(true){
                times = times*(n-i);
                i++;
                if(i == n){
                    break loop;
                }
            }
            System.out.println(times);
        }
    }
}
