package hw;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //总钱数
        int m = scanner.nextInt();  // 物品个数
        Good[][] goods = new Good[m+1][3];
        for (int i = 1; i <= m ; i++) {
            int v = scanner.nextInt();  // 价格
            int p = scanner.nextInt();  // 重要度
            int q = scanner.nextInt();  // q=0:主件   q!=0:附件--->所属主件编号
            if (q == 0) {
                goods[i][0] = new Good(v,p);
            } else {
                if (goods[q][1] == null) {
                    goods[q][1] = new Good(v,p);
                }else {
                    goods[q][2] = new Good(v,p);
                }
            }
        }


    }

    static class Good {
        int v;  // 价格
        int p;  // 重要度
        int vp;
        public Good(int v, int p) {
            this.v = v;
            this.p = p;
            this.vp = v*p;
        }
    }
}
