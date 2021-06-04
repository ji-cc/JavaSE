package java_yu;
/*
这道题的核心在于 递归的思想
也就是经典的装错信封问题
 用A、B、C……表示写着ｎ位友人名字的信封，a、b、c……表示ｎ份相应的写好的信纸。把错装的总数为记作D(n)。假设把ａ错装进Ｂ里了，包含着这个错误的一切错装法分两类：
(1)b装入Ａ里，这时每种错装的其余部分都与A、B、a、b无关，应有D(n－2)种错装法。
(2)ｂ装入A、B之外的一个信封，这时的装信工作实际是把（除a之外的）n－1份信纸ｂ、ｃ……装入（除B以外的）n－1个信封A、C……，显然这时装错的方法有D(n－1)种。
总之在ａ装入B的错误之下，共有错装法D(n－2)＋D(n－1)种。
a装入C，装入D……的n－2种错误之下，同样都有D(n－1)＋D(n－2)种错装法，因此D(n)＝(n－1)[D(n－1)＋D(n－2)]
 */

import java.util.Scanner;

public class MakeError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            long count = Count(n);
            System.out.println(count);
        }
    }

    private static long Count(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        return (n-1)*(Count(n-1)+Count(n-2));
    }
}
