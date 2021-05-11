package java_yu;

import java.util.Scanner;

public class CountRabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int month = scanner.nextInt();
            int sum = countRabbit(month);
            System.out.println(sum);
        }
    }

    private static int countRabbit(int month) {
        int sum = 0;
        if (month <= 2){
            sum = 1;
        }else {
            int first = 1;  // 一个月大的兔子
            int second = 0;  // 两个月大的
            int third = 1;  // 三个月大的，且具有生育能力，可以在当月生出一个月大的兔子
            // 从第三个月算
            for (int i = 3; i < month; i++) {
                //第二个月的变成了有生育能力的兔子
                third += second;
                //一个月大的兔子变成了两个月大的兔子
                second = first;
                //当月新生的兔子个数，一个月大且
                first = third;
            }
            sum = third + second + first;
        }
        return sum;
    }
}
