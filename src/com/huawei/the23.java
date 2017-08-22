package com.huawei;
import java.util.*;
/**
 * Created by MKD on 2017/8/22.
 题目描述: 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 输入描述: 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 输出描述: 删除字符串中出现次数最少的字符后的字符串。
 示例1
 输入
 abcdd
 输出
 dd
 */
public class the23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.length()>20){
                continue;
            }
            int []max = new int[26];
            char []ch = str.toCharArray();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<ch.length;i++){
                max[ch[i]-'a']++;
                min = min>max[ch[i]-'a'] ? max[ch[i]-'a']:min;
            }
            for(int j=0;j<max.length;j++){
                if(max[j] == min){
                    str = str.replace(String.valueOf((char)(j+97)),"");
                }
            }
            System.out.println(str);
        }
    }
}
