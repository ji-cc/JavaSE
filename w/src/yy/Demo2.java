package yy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        int[] a = new int[]{3,1,2,5,6,4,8,9,7,10};
        sort(a);
    }
    public static void sort(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (n%2==0) even.add(n);
            else odd.add(n);
        }
        Collections.sort(even);
        Collections.sort(odd);
        ArrayList<Integer> res = new ArrayList<>();
        // even 升序
        for (int i = even.size()-1; i >=0 ; i--) {
            res.add(i);
        }
        for (Integer i : even) {
            res.add(i);

        }
        // odd 降序
        for (Integer i : odd) {
            res.add(i);
        }
        System.out.println(Arrays.toString(res.toArray()));
    }
}
