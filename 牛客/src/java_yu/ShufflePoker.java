package java_yu;

import java.util.Arrays;
import java.util.Scanner;

public class ShufflePoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {  // 几副牌
            int n = scanner.nextInt()*2;  // 数组长度
            int k = scanner.nextInt();   // 洗牌次数
            int [] card = new int[n];
            for (int j = 0; j < n; j++) {
                card[j] = scanner.nextInt();
            }
            for (int j = 0; j < k; j++) {
                card = WashCard(card,n);
            }
            // 将数组转换成字符串输出
            String str = Arrays.toString(card);
//            System.out.println(str);   // [1, 4, 2, 5, 3, 6]
            String str2 = str.replace("[","")   // 去掉中括号与逗号，转换后的字符串数字中间带有空格
                            .replace("]","")
                            .replace(",","");
            System.out.println(str2);
        }
    }

    private static int[] WashCard(int[] card,int n) {
        int[] washCard = new int[n];
        int left = 0;
        int right = n/2;
        int j = 0;
        while (left != n/2 && right != n ) {
            washCard[j] = card[left];
            washCard[j +1] = card[right];
            left++;
            right++;
            j += 2;
        }
        return washCard;
    }
}
