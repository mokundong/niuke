package com.baidu;

import java.util.Scanner;

/**
 * Created by MKD on 2017/9/11.
 *
 * 前K大数
 题目描述： 小M即将过生日了，有n个人将要送她礼物。她对每个生日礼物都有一个喜好值，值越大表示越喜欢。
 她想从中选出K个她最喜欢的礼物。但是由于所有的礼物并不是同时送到的，所以她想知道，每收到一个礼物后，
 她最喜欢的K个礼物的喜好值之和是多少。
 输入: 第一行包含两个整数n,K。10≤n≤105 ，2≤K≤n。
 第二行包含n个整数ai，表示小M对第i个收到的物品的喜好值。1≤ai≤10000
 输出: 输出n-K+1个整数，表示小M新收到一个礼物后最喜欢的个礼物的喜好值之和。
 样例输入
 14 4
 1 2 3 4 5 6 7 8 9 10 1 1 1 1
 样例输出
 10 14 18 22 26 30 34 34 34 34 34
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] gift = new int[n];
        int [] score = new int[n-k+1];
        for(int i=0;i<n;i++){
            gift[i] = sc.nextInt();
        }
        score[0] = gift[0]+gift[1]+gift[2]+gift[3];
        int max = score[0];
        for(int j=1;j<=n-k;j++){
            int tmp = gift[j]+gift[j+1]+gift[j+2]+gift[j+3];
            if(tmp>max){
                score[j] = tmp;
                max = score[j];
            }
            else if(tmp<=max){
                score[j] = max;
            }
        }
        for(int z=0;z<n;z++){
            System.out.print(gift[z] + "\t");
        }
        System.out.println("\n");

        for(int m=0;m<n-k+1;m++){
            System.out.print(score[m] + "\t");
        }
    }
}
