//package xiecheng;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int count = 0;
//        String str = scanner.next();
//        String res = "";
//        for (int i = 0; i < n; i++) {
//            StringBuffer delStr = new StringBuffer(str);
//            delStr.deleteCharAt(i);
//            if (isValid(delStr)) {
//                res += i+1+" ";
//                count += 1;
//            }
//        }
//        System.out.println(count);
//        System.out.println(res.substring(0,res.length()-1));
//    }
//    private static boolean isValid(StringBuffer s) {
//        String str = s.toString();
//        if (str.isEmpty()) {
//            return true;
//        }
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == '(') {
//                stack.push(c);
//                continue;
//            }
//            if (stack.empty()) {
//                return false;
//            }
//            Character top = stack.pop();
//            if (top == '(' && c == ')') {
//                continue;
//            }
//            return false;
//        }
//        if (stack.empty()) {
//            return true;
//        }
//        return false;
//    }
//}
package xiecheng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (n == 0.0) {
            System.out.println("0/1");
        } else if(n == 1.0) {
            System.out.println("1/1");
        }else {
            String str = helper(n);
            System.out.println(str);
        }

    }

    private static String helper(double n) {
        for (double y = 1; y <= 30;y++) {
            for (double x = 0;x <=y;x++) {
                double num = (x/y)*100;
                String result = String.format("%.2f", num);
                double num1 = Double.valueOf(result);
                if (num1 == n) {
                    return String.format("%d/%d", (int)x,(int)y);
                }
            }
        }
        return null;
    }
}
