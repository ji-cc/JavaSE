package java0610;

import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        System.out.println(str1.toString());
    }
}
