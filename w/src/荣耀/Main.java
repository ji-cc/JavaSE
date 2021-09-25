package 荣耀;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        Deque<Integer> que1 = help1(str1);
        Deque<Integer> que2 = help1(str2);
        int[] res = new int[que1.size()+que2.size()];
        int i = 0;
        while (i < res.length) {
            int n = len;
            while (i<res.length && n-- != 0 && !que1.isEmpty()) {
                res[i] = que1.poll();
                i++;
            }
            int j = len;
            while (i<res.length && j-- != 0 && !que2.isEmpty()) {
                res[i] = que2.poll();
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    private static Deque<Integer> help1(String str1) {
        String[] str = str1.split(",");
        Deque<Integer> que = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            que.add(Integer.parseInt(str[i]));
        }
        return que;
    }
}
