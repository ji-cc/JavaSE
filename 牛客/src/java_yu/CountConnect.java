package java_yu;


import java.util.Scanner;

public class CountConnect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] id =  new String[n];
            String[] re = new String[n];
            for (int i = 0; i < n; i++) {
                id[i] = scanner.next();
                re[i] = scanner.next();
            }
            int cur = 0;
            int max = 0;
            for (String str:re
                    ) {
                if ("connect".equals(str) && cur == 0) {
                    cur += 1;
                    max += 1;
                    cur -=1;
                }
                if ("disconnect".equals(str)) {
                    cur += 1;
                }
                if ("connect".equals(str) && cur != 0) {
                    cur -= 1;
                }
            }
            System.out.println(max);
        }
    }
}
