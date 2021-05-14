package java_yu;

import java.util.*;

public class MP3 {
//    static List<Integer> menue;
//    static int flage = 1;  // 光标起始位置
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();  // 歌曲数量
            String str = scanner.next();   // 操作动作
            // 光标从第一首歌开始
            List<Integer> music = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                music.add(i+1);
            }
            List<Integer> menue = music.size()<=4 ? music.subList(0,music.size()):music.subList(0,4);
            int flage = 1;    // 光标指向第一首歌
            if (music.size()<=4) {
                for (int i = 0; i < str.length(); i++) {
                    if ('U' == str.charAt(i)) {
                        if (flage == 1) {
                            flage = n;
                        }else {
                            flage--;
                        }
                    }
                    if ('D' == str.charAt(i)) {
                        if (flage==n) {
                            flage=1;
                        }else {
                            flage++;
                        }
                    }
                }
            }else {
                // 1 2 3 4 5 6 7 8 9 10   10首歌
                for (int i = 0; i < str.length(); i++) {
                    if ('U' == str.charAt(i)) {  // 向上移动
                        if (flage == 1)  {  // 且光标在第一首歌时
                            // 翻到最后一页，flage == n;
                            flage = n;
                            menue = music.subList(n-4,n);

                        }else {
                            //不在特殊位置，且光标向上移动
                            // flage 与当前列表比较，若是不在menu的第一个元素上，就不翻页
                            if (flage != menue.get(0)) {
                                flage--;
                            } else {
                                flage--;
                                menue = music.subList(flage-1,flage+3);
                            }
                        }

                    }
                    if ('D' == str.charAt(i)) {  // 向下移动
                        if (flage == n)  {  // 且光标在最后一首歌时
                            // 翻到第一页，flage==1
                            flage=1;
                            menue = music.subList(0,4);
                        }else {
                            //不在特殊位置，且光标向下移动
                            // 判断当前歌曲是否在列表最后一行，在最后一行就翻页
                            if (flage != menue.get(menue.size()-1)) {
                                flage++;
                            }else {
                                flage++;
                                menue = music.subList(flage-4,flage);
                            }
                        }
                    }
                }
            }
            // 输出menu
//        System.out.println(menue.toString());   // [7, 8, 9, 10]   // 需要去掉中括号与逗号
            String m = menue.toString().replace("[","")
                    .replace("]","")
                    .replace(",","");
            System.out.println(m);
            // 输出flage
            System.out.println(flage);
        }
    }
}
