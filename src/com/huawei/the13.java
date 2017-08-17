package com.huawei;

import java.util.Scanner;

/**
 * Created by MKD on 2017/8/17.
 题目描述: 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符.
输入描述:将一个英文语句以单词为单位逆序排放。
输出描述:得到逆序的句子
示例1
输入
I am a boy
输出
boy a am I
 */
public class the13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println(result);
    }
    public static String reverse(String sentence){
        String[] s = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1;i>0;i--){
            sb.append(s[i]);
            sb.append(" ");
        }
        sb.append(s[0]);
        return sb.toString();
    }
}
