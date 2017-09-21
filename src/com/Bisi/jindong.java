package com.Bisi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/8.
 */
public class jindong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            long num = sc.nextInt();
            for(int i=1;i<=num;i++) {
                int low = ((i) * (i - 1)) / 2 + 1;
                int high = ((1 + i) * (i)) / 2;
                if (low <= num && num <= high)
                    System.out.println(i);
                continue;
            }
        }
    }
}
