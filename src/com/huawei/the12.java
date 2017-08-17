package com.huawei;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/17.
 题目描述: 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 输入描述: 输入N个字符
 输出描述: 输出该字符串反转后的字符串
 示例1
 输入
 abcd
 输出
 dcba
 */
public class the12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
