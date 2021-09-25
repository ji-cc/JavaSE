package meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> path = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<ArrayList<Integer>> list = help(arr);
        int len = list.size();
        System.out.println(len);
        int j = 0;
        while (j < len) {
            for (int i = 0; i < n-1; i++) {
                System.out.print(list.get(j).get(i) + " ");
            }
            System.out.println(list.get(j).get(n-1));
            j++;
        }
    }

    private static ArrayList<ArrayList<Integer>> help(int[] arr) {
        boolean[] used = new boolean[arr.length];
        Arrays.fill(used,false);
        Arrays.sort(arr);
        backTrack(arr,used);
        return res;
    }

    private static void backTrack(int[] arr, boolean[] used) {
        if (path.size() == arr.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i >0 &&  arr[i] == arr[i-1] && used[i-1] == false) {
                continue;
            }
            if (used[i] == false) {
                used[i] = true;
                path.add(arr[i]);
                backTrack(arr,used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }

    }
}
