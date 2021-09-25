package xiaomi;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] newStr = str.split(" ");
        int len = newStr.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(newStr[i]);
        }
        int res = findKth(arr,len,2);
        System.out.println(res);

    }

    private static int findKth(int[] arr, int len, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int num:arr
             ) {
            que.offer(num);
            if (que.size() > k) {
                que.poll();
            }
        }
        return que.peek();
    }
}
