package com.Sort;

/**
 * Created by yousa on 2017/8/17.
 * 不稳定排序
 * 堆排序
 * 基本思想：堆排序是一种树形选择排序，是对直接选择排序的有效改进。
 */
public class HeapSort {
    public static void main(String[] args) {
        outArr(shellsort(new int[] {9,8,7,6,5,4,3,2}));
    }
    private static int[] shellsort(int[] arr){
        return null;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
