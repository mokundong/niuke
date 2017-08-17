package com.huawei;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by MKD on 2017/8/13.
 题目描述: 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 输入描述: 输入一个int型整数
 输出描述: 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 示例1
 输入
 9876673
 输出
 37689
 */
public class the09 {
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
            System.out.println(result);
        }
    }
}
