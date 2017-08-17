package com.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by MKD on 2017/8/13.
 题目描述: 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 输入描述: 输入N个字符，字符在ACSII码范围内。
 输出描述: 输出范围在(0~127)字符的个数。
 示例1
 输入
 abc
 输出
 3
 */
public class the10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] nums = str.toCharArray();
            Set<Character> set = new LinkedHashSet<Character>();
            for(int i=nums.length-1;i>=0;i--){
                set.add(nums[i]);
            }
            String result = "";
            for(Character c : set){
                result += c + "";
            }
            System.out.println(result.length());
        }
    }
}
