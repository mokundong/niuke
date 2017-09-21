package com.Bisi;
import java.util.List;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/31.
 */
public class MeiTuanDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int num = sc.nextInt();
            int [] arr = new int[num];
            for (int i=0;i<num;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int [] sum =new int[0] ;
            for(int i=0;i<arr.length;i++){
                sum[0] += arr[i];
            }
            int len = arr.length;
            if(sum[0] % k == 0){
                System.out.println(len);
            }
            else
            System.out.println(Sum2(arr,sum,k,len));
        }
    }

    public static int Sum2(int [] arr,int[] sum,int k,int len){
        int sl = sum.length;
        int sn [] = new int [len];
        for(int m=0;m<sl;m--){
            for(int i=0;i<len;i++) {
                sum[m] = sum[m] - arr[i];
                if (sum[m] % k == 0) return len - i;
                else sn[i] = sum[m];
            }
        }
        for(int j=0;j<arr.length;j++){
            Sum2(arr,sn,k,len-1);
        }
        return 0;
    }
}
