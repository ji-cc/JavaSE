package xiecheng;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    static int pre;
    static int cur;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int preScore = scanner.nextInt();
        int curScore = scanner.nextInt();
        Set<Integer> score = new TreeSet<>();
        for (int i = 0; i < people; i++) {
            score.add(scanner.nextInt());
        }
        int i = 0;
        for (int n:score
             ) {
            System.out.println(n);
            i++;
            if (n == preScore) {
                pre = i;
                n = curScore;
                break;
            }
        }
        int j = 0;
        for (int n:score
             ) {
            System.out.println(n);
            j++;
            if (n == curScore) {
                cur = j;
                break;
            }
        }

    }
}
