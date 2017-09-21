package com.didi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            if(n<=0)
                System.out.println(0);
            int max = 0;
            int [] uglyes = new int[n];
            uglyes[0] = 1;
            for(int i=1;i<n;i++){
                uglyes[i] = getNext(uglyes,uglyes[max]);
                max ++;
            }
            System.out.println(uglyes[max]);
        }
    }
    public static int getNext(int [] uglyes,int max){
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        for(int u : uglyes){
            if(u*2>max){
                m2 = u*2;
                break;
            }
        }
        for(int u : uglyes){
            if(u*3>max){
                m3 = u*3;
                break;
            }
        }
        for(int u : uglyes){
            if(u*5>max){
                m5 = u*5;
                break;
            }
        }
        int tmp = m2<m3 ? m2:m3;
        return tmp < m5 ? tmp : m5;
    }
}
