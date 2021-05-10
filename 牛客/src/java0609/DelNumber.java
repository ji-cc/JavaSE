package java0609;
// 顺序存放[0  N-1]

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n >1000) {
                n = 1000;
            }
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(i);
            }
            int flag = 1;
            while (n != 1) {
                for (int i = 0; i < arr.size(); i++) {
                    if (flag % 3 == 0) {
                        flag += 1;
                        arr.remove(i);
                        n -= 1;  // 删除一次，原始数组长度-1；
                        i--;
                    }else {
                        flag += 1;
                    }
                }
            }
            // 此时arr只剩最后一个数字
            System.out.println(arr.get(0));
        }

        }
}

