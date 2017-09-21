package com.didi;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/10.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int count = 0;
            long n = sc.nextLong();
            long [] list = new long[(int) n];

            for(long i = 0;i<n;i++){
                list[(int)i] = sc.nextLong();
            }

            if(list[0]==0) count = count + 1;
            if (list[(int) (n-1)] ==0) count = count + 1;
            for(int j = 1;j<n-1;j++){
                if(list[j] == 0){
                    count = count + 1;
                }
                if(list[j-1] == list[j] && list[j] != 0){
                    count = count + 1;
                }
                if(list[j-1] == list[j] && list[j] == list[j+1] && list[j] != 0){
                    count = count + 0;

                }
                if(list[j-1] != list[j] && list[j] == list[j+1] && list[j] != 0){
                    count = count + 1;

                }
            }
            System.out.println(count);
        }
    }
}

