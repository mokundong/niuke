package com.Bisi;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/26.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        ArrayList arr = new ArrayList();
        for(String s:str){
            int num = Integer.parseInt(s);
            arr.add(num);
        }
        int [] l = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            l[i]=((Integer)arr.get(i)).intValue();
        }
        int k = sc.nextInt();
        System.out.println(findK(l,k));
    }
    public static int findK(int[] arr, int k){
        int len = arr.length;
        int result = 0;
        for(int i=0;i<len;i++){
            int tmp = 0;
            for(int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        result = arr[len-k];
        return result;
    }
}
