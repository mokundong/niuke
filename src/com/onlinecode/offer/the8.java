package com.onlinecode.offer;

/**
 * Created by MKD on 2017/8/7.
 * 一只青蛙一次可以跳上1 级台阶，也可以跳上2 级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class the8 {
    public  static int JumpFloor(int target) {
        if(target == 0 ){
            return 0;
        }else if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else {
            return JumpFloor(target-1) + JumpFloor(target-2);
        }
    }

    public static void main(String[] args) {
        int t = 5;
        System.out.println(JumpFloor(t));
    }
}
