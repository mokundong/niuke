package com.Bisi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MKD on 2017/8/26.
 */
public class Main4 {
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
            int sum = 0;
            int max = l[0];
            for(int i=0;i<l.length;i++){
                sum+=l[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            System.out.println(max);
        }

    }
}
