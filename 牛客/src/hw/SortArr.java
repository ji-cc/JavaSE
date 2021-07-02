package hw;

import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[1000];
            for (int i = 0; i < n; i++) {
                int j = scanner.nextInt();
                if (arr[j-1] == 0) {
                    arr[j-1] = 1;
                }
            }
            for (int i =0; i < 1000; i++) {
                if (arr[i] == 1) {
                    System.out.println(i+1);
                }
            }
        }
    }
}
