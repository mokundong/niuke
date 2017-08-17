package com.Sort;

/**
 * Created by yousa on 2017/8/16.
 *二分插入排序
 */
public class BinaryInsertDemo {
    public static void main(String[] args) {
        outArr(binaryinsertsort(new int[] {9,8,6,7,4,5,2,3,1}));
    }
    private static int[] binaryinsertsort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int left = 0;
            int right = i-1;
            int tmp = arr[i];
            int mid = 0;
            while(left <= right){
                mid = (left + right) / 2;
                if(tmp<arr[mid]){
                    right = mid + 1;
                }else{
                    left = mid + 1;
                }
            }
            for(int j=i-1;j>=left;j++){
                arr[j+1] = arr[j];
            }
            if(left != i){
                arr[left] = tmp;
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
