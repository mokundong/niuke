package com.Sort;

/**
 * Created by yousa on 2017/8/16.
 *插入排序
 */
public class InsertDemo {
    public static void main(String[] args) {
        outArr(insertsort(new int[] {9,8,6,7,4,5,2,3,1}));
    }
    private static int[] insertsort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int j = i;
            int target = arr[i];
            while(j>0 && target<arr[j-1]){
                arr[j] = arr[j-1];
                j --;
            }
            arr[j] = target;
        }
        return arr;
    }
    private static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
