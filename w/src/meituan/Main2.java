package meituan;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            if (key == 2) {
                int val = scanner.nextInt();
                System.out.println(pos(sb,val));
            }
            if(key == 1) {
                char val = scanner.nextLine().charAt(1);
                sb.append(val);
            }
        }
        
    }
    private static int pos(StringBuffer str, int index) {
        int c = str.charAt(index-1);
        int res = str.length()+1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c && i != index-1) {
                res = Math.min(Math.abs(i+1-index),res);
            }
        }
        if (res == str.length()+1) {
            return -1;
        }
        return res;
    }
}
