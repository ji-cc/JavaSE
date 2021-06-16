package java_yu;
/*NowCoder最喜欢游乐场的迷宫游戏，他和小伙伴们比赛谁先走出迷宫。
现在把迷宫的地图给你，你能帮他算出最快走出迷宫需要多少步吗？
https://www.nowcoder.com/questionTerminal/6276dbbda7094978b0e9ebb183ba37b9
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {
    static class Point {
        int x;
        int y;
        int step;
        public Point(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }
    static int[][] next = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        int n =10;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLine();
            }
            char[][] maze = new char[n][n];
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = arr[i].charAt(j);
                }
            }
            System.out.println(bfs(maze, 0, 1));
        }
    }

    private static int bfs(char[][] maze, int x, int y) {
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x,y,0));
        int[][] visit = new int[10][10];
        while (!que.isEmpty()) {
            Point cur = que.poll();
            if (cur.x == 9 && cur.y == 8) {
                return cur.step;
            }
            // 搜索4个方向
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + next[i][0];
                int ny = cur.y + next[i][1];
                if (nx < 0 || nx >= 10 || ny<0 || ny >=10) {
                    continue;
                }
                // 没有障碍且没有访问过
                if (maze[nx][ny] == '.' && visit[nx][ny]== 0) {
                    que.add(new Point(nx,ny,cur.step+1));
                    visit[nx][ny] = 1;
                }
            }
        }
        return 0;
    }
}
