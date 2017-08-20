package com.huawei;

import java.util.Scanner;

/**
 * Created by MKD on 2017/8/20.
 密码要求:
 1.长度超过8位
 2.包括大小写字母.数字.其它符号,以上四种至少三种
 3.不能有相同长度超2的子串重复
 说明:长度超过2的子串
 输入描述: 一组或多组长度超过2的子符串。每组占一行
 输出描述: 如果符合要求输出：OK，否则输出NG
 示例1
 输入
 021Abc9000
 021Abc9Abc1
 021ABC9000
 021$bc9000
 输出
 OK
 NG
 NG
 OK
 */
public class the20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int []count = {0,0,0,0};
            if(str.length()<9 ||str==null){
                System.out.println("NG");
            }else {
                for(int i=0;i<str.length();i++){
                    char ch = str.charAt(i);
                    if(ch>='0'&&ch<='9'){
                        count[0]=1;
                    }else if(ch>='a'&&ch<='z'){
                        count[1]=1;
                    }else if(ch>='A'&&ch<='Z'){
                        count[2]=1;
                    }else{
                        count[3]=1;
                    }
                }
                if (count[0] + count[1] + count[2] + count[3]<3) {
                    System.out.println("NG");
                }else{
                    System.out.println(isHasSubString(str));
                }
            }
        }
    }
    public static String isHasSubString(String str){
        for(int i=0;i<str.length()-3;i++){
            String str1 = str.substring(i,i+3);
            String str2 = str.substring(i+3,str.length());
            if(str2.contains(str1)){
                return "NG";
            }
        }
        return "OK";
    }
}
