package hw;
// 写出一个程序，接受一个由字母、数字和空格组成的字符串，
// 和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写，
// 字符串长度小于500。


import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = nums(str1,str2.charAt(0));
        System.out.println(count);
    }

    private static int nums(String s, char s1) {
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == s1 || ch[i] == s1-'a'+'A' || ch[i] == s1-'A'+'a') {
                count += 1;
            }
        }
        return count;
    }
}

