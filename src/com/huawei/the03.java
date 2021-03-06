package com.huawei;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * Created by MKD on 2017/8/12.
 题目描述: 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
           对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
            请你协助明明完成“去重”与“排序”的工作。
 输入描述: 输入多行，先输入随机整数的个数，再输入相应个数的整数
 输出描述: 返回多行，处理后的结果
 示例1
 输入
 3
 10
 20
 20
 输出
 10
 20
 */
public class the03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for (int i = 0; i < num; i++) {
                int cur = sc.nextInt();
                set.add(cur);
            }
            for (Integer i : set) {
                System.out.print(i + "\n");
            }
        }
    }
}
