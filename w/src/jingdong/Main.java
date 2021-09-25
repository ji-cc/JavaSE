package jingdong;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Position> arr = new ArrayList<>();
        while (n-- != 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Position position = new Position(x,y);
            arr.add(position);
        }
        int count = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                int absx = Math.abs(arr.get(i).x-arr.get(j).x);
                int absy = Math.abs(arr.get(i).y-arr.get(j).y);
                if ((arr.get(i).x != arr.get(j).x) && (arr.get(i).y != arr.get(j).y) && (absx == absy)) {
                    count += 1;
                }
            }

        }
        System.out.println(count);

    }
    static class Position {
        int x;
        int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
