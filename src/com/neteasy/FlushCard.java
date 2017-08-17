package com.neteasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MKD on 2017/7/18.
 * 洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。 现在需要洗2n张牌，从上到下依次是第1张，第2张，
 * 第3张一直到第2n张。首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到
 * 第2n张（下半堆）。接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，
 * 接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。接着把牌合并起来就可以了。
 * 例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。
 * 在洗牌过程中按顺序放下了6,3,5,2,4,1。把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，
 * 就变成了序列1,4,2,5,3,6。 现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。
 */
public class FlushCard {
    public static List<Integer> Flush(List<Integer> cards, int n){
        List<Integer> LeftCards = cards.subList(0,n);
        List<Integer> RightCards = cards.subList(n+1,2*n);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            result.add(RightCards.get(n-i-1));
            result.add(LeftCards.get(n-i-1));
        }
        for (int i = 0; i < n; i++)
        {
            int temp = result.get(i);
            result.set(i,result.get(2 * n - i - 1));
            result.set(2*n-i-1,temp);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 0;i<count;i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> result = new ArrayList<>();
            for(int j=0;j<2*n;j++){
                result.add(scanner.nextInt());
            }
            for(int i1=0;i1<k;i1++){
                result=Flush(result,n);
            }
            for (int m = 0; m < result.size(); m++)
            {
                System.out.print(result.get(m));
                if (m != result.size() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}