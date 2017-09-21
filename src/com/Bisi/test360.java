package com.Bisi;

/**
 * Created by MKD on 2017/8/26.
 题目描述：
 小明一共有n根彩色粉笔，m根白色粉笔，现在可以用a根彩色粉笔和b根白色粉笔组成一盒卖x元，或者c根白色粉笔组成一盒卖y元，或者d根彩色粉笔组成一盒卖z元，小明最多可以用这些粉笔卖多少元？不一定要把所有粉笔卖完，小明只希望利益最大化。
 输入
 第一行2个整数n，m，1≤n,m≤2000；
 第二行4个整数a，b，c，d，1≤a,b,c,d≤1000；
 第三行3个整数x，y，z，1≤x,y,z≤1000。
 输出
 输出一个整数，表示最多可以卖到多少元。

 样例输入
 5 5
 1 2 3 3
 2 1 3
 样例输出
 7

 Hint
 补充样例：
 输入样例：
 5 15
 1 2 3 6
 2 1 3
 输出样例：
 11




 题目描述：
 一年一度的跳水比赛又开始了，全国各地的运动员都纷纷报名参加了比赛。在比赛之前，举办方让运动员抽签决定了比赛的出场顺序，运动员会根据这个顺序依次出场，完成自己的动作，然后裁判评分。
 为了做好充分的准备和调整赛前心态，运动员希望了解其他运动员的实力，希望知道在自己出场之前，有多少位运动员上赛季的得分是高于自己的。现在你是一位数据分析家，你可以告诉运动员他们的情况么？
 输入
 第一行一个整数n，1≤n≤200000，
 第二行n个整数，第i个整数表示本次比赛第i个出场的运动员上赛季的得分ai，1≤ai≤200000。
 输出
 一行输出n个整数，第i个整数表示本次比赛在第i个出场的运动员之前出场且得分比其高的运动员个数。不要在行末输出多余的空格。

 样例输入
 5
 4 5 1 3 2
 样例输出
 0 0 2 2 3

 Hint
 第一位出场的运动员上赛季得分4，前面没有比其分高的；显然第二位出场的也没有；第三位出场的运动员上赛季得分1，前面有2位比其高；第4位出场的运动员得分3，前面有2位比其高；第5位出场的运动员得分2，前面有3位得分比其高。


 题目描述：
 你现在手上有两个简单的数列:a和b。
 令SumA为数列a所有数字之和，SumB为数列b的所有数字之和。
 小明想通过一些交换让这两个数字的差的绝对值尽量小，于是小明开始随机地交换一些数字。但他发现这样的计算量又太大了。
 所以小明决定最多交换两对数字使得新数列的|SumA-SumB|最小。
 但小明实在太弱了，于是他求助于你，
 希望你告诉他答案。
 输入
 第一行包括一个正整数n(n<=1000),代表数列a的大小；
 第二行包括n个正整数ai(|ai|<=1e9),表示数列a的n个元素；
 第一行包括一个正整数m(m<=1000),代表数列b的大小；
 第二行包括b个正整数bi(|bi|<=1e9),表示数列b的m个元素。
 输出
 输出差值的绝对值最小值。

 样例输入
 4
 1 3 7 9
 3
 2 10 12
 样例输出
 0
 */
public class test360 {

}