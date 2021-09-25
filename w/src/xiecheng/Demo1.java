package xiecheng;

import java.util.Scanner;

public class Demo1 {
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inp = input.split(" ");
        int user = Integer.parseInt(inp[0]);
        String word = inp[1];
        String[] userName = new String[user];
        for (int i = 0; i < user; i++) {
            String s = scanner.nextLine();
            int len = s.length();
            if (len >= word.length()) {
                for (int j = 0; j < len-word.length()+1; j++) {
                    String res = s.substring(j,j+word.length());
                    if (word.equalsIgnoreCase(res)) {
                        count +=1;
                        break;
                    }

                }
            }
        }
        System.out.println(count);
    }

}
