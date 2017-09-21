package com.xiecen;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by MKD on 2017/9/21.
 题目描述：
 BP神经网络是一种按误差反向传播训练的多层前馈网络，其算法称为反向传播算法，
 BP神经网络的基本思想是梯度下降法，以期使网络的实际输出值和期望输出值的误差均方差为最小。
 现在有一个输入单元数量为 I，隐藏单元数量为 H，输出单元数量为 O 的BP神经网络，隐藏层数为1。
 规定初始的输入层到隐藏层的权重矩阵为(I+1)*H的矩阵(加入一个偏置节点，而不采用偏置值)，
 初始的隐藏层到输出层的权重矩阵为H*O的矩阵，初始值都为0.0 (请不要随机初始化矩阵值)，
 偏置节点的输入值固定为1.0 。
 规定每个训练集只训练一次，使用梯度下降法(Gradient Descent)，使用sigmoid作为激活函数，
 学习率固定为0.5，batch=1，按照输入的训练集依次训练。
 输出误差(损失函数)为实际输出值和期望输出值的误差平方和的一半。
 写出前向和反向传播算法，计算输出误差。
 输入
 第一行依次是输入的训练个数N，输入单元数量 I，隐藏单元数量 H，输出单元数量 O（中间用空格隔开，皆为大于0的整数）
 下面依次是训练集：
 I个输入值（中间用空格隔开，输入值为整数）
 O个对应的输出值（中间用空格隔开，输出值为整数）
 I个输入值
 O个对应的输出值
 ……
 以此类推重复N次
 输出
 前N次每次的实际输出值和期望输出值的误差平方和的1/2
 （结果四舍五入保留到小数点后3位）

 样例输入
 4 2 2 1
 0 0
 1
 0 1
 1
 1 0
 1
 1 1
 0
 样例输出
 0.125
 0.121
 0.114
 0.145

 */

public class Main {
    /*请完成下面的函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static double sigmoid(double x){
        return 1.0 / (1.0 + Math.pow(Math.E, -x));
    }

    /*sigmoid的导数*/
    static double dsigmoid(double y){
        return y * (1 - y);
    }

    static double[] bpnn(int N, int I, int H, int O, int[][] inputs, int[][] targets) {
        for(int n=0;n<N;n++){
            double learing_rate = 0.5;
            double batch = 1;
            double [][] input_layer = new double[1][I];
            double [][] input_wigth = new double[I][H];
            double [][] hiden_layer = new double[1][H];
            double [][] hiden_wight = new double[H][O];
            double [][] output_layer = new double[1][O];
            for(int i_l=0;i_l<I;i_l++){
                input_layer[0][i_l] = inputs[n][i_l];
            }
            for(int i_=0;i_<I;i_++){
                for(int h_=0;h_<H;h_++){
                    input_wigth[i_][h_] = 0;
                }
            }
            for(int h_=0;h_<H;h_++){
                for(int o_=0;o_<O;o_++){
                    hiden_wight[h_][o_] = 0;
                }
            }
            for(int o_=0;o_<O;o_++){
                output_layer[0][o_] = targets[o_][0];
            }

            //前向算法
            for(int i=0;i<I;i++){
                for(int j=0;j<H;j++){

                }
            }
        }
//        double [] result = {};
//        return result;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] res;

        int _N;
        _N = in.nextInt();

        int _I;
        _I =  in.nextInt();

        int _H;
        _H =  in.nextInt();

        int _O;
        _O =  in.nextInt();

        int[][] _inputs = new int[_N][_I];
        int[][] _targets = new int[_N][_O];
        for(int i=0; i<_N; i++) {
            for(int j=0; j<_I; j++) {
                _inputs[i][j] = in.nextInt();
            }
            for(int j=0; j<_O; j++) {
                _targets[i][j] = in.nextInt();
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = bpnn(_N, _I, _H, _O, _inputs, _targets);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
