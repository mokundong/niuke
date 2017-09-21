package com.zaohangxinyongka;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        long total=1;
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer>  a = new ArrayList<Integer>();
        while(reader.hasNextLine()){
            int x = reader.nextInt();
            total*=x;
            a.add(x);
        }
        int length_a=a.size();
        for (int i=0;i<length_a;i++){
            System.out.print(total/a.get(i));
        }
    }
}