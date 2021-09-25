package baidu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] =new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            set.add(a[i]);
        }
        int sum = 0;
        if (n == 1) {
            System.out.println(0);
        }else {
            Arrays.sort(a);
            int max = 2*a.length-1;
            for (int i = 0; i < max; i++) {
                sum +=get(i,set);
            }
        }
        System.out.println(sum);
    }

    private static int get(int i, Set<Integer> set) {
        int res = 0;
        for (int j = 1; j <= i/2; j++) {
            if (j>= i/j) {
                break;
            }
            if (i%j == 0) {
                if (set.contains(i) && set.contains(i/j)) {
                    res++;
                }
            }

        }
        return res;
    }
}
