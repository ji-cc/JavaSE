package hw;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExchangeNum {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int n = 0;
            for (char ch: str.substring(2).toCharArray()
                    ) {
                n = n * 16 + map.get(ch);
            }
            System.out.println(n);
        }
    }
}
