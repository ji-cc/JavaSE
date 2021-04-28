package java_yu;
/*

在命令行输入如下命令：xcopy /s c:\ d:\，
各个参数如下：
参数1：命令字xcopy
参数2：字符串/s
参数3：字符串c:\
参数4: 字符串d:\
请编写一个参数解析程序，实现将命令行各个参数解析出来。
 */

import java.util.Scanner;
public class ParameterAnalysis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char str1 = '\"';
        char str2 = ' ';
        int count = 0;
        int sum = 0;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i<str.length()) {
            if (str1 == str.charAt(i)) {  // 双引号成对出现
                count++;
                i++;
                continue;
            }
            if (count%2 == 0) { // 对应于右引号后面，遇到空格就换行
                if (str2 == str.charAt(i)) {
                    sb.append("\n");
                    sum++;
                    i++;
                    continue;
                }

            }
            sb.append(str.charAt(i));
            i++;
        }
        System.out.println(sum+1);  // 少加了第一个参数
        System.out.println(sb.toString());
    }

}
