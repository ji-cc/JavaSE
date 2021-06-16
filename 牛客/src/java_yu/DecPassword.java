package java_yu;

import java.util.Scanner;

public class DecPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int len = str.length();
            int i = 0;
            String newStr = "";
            while (i<len) {
                if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                    newStr += str.charAt(i);
                }
                i++;
            }
            System.out.println(newStr);
        }
    }
}
