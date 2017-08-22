package com.huawei;
import java.util.Scanner;
/**
 * Created by MKD on 2017/8/22.
 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
 方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 思路：f(1)=0;f(2)=1;f(3)=f(1)+1;f(4)=f(2)+1;...;f(n)=f(n-2)+1
 */
public class the22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(getNum(num));
        }
    }
    public static int getNum(int total){
        if(total <=0 ) return 0;
        if(total == 1) return 0;
        if(total == 2) return 1;
        return getNum(total-2) + 1;
    }
}