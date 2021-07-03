package hw;
/*
•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
*/


import java.util.Scanner;

public class SplitStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            if (str.length()<8) {
                str += "00000000";
                System.out.println(str.substring(0,8));
            } else if (str.length() == 8){
                System.out.println(str);
            }else {
                while (str.length()%8 != 0) {
                    str += "0";
                }
                int i = 0;
                while (i < str.length()) {
                    System.out.println(str.substring(i,i+8));
                    i += 8;
                }
            }

        }

    }

}
