package shunfeng;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[5];
        for (int i = 0; i < 5; i++) {
            score[i] = scanner.nextInt();
        }
        int people = scanner.nextInt();
        int[][] hurt = new int[people][5];
        for (int i = 0; i < people; i++) {
            for (int j = 0; j < 5; j++) {
                hurt[i][j] = scanner.nextInt();
            }
        }
        int[] res = new int[people];
        int max = 0;
        for (int i = 0; i < people; i++) {
            for (int j = 0; j < 5; j++) {
                res[i] += score[j] * hurt[i][j];
            }
            if (res[i] > max) {
                max = res[i];
            }
        }
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(max);
        for (int i = 0; i < res.length; i++) {
            if (res[i] == max) {
                count += 1;
                ans.add(i+1);
            }
        }
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
