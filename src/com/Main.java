package com;

/**
 * Created by MKD on 2017/8/21.
 * 思路是不断的利用两个点连线，获取能够取得的最大点，并排除凸点情况
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        int _points_size = 0;
        _points_size = Integer.parseInt(in.nextLine().trim());
        double[] _points = new double[_points_size];
        double _points_item;
        for(int _points_i = 0; _points_i < _points_size; _points_i++) {
            _points_item = Double.parseDouble(in.nextLine().trim());
            _points[_points_i] = _points_item;
        }
        res = castle(_points);
        System.out.println(String.valueOf(res));
    }
    static int castle(double[] points) {
        int len = points.length;
        int result = 0;
        if(len<=8) return 0;
        else{
            for (int j=0;j<len/2 ;j++){
                double x1 = points[2*j];
                double y1 = points[2*j+1];
                for(int k=0;k<len/2;k++){
                    if(k==j) continue;
                    double x2 = points[2*k];
                    double y2 = points[2*k+1];
                    double w= getw(x1,y1,x2,y2);
                    double b = getb(x1,y1,x2,y2);
                    int r= getMax(j,k,len,w,b,points);
                    if(r>result) result=r;
                }
            }
        }
        return result;
    }

    public static Double getw(double x1, double y1, double x2, double y2){//计算w
        double w = (x1-x2)/(y1-y2);
        return w;
    }
    public static Double getb(double x1, double y1, double x2, double y2){//计算b
        double w = (x1-x2)/(y1-y2);
        double b = y1 - x1*w;
        return b;
    }
    public static int getMax(int j,int k,int len,double w,double b,double[] points){//寻找最多的城堡
        int n0=0;int n1=0;int n2=0;
        int result=0;
        for(int i=0;i<len/2;i++) {
            if (i == j || i == k) continue;
            double x = points[2 * i];
            double y = points[2 * i + 1];
            double re = y - w * x + b;
            if (re > 0) n1 = n1 + 1;
            else if (re < 0) n2 = n2 + 1;
            else n0 = n0 + 1;
        }
        result = Math.max((n0+n1),(n2+n0));
        if(result == len/2 - 2) return 0;//如果加上连线上除开连接的两个点，数量为total-2，那么一定是凸点
        else return result+1;//排除凸点后，总数再加上本身点，固 + 1
    }
}
