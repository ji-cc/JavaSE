package qianxin;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{20,20,20};
        System.out.println(MALS(arr));
    }
    public static int MALS (int[] members) {
        Arrays.sort(members);
        int max= 1;
        int cur = 1;
        for (int i = 0; i < members.length-1; i++) {
            if (members[i]+1 == members[i+1]) {
                max += 1;
                cur = Math.max(max,cur);
            } else {
                cur = Math.max(max,cur);
                max = 1;

            }
        }
        return cur;
    }

}
