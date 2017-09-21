package com.Bisi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MKD on 2017/8/26.
 */
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            ArrayList arr = new ArrayList();
            for (String s : str) {
                int num = Integer.parseInt(s);
                arr.add(num);
            }
            int[] l = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                l[i] = ((Integer) arr.get(i)).intValue();
            }
            int top =0;int max=0;int begin=1;int last=1;int rebegin=1;
            if(l.length == 1){
                System.out.println(l[0]);
            }else
            for(int j=0;j<l.length;j++){
                top+=l[j];
                if(top>max){
                    begin = rebegin;
                    max=top;
                    last=j+1;
                }
                if(top<0){
                    rebegin = j+2;
                    top=0;
                }
            }
            System.out.println(max);
        }

    }
}
