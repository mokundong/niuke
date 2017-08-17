package com.huawei;

import java.util.Scanner;

/**
 * Created by MKD on 2017/8/12.
 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）最后一个数后面也要有空格
 详细描述：
 函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String
 */
public class the06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 0;
        while(sc.hasNextLong()){
            number = sc.nextLong();
            isPrimerFactors(number);
        }
    }
    private static void isPrimerFactors(long num){
        long number = num;
        while(number != 1){
            for (int i=2;i<=number;i++){
                if(number % i == 0){
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
