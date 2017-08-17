package com.onlinecode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MKD on 2017/8/7.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class the13 {
    public static int[] reOrderArray(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i] % 2==0 && array[i+1] % 2==1){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(reOrderArray(a));
    }
}
