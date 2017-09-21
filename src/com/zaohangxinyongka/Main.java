package com.zaohangxinyongka;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/13.
5 2
A B C
C F *
B D E
D G *
E H I

A B E
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String result = "";
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            char u = s.charAt(n);
            if(u == '*'){
                result = result + s.charAt(0);
            }
        }
        for(int j=0;j<result.length();j++){
            System.out.print(result.charAt(0) + "\t");
        }
    }

}
