package zhaoyin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(68);
        ArrayList<ArrayList<Integer>> res = get_list(list);
        System.out.println(Arrays.toString(res.toArray()));
    }

    private static ArrayList<ArrayList<Integer>> get_list(ArrayList<Integer> L) {
        ArrayList<ArrayList<Integer>> LL = new ArrayList<>();
        int size = 1;
        int len = 0;
        while (len != L.size()) {
            int i =0;
            ArrayList<Integer> res = new ArrayList<>();
            while ((i++ != size) && (len != L.size())) {
                res.add(L.get(len));
                len++;
            }
            if (res.size() == size) {
                LL.add(res);
                size++;
            }
        }
        return LL;
    }
}
