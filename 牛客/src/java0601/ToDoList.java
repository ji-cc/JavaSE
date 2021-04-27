package java0601;

import java.util.Scanner;

public class ToDoList {
    /*
    字符串B插入字符串A使产生的字符串是一个回文串。
    寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的
    位置不同就考虑为不一样的办法。
    A = “aba”，B = “b”。
    输出：2
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        for (int i =0; i <= a.length();i++) {
            StringBuffer a1 = new StringBuffer(a);
            a1.insert(i,b);  // a1 为插入b 后的新的StringBuffer对象
            if(isHuiWen(a1.toString())) {  // StringBuffer对象变成String对象，需要用toString 方法
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isHuiWen(String a) {
        int i = 0;
        int j = a.length()-1;
        while (i< j) {
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
