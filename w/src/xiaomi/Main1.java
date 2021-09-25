package xiaomi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = countDigitOne (n);
        System.out.println(res);

    }

    private static int countDigitOne(int n) {
        long mul = 1;
        int ans = 0;
        for (int k = 0; n >= mul ; k++) {
            ans += (n/(mul *10)) * mul + Math.min(Math.max(n % (mul * 10) - mul +1,0),mul);
            mul *= 10;
        }
        return ans;
    }
}
