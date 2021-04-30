package java0604;


import java.util.Scanner;

public class BuyApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(buyApple(n));

    }

    private static int buyApple(int n) {
        if (n < 6 ) {
            return -1;
        }
        if (n == 6) {
            return 1;
        }
        if ((n%6)%2 == 0) {  // 6与8 相差2 ，所以除以6之后的余数是2的倍数，就可以使用8个一袋的苹果,此时证明肯定可以买到苹果
            if (n%8 == 0) {
                return n/8;
            }else {
                // //对于10以上的偶数，只要对8取余数不为0，
                // 就要从前面的1或者2个8中拿出2个，把余数补为6（本来余数就是6，就不用拿）。所以+1；
                return n/8+1;
            }
        }else {
            return -1;
        }
    }
}
