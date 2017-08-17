package com.huawei;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/13.
 题目描述: 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 输入描述: 输入一个正浮点数值
 输出描述: 输出该数值的近似整数值
 示例1
 输入
 5.5
 输出
 6
 */
public class the07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double d = sc.nextDouble();
            getInt(d);
        }
    }
    private static void getInt(double d){
        int tmp = (int)d;
        if (d - tmp >= 0.5){
            System.out.println(tmp + 1);
        }else {
            System.out.println(tmp);
        }
    }
}
