package java_yu;

import java.util.Scanner;

public class MaxPublicStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            // 将长子串放入str1中，短子串放入str2中
            if (str2.length() > str1.length()) {
                StringBuffer s3 = new StringBuffer();
                s3.append(str1).append(str2);      //将字符串1和2合并
                str2 = s3.toString().substring(0,str1.length());  //str2从合并的字符串中截取str1
                str1 = s3.toString().substring(str1.length());	//str1从合并的字符串中截取从str1长度起后面的字符串，即为str2
            }
            System.out.println(getMaxPubStr(str1,str2));
        }
    }

    private static String getMaxPubStr(String str1, String str2) {
        String strMax = null;  // 保存最长子串
        int max = 0;  // 保存子串长度
        // 在str2中定义滑动窗口  length = [1,str2.length]
        for (int i = 1; i <= str2.length() ; i++) {  // 窗口变化宽度  1--->str2.length()
            for (int j = 0; j < str2.length()-i+1; j++) {    // 窗口下标 [j , j+i-1]
                String str_i = str2.substring(j,j+i);    // substring函数：截取字符串前闭后开区间 [j,j+i) --> [j , j+i-1]
                if (str1.contains(str_i)) {
                    if (str_i.length() > max) {
                        strMax = str_i;
                        max = str_i.length();
                        break;
                    }
                }
            }
        }
        return strMax;
    }
}
