package baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c,val+1);
            } else {
                map.put(c,1);
            }
        }

        int avg = str.length()/map.size();
        int count = 0;
        for (char c: map.keySet()
             ) {
            count += (Math.abs(map.get(c)-avg));
        }
        System.out.println(count);
    }
}
