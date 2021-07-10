package hw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            int numLine = scanner.nextInt();
            String[] pass = str.split("\\\\");
            String lastpass = pass[pass.length-1];
            String key = lastpass + " " + numLine;
            if (lastpass.length() > 16) {
                key = lastpass.substring(lastpass.length()-16) + " " + numLine;
            }
            if (map.containsKey(key)) {
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        int j = 0;
        for (String s: map.keySet()
                ) {
            if (map.keySet().size() > 8) {
                j++;
                if (j>map.keySet().size() - 8) {
                    System.out.println(s + " " + map.get(s));
                }
            }else {
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
