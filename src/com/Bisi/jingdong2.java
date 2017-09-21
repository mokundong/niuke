package com.Bisi;

import java.util.Scanner;
import java.math.*;
/**
 * Created by MKD on 2017/9/8.
 */
public class jingdong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double num = sc.nextDouble();
            int count = 0;
            for(int a=1;a<=num;a++){
                for(int b=1;b<=num;b++){
                    for(int c=1;c<=num;c++){
                        for(int d=1;d<=num;d++){
                            double A = a;
                            double B = b;
                            double C = c;
                            double D = d;
                            if(Math.pow(A,B) == Math.pow(C,D)){
                                count = count + 1;
                                }
                            }
                        }
                    }
                }
            System.out.println(count%1000000007);
        }
    }
}
