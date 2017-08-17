package com.Sort;

/**
 * Created by yousa on 2017/8/16.
 * 稳定排序
 * 冒泡法，大数下沉
 */
public class BubbleDemo {
    public static void main(String[] args) {
        outArr(bubbleSort(new int[]{9,8,6,7,4,5,2,3,1}));
    }
    private static int[] bubbleSort(int[] arr){
        int len = arr.length;
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
        return arr;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
