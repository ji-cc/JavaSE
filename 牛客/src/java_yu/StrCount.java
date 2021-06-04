package java_yu;
/*
递归的思想， 长度每增加1 翻26倍 再加上一些增量
ans_arr[n] = 26*ans_arr[n-1] + stuff;
ans_arr[k+1] = s2[k] - s1[k]; k为两个字符串不相等的第一个下标；ans_arr的下标即为长度
难点就在于求这个多余的stuff
以题目给的ab ce为例：
长度为1的就只有 b和c 2个
长度为2那就 ba-bz 和 ca-cz 共26*
难点就在于求这个多余的stuff
以题目给的ab ce为例：
长度为1的就只有 b和c 2个
长度为2那就 ba-bz 和 ca-cz 共26*2=52个
但实际上ce-cz是不合法的 要减去('z'-'e'+1)=22个，同时还差了ac-az这('z'-'b')=24个
所以长度为2的结果是2*26+24-22=54个
一共54+2=56个
 */
import java.util.Scanner;

public class StrCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            int len1 = scanner.nextInt();
            int len2 = scanner.nextInt();
            long count = 0;
            int lenS1 = s1.length();
            int lenS2 = s2.length();
            if (lenS1 > lenS2) {
                String tmp = s1;
                s1 = s2;
                s2 = tmp;
            }
            for (int i = len1; i <= len2; i++) {
                count += Count(s1,s2,i);

            }
            System.out.println(count);
        }

    }
    static long Count(String s1, String s2, int i) {
        if(i == 1) {
            return s2.charAt(i-1) - s1.charAt(i-1);
        }
        return Count(s1,s2,i-1)*26 - ('z' - s2.charAt(i-1)+1) + ('z'- s1.charAt(i-1));
    }
}
