package com.Sort;

/**
 * Created by yousa on 2017/8/17.
 * 不稳定排序
 * 快速排序
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,
 * 一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归
 * 地排序划分的两部分。
 */
public class QuickSort {
    public static void main(String[] args) {
        outArr(quicksort(new int[] {9,8,4,3,2,1,7,6,5},0,8));
    }
    public static int[] quicksort(int[] arr,int start,int end){
        if (end - start<=0){
            return null;
        }
        int last = start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<arr[start]){
                int tmp = arr[start];
                arr[start] = arr[i];
                arr[i] = tmp;
            }
        }
        quicksort(arr,start,last-1);
        quicksort(arr,last+1,end);
        return arr;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
