package java_yu;

import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] list= new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = scanner.nextInt();
            }
            for (int num :list
                    ) {
                long input = fib(num);  //每个数字对应的输出
                if (input >= 10000) {
//                    System.out.print(input%10000);  // 单纯的取余也不行，没有考虑到余数不足四位
                    int ge = (int)input%10;
                    int shi = (int)input%100/10;
                    int bai = (int)input%1000/100;
                    int qian = (int)input%10000/1000;
                    System.out.print(qian);
                    System.out.print(bai);
                    System.out.print(shi);
                    System.out.print(ge);
                }else if (input < 1000) {
                    int zeros = 4 - String.valueOf(input).length();  // 需要补0 的个数
                    while (zeros > 0) {
                        System.out.print("0");
                        zeros--;
                    }
                    System.out.print(input);
                }else {
                    System.out.print(input);
                }
            }
        }
    }
    private static long fib(int num) {
        long f1 = 1;
        long f2 = 2;
        if (num == 1) {
            return f1;
        }
        if (num == 2) {
            return f2;
        }
        long f3 = f1+f2;
        if (num >2 ){
            for (int i = 3;i <num;i++) {
                f3 = f1+f2;
                f1 = f2;
                f2 = f3;
            }
        }
        return f3;
    }
}
