package 荣耀;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    static String high = "bdfhkl";
    static String mid = "aceimnorstuvwxz";
    static String low = "gjpqy";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Character[] highStr = new Character[input.length()];
        Character[] midStr = new Character[input.length()];
        Character[] lowStr = new Character[input.length()];
        int m = 0;
        int n = 0;
        int k = 0;
        for (int i = 0; i < input.length(); i++) {
            if (high.contains(String.valueOf(input.charAt(i)))) {
                highStr[m++] = input.charAt(i);
            }
            if (mid.contains(String.valueOf(input.charAt(i)))) {
                midStr[n++] = input.charAt(i);
            }
            if (low.contains(String.valueOf(input.charAt(i)))) {
                lowStr[m++] = input.charAt(i);
            }
        }
        if (highStr.length != 0) {
            Arrays.sort(highStr);
            String hiS = "";

        }

        Arrays.sort(midStr);
        Arrays.sort(lowStr);
        System.out.println(Arrays.toString(highStr));
        System.out.println(Arrays.toString(midStr));
        System.out.println(Arrays.toString(lowStr));
    }
}
