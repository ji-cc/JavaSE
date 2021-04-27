package java0602;
/*
给定一个int数组A和它的大小n，对于这组数能组成的任意两个数组，
若前面一个大于后面一个数字，则这两个数字组成一个逆序对。
请设计一种高效的算法返回A中存在的逆序对个数。要求n不大于5000。
测试样例：
[1,2,3,4,5,6,7,0],8
返回：7
1 0     2 0     3 0     4 0    5 0     6 0     7 0
 */

public class AntiOrder {
    public static int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,0};
        int n = A.length;
        System.out.println(count(A,n));
    }
}
