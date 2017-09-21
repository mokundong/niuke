package com.Bisi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/8/22.
 *

 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int k = sc.nextInt();
            for (int i = 1; i < 10000000; i++) {
                int left = (i * (i - 1)) / 2 + 1;
                int right = (i * (i + 1)) / 2;
                if (k >= left && k <= right) {
                    int result = k - left + 1;
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
