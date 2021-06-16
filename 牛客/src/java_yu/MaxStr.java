package java_yu;
/*
动态规划的难点在于定义数组和创建“状态转移方程”。

定义height来存储数据，f[i]为以height[i]结尾的元素的最长上升子序列元素个数，初始时将f所有内容全部初始化成1，因为子序列中至少包含一个元素。
定义"状态转移方程"一开始先将f中的数据全部置为1，因为最小的子序列长度为1然后对于每个height[i]，通过遍历height[0]-->height[i-1]之间的数据，如果在该区间中找到一个height[j]比height[j]小的元素，开始比较f[j]+1和f[i]的大小，如果f[j]+1>f[j]则更新f[i]，因此：
当height[i] > height[j]：f[i] = max(f[i], f[j]+1)
当height[i] <= height[j]：继续取下一个数据
 */

import java.util.*;

public class MaxStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] high= new int[n];
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                high[i] = scanner.nextInt();
                f[i] = 1;
            }
            int max = 1;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (high[i] > high[j]) {
                        f[i] = Math.max(f[i],f[j] + 1);
                    }
                    max = Math.max(max,f[i]);
                }
            }
            System.out.println(max);
        }
    }
}
