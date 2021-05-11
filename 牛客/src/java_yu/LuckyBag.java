package java_yu;
/*
一个袋子里面有n个球，每个球上面都有一个号码(拥有相同号码的球是无区别的)。
如果一个袋子是幸运的当且仅当所有球的号码的和大于所有球的号码的积。
例如：如果袋子里面的球的号码是{1, 1, 2, 3}，这个袋子就是幸运的，
因为1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
你可以适当从袋子里移除一些球(可以移除0个,但是别移除完)，要使移除后的袋子是幸运的。
现在让你编程计算一下你可以获得的多少种不同的幸运的袋子。
 */


import java.util.Scanner;

public class LuckyBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] bag = new int[n];
        for (int i = 0; i < n; i++) {
            bag[i] = scanner.nextInt();
        }
        int count = 0;
        if(isLucky(bag)) {
            count++;
        }
    }
    private static boolean isLucky(int[] bag) {
        int sum = 0;
        int product= 1;
        for (int i = 0; i < bag.length; i++) {
            sum += bag[i];
            product *= bag[i];
        }
        if (sum > product) {
            return true;
        }
        return false;
    }
}
