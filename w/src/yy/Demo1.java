package yy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.substring(1,str.length()-1).split(",");
        int len = arr.length;
        float[] a = new float[len];
        ArrayList<Float> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            a[i] = Float.parseFloat(arr[i]);
        }
        if (a[0]> a[1]) {
            res.add(a[0]);
        }
        for (int i = 1; i < len-1; i++) {
            if (a[i]<a[i-1] && a[i] > a[i+1]) {
                res.add(a[i]);
            }
        }
        if (a[len - 2] > a[len-1]) {
            res.add(a[len-1]);
        }
        Float[] ans = new Float[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
