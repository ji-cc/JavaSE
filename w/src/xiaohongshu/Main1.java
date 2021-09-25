//package xiaohongshu;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Main1 {
//    public static int count;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] strArr = new String[n];
//        for (int i = 0; i < n; i++) {
//            strArr[i] = scanner.next();
//        }
//        char[][] arr = new char[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = strArr[i].charAt(j);
//            }
//        }
//        help(arr,0,0,n-1,n-1);
//
//    }
//    static int[][] nextP = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
//    private static void help(char[][] arr,int sx,int sy,int ex,int ey) {
//        boolean[][] map = new boolean[arr.length][arr.length];
//        Queue<Character> q = new LinkedList<>();
//        q.add( arr[0][0]);
//        map[0][0] = true;
//        while (!q.isEmpty()) {
//            char curP = q.peek();
//            q.poll();
//            if
//        }
//
//    }
//
//}
