package com.wangyi;
import java.util.*;
/**
 * Created by MKD on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int k = sc.nextInt();
            //String ss = result(k);
            System.out.println(result(k));
        }
    }
    public static String result(int k){
        String s = "";
        while(k !=0){
            if(k % 2 == 1){
                s = s + '1';
                k = (k-1)/2;
            }
            if(k % 2 == 0){
                s = s + '2';
                k = (k-2)/2;
            }
        }
        return s;
    }
}
