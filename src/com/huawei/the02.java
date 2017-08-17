package com.huawei;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/12.
 【题目描述】： 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 输入描述: 输入一个有字母和数字以及空格组成的字符串，和一个字符。
 输出描述: 输出输入字符串中含有该字符的个数。
 示例1
 输入：ABCDEF
       A
 输出：1
 */
public class the02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int i = getCount(s,c);
        System.out.println(i);
    }
    public static int getCount(String str,char c){
        int count = 0;
        str = str.toLowerCase();
        if(str != null && str.length() > 0){
            for (int i=0;i<str.length();i++){
                if(c == str.charAt(i)){
                    count ++;
                }
            }
        }else {
            count = 0;
        }
        return count;
    }
}
