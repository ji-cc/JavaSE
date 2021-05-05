package java0605;
/*
采用递归思想：
①物品n个，物品体积逐一放入weight[]中
②递归函数count(int s,int n) : 其中s为剩余物品重量，n为剩余可选的物品下标
则分以下两步递归求解：
a.从后往前装，装上weight[n]后，若剩余物品仍然有解
则count(s-weight[n],n-1);
b.若装了weight[n]后，无解，则删除该包,尝试第n-1个
count(s,n-1);
 */

import java.util.Scanner;

public class MagicPocket {
    // 设全局变量
    static int[] wight;
    static int n;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        wight = new int[n];
        for (int i = 0; i < n; i++) {
            wight[i] = scanner.nextInt();
        }
        count(40,n-1);
        System.out.println(count);
    }

    private static void count(int s, int n) {
        if (s == 0) {  // 刚好装满
            count = count +1;
            return;
        }
        if (s < 0 || (s > 0 && n < 0)) {
            return;
        }
        count(s-wight[n],n-1);
        count(s,n-1);
    }
}
