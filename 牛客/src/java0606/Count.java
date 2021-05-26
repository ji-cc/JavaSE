package java0606;
/*
输入n个整数，输出出现次数大于等于数组长度一半的数。
输入
3 9 3 2 5 6 7 3 2 3 3 3
输出
3
 */

import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNextInt()) { // 判断输入是否为整型
            arr.add(scanner.nextInt());  // 接收输入，以enter作为结束符
        }
        Collections.sort(arr); // 排序后输出中间值即可
        System.out.println(arr.get(arr.size()/2-1));
    }
}
