package xiaohongshu;

public class Solution {
    public static int minSailCost (int[][] input) {
        // write code here
        int m = input.length;
        int n = input[0].length;
        int[][] dp = new int[m][n];
        int[][] money = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (input[i][j] == 0) {
                    input[i][j] = 2;
                }
                if (input[i][j] == 2) {
                    input[i][j] = 1000;
                }
                count += input[i][j];
                money[i][j] = input[i][j];
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + money[0][i];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + money[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + money[i][j];
            }
        }
        if (dp[m-1][n-1] > count) {
            return -1;
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        int[][] arr = new int[][]{{1,1,1,1,0},{0,1,0,1,0},{1,1,2,1,1},{0,2,0,0,1}};
        System.out.println(minSailCost(arr));
    }
}
