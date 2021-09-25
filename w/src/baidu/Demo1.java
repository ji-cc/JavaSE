package baidu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[(int)s.charAt(i)-'a']++;
        }
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                list.add(a[i]);
            }
            sum += a[i];
            max = Math.max(max,a[i]);

        }
        Collections.sort(list);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= max; i++) {
            res = Math.min(res,getResult(i,list));
        }
        System.out.println(res);
    }

    private static int getResult(int i, List<Integer> list) {
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            int min = Math.min(list.get(j),Math.abs(i-list.get(j)));
            sum += min;
        }
        return sum;
    }
}
