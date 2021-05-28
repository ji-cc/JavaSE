package java_yu;
import java.util.Scanner;

public class CutCloth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int n = strs[0].length();
            int length = strs[1].length();
            int index = 0;
            int count = 0;
            while (index<n){
                index = strs[0].indexOf(strs[1],index);
                if (index == -1) {
                    System.out.println(count);
                    break;
                }else if (index == n-length) {
                    count +=1;
                    System.out.println(count);
                    break;
                }else {
                    count += 1;
                    index = index+length;
                }
            }
        }
    }
}
