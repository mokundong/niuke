package com.huawei;

import java.util.Scanner;

/**
 * Created by MKD on 2017/8/12.
 题目描述: 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 输入描述: 输入一个十六进制的数值字符串。
 输出描述: 输出该数值的十进制字符串。
 示例1
 输入
 0xA
 输出
 10
 */
public class the05 {
    public static void main(String[] args) throws Exception{
            Scanner sc=new Scanner(System.in);
            while (sc.hasNext()){
                String str=sc.next();
                System.out.println(Integer.decode(str));
            }
    }
}
