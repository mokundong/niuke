package com.wangyi;
import java.util.Scanner;
/**
 * Created by MKD on 2017/9/9.
 * 独立的小易
 * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。一个人生活增加了许多花费: 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
 输入描述:
 输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分割
 输出描述:
 输出一个整数, 表示小易最多能独立生活多少天。
 输入例子1:
 3 5 100 10
 输出例子1:
 11
 */
public class dulidexiaoyi {
    public static void main(String[] args) {
        dulidexiaoyi main = new dulidexiaoyi();
        // System.out.println("请输入四个整数x,f,d,p
        // 分别代表租金，水果数量，钱，水果价格(1<=x,f,d,p<=2*10^9)");
        // 接受控制台传来的数据
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int f = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            main.calday(x, f, d, p);
        }
    }

    public void calday(int x, int f, int d, int p) {
        int day = 0;
        // 当现金可支付房租天数大于水果数量
        if (x >= 1&&f>=1 &&d>=1 &&p>=1&& x <= 2 * Math.pow(10, 9)&& f <= 2 * Math.pow(10, 9) && d <= 2 * Math.pow(10, 9) && p <= 2 * Math.pow(10, 9)) {
            if (d / x > f) {
                int temp = d - f * x;// 水果吃完后剩余的钱
                int temp2 = temp / (x + p);// 剩下的钱可供交房租买水果的天数
                day = f + temp2;
                System.out.println(day);
            } else {
                day = d / x;
                System.out.println(day);
            }
        }
    }
}
