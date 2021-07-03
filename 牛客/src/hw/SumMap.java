package hw;
/*
数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SumMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Map<Integer,Integer> table = new TreeMap<>();
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                if (table.containsKey(key)) {
                    table.put(key,table.get(key)+value);
                }else {
                    table.put(key,value);
                }
            }
            for (Integer i:table.keySet()
                    ) {
                System.out.println(i + " " + table.get(i));
            }
        }
    }
}
