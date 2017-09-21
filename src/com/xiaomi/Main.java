package com.xiaomi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/18.
 题目描述：
 给定文本text和待匹配字符串pattern，二者皆只包含小写字母，并且不为空。
 在text中找出匹配pattern的最短字符串，匹配指按序包含pattern，但不要求pattern连续。
 如text为abaacxbcbbbbacc，pattern为cbc，text中满足条件的是abaacxbcbbbbacc红色部分。
 输入
 每行一个text和一个pattern，用空格分隔
 输出
 输出最短匹配序列起止位置，用空格分隔。若无满足条件的答案，则起止均为-1

 样例输入
 abaacxbcbbbbacc cbc
 abc x
 aaabcac ac
 样例输出
 4 7
 -1 -1
 5 6
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String text = sc.next();
            int n = text.length();
            String pattern = sc.next();
            int m = pattern.length();
            int [] list = new int[n];
            int j=0;
            for(int i=0;i<n;i++){
                if(j<m && pattern.charAt(j)==text.charAt(i)){
                    list[j] = i;
                    j=j+1;
                }
            }
            int num = 0;
            for(int k=1;k<n;k++){
                if(list[k] !=0){
                    num += 1;
                }
            }

             {
                for(int l=0;l<n;l++){
                    System.out.println(list[l]);
                }
            }

        }
    }
}
