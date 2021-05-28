package java0612;

import java.util.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        int j =0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] == arr[j]){
                count += 1;
            }else {
                System.out.println(arr[i] + ":" + count);
                count = 0;
                i = j;
                continue;
            }
            if (j == arr.length-1) {
                System.out.println(arr[i] + ":" + count);
            }
            j++;
        }
    }
}
