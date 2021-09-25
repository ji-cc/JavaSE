package duxiaoman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String word = scanner.nextLine();
        Map<Character,Integer> nameMap = new HashMap<>();
        Map<Character,Integer> wordMap = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char s = name.charAt(i);
            if (nameMap.containsKey(s)) {
                nameMap.put(s,nameMap.get(s)+1);
            } else {
                nameMap.put(s,1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char s = word.charAt(i);
            if (wordMap.containsKey(s)) {
                wordMap.put(s,wordMap.get(s)+1);
            } else {
                wordMap.put(s,1);
            }
        }
        int count = 100;
        for (char c: nameMap.keySet()
             ) {
            if (wordMap.containsKey(c)) {
                count = Math.min(count,wordMap.get(c)/nameMap.get(c));
            } else {
                count = 0;
            }
        }
        for (char c: wordMap.keySet()
             ) {
            if (nameMap.containsKey(c)) {
                int val = wordMap.get(c)-nameMap.get(c)*count;
                wordMap.put(c,val);
            }
        }
        int kind = 0;
        for (char c: wordMap.keySet()
             ) {
            if (wordMap.get(c) != 0) {
                kind += 1;
            }
        }
        System.out.println(count + " " + kind);
    }
}
