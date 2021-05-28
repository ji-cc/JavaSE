package java0611;
import java.util.Scanner;

public class Robit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str1 = str.split(",");
        int x = Integer.valueOf(str1[0]);
        int y = Integer.valueOf(str1[1]);
        int step = countWays(x,y);
        System.out.println(step);
    }

    private static int countWays(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return countWays(x-1,y) + countWays(x,y-1);

    }
}
