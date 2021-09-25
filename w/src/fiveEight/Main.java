package fiveEight;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        System.out.println(solution(arr));
    }



    private static int solution(int[] source) {
        if (source.length == 0) {
            return -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
            int key = source[i];
            if (!map.containsKey(key)) {
                map.put(key,1);
            } else {
                map.put(key,map.get(key)+1);
            }
        }

        for (int val: map.keySet()
             ) {
            if (map.get(val) == 1) {
                list.add(val);
            }
        }
        int max = -1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < source.length; j++) {
                if (list.get(i) == source[j]) {
                    max = Math.max(max,j);
                    break;
                }
            }
        }
        if (max == -1) {
            return -1;
        }
        return source[max];




    }


}
