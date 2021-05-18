package java_yu;

import java.util.Scanner;

public class TreeRouut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();  // 24
            Sum(str);
        }
   }
    private static void Sum(String str) {
        int sum = 0;
        while (str.length()>1) {
            sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum = sum+str.charAt(i)-'0';  // 字符转换成整型   // Integer.valueOf('2') 转换成了该字符的ASCII值
            }
            str = String.valueOf(sum);

        }
        System.out.println(str);
    }
}
