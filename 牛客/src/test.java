//
//
//import java.util.Scanner;
//
//public class test {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        int count = 0;
//        for (int i = n-1; i > 0; i--) {
//            int j = i-1;
//            if (arr[i]> arr[j]) {
//                count++;
//                arr[j] = arr[i];
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum+" " + count);
//    }
//
//}


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char c = '1';
        char b = '2';
        System.out.println(('1'-'0')*10);
        System.out.println("\\");
    }
}

