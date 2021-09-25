package zte;


import java.util.ArrayList;

public class Main {
    public static int work (int[] a) {
        if (a == null) {
            return 0;
        }
        int path = 0;
        if ((a[0]<= 0) && (a[a.length-1] <= 0)) {
            path = Math.abs(a[0]) * 2;
        } else if ((a[0]>= 0) && (a[a.length-1] >= 0)) {
            path = Math.abs(a[a.length-1]) * 2;
        } else {
            path = (a[a.length-1]-a[0]) * 2;
        }

        return path;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,2};
        System.out.println(work(arr));
    }
}
