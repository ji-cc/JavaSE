package java_yu;
// 斐波那契数列
// 用 long 类型
import java.util.Scanner;

public class NewPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arr = new long[80];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 80; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        while (scanner.hasNext()) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            long sum = 0;
            if (from == to) {
                sum = arr[from-1];
            }else {
                for (int i = from-1; i < to; i++) {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}
