package java0604;


import java.util.Scanner;

public class DelSameStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                    System.out.print(str1.charAt(i));
                }
            }
        }
    }
}
