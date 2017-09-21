package com.Sort;

/**
 * Created by yousa on 2017/8/17.
 * 不稳定排序
 * 简单的选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SelectSort {
    public static void main(String[] args) {
        outArr(sort(new int[] {9,8,7,6,5,4,3,2}));
    }
    private static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int n = i;//最小数的索引
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    n = j;
                }
            }
            arr[n] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
