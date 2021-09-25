package wangyi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int M = scanner.nextInt();
        String[] arr = str.split(" ");
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 1; j < newArr.length; j++) {
                int sum = newArr[i] + newArr[j];
                if (M >= sum) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

    }
}














