package hw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoveMouse {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',-1);
        map.put('D',1);
        map.put('W',1);
        map.put('S',-1);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int x = 0;
            int y = 0;
            String[] newStr = str.split(";");
            for (int i = 0; i < newStr.length; i++) {
                if (newStr[i].length()==3) {
                    if ((newStr[i].charAt(1)>'9'|| newStr[i].charAt(1)<'0') || (newStr[i].charAt(2)>'9'||newStr[i].charAt(2)<'0')) {
                        continue;
                    }
                    if (newStr[i].charAt(0) == 'A' || newStr[i].charAt(0) == 'D') {
                        x += ((newStr[i].charAt(1)-'0')*10 + (newStr[i].charAt(2)-'0'))*map.get(newStr[i].charAt(0));
                    }
                    if (newStr[i].charAt(0) == 'W' || newStr[i].charAt(0) == 'S') {
                        y += ((newStr[i].charAt(1)-'0')*10 + (newStr[i].charAt(2)-'0'))*map.get(newStr[i].charAt(0));
                    }
                }

                if (newStr[i].length()==2) {
                    if ((newStr[i].charAt(1)>'9'|| newStr[i].charAt(1)<'0')) {
                        continue;
                    }
                    if (newStr[i].charAt(0) == 'A' || newStr[i].charAt(0) == 'D') {
                        x += (newStr[i].charAt(1)-'0')*map.get(newStr[i].charAt(0));
                    }
                    if (newStr[i].charAt(0) == 'W' || newStr[i].charAt(0) == 'S') {
                        y += (newStr[i].charAt(1)-'0')*map.get(newStr[i].charAt(0));
                    }
                }

            }
            System.out.println(x+","+y);
        }
    }
}
