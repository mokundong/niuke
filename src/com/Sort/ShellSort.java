package com.Sort;

/**
 * Created by yousa on 2017/8/17.
 * 不稳定排序
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        outArr(shellsort(new int[] {9,8,7,6,5,4,3,2}));
    }
    private static int[] shellsort(int[] arr){
        if(arr ==null ||arr.length<=1) return null;
        int incrementNum = arr.length / 2;
        while(incrementNum >=1) {
            for (int i = 0; i <= arr.length; i++) {
                //进行插入排序
                for (int j = i; j < arr.length - incrementNum; j = j + incrementNum) {
                    if (arr[j] > arr[j + incrementNum]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + incrementNum];
                        arr[j + incrementNum] = tmp;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
        return arr;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
