package zijie;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] treed = new String[n];
        for (int i = 0; i < n; i++) {
            treed[i] = sc.next();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ("Y".equals(treed[i])) {
                treed[i] = "B";
                if (isVaild(treed)) {
                    count += 1;
                } else {
                    treed[i] = "Y";
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isVaild(String[] treed) {
        for (int i = 0; i < treed.length; i++) {
            if (i == 0) {
                if ("B".equals(treed[i]) &&  "B".equals(treed[i+1])) {
                    return false;
                }
            } else if (i == treed.length-1) {
                if ( "B".equals(treed[i]) && "B".equals(treed[i-1])) {
                    return false;
                }
            } else {
                if (("B".equals(treed[i]) &&  "B".equals(treed[i+1])) || ("B".equals(treed[i]) && "B".equals(treed[i-1]))) {
                    return false;
                }
            }

        }
        return true;
    }

}
