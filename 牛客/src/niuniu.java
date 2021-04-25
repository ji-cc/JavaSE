import java.util.Arrays;
import java.util.Scanner;
/*
链接：https://ac.nowcoder.com/acm/contest/12949/A
来源：牛客网

题目描述
在新的一年，牛牛想跳得更高。牛牛本身可以跳高{h}h米。同时牛牛有{n}n颗跳高弹，使用第{i}i颗跳高弹可以使牛牛跳高高度增加a_ia
i
​
 米，且跳高弹的效果是可以叠加的，也就是说如果牛牛使用多颗跳高弹，那么他的跳高高度将会增加这些跳高弹单个效果的和。

每颗跳高弹只能使用一次。

请问牛牛最少需要使用多少个跳高弹，才能让牛牛的高度至少是{u}u米高呢？
输入

3 2 5
1 3 2
输出

1
 */
public class niuniu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int u = sc.nextInt();
        int[] b = new int [n];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
//        bubbleSort(b);

        Arrays.sort(b);
        if (h >= u){
            System.out.println(0);

        }
        if (h < u){
            Calculation(n,h,u,b);
        }


    }

    private static int Calculation(int n ,int h, int u, int[] b ) {
        int c = u - h;
        int count = 0;
        for (int i = b.length - 1; i >= 0; i--) {
//            if (c >= b[i]) {
//                count++;
//
//            }
//            c = c - b[i];

            if (c > b[i]) {
                count++;
                c = c - b[i];
            }else{
                count++;
                break;
            }


        }
        System.out.println(count);
        return 0;
    }

}

