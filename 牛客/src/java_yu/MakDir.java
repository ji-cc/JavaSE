package java_yu;

import java.util.Arrays;
import java.util.Scanner;

public class MakDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = scanner.next();
            }
            Arrays.sort(str);
            Find(str,0,n);
        }
    }

    private static void Find(String[] str, int i, int n) {
        boolean flage;
        while (i<n-1) {
            String st = str[i]+"/";
            flage = false;
            for (int j = i+1; j < n; j++) {
                if (str[j].contains(st)) {
                    flage = true;
                    break;
                }
            }
            if (!flage) {
                System.out.println("mkdir -p " + str[i]);

            }
            i++;
        }
        System.out.println("mkdir -p " + str[n-1]);
        System.out.println();
    }
}
