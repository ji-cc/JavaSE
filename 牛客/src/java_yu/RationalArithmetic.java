package java_yu;
import java.util.Scanner;
public class RationalArithmetic {
    static long a1;
    static long b1;
    static long a2;
    static long b2;
    static String x1;
    static String x2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // "5 3 0 6"
        String str1 = str.replaceAll("/"," ");
        String[] ch = str1.split(" "); // [5 3 0 6]
        a1 = Integer.valueOf(ch[0]);
        b1 = Integer.valueOf(ch[1]);
        a2 = Integer.valueOf(ch[2]);
        b2 = Integer.valueOf(ch[3]);
        x1 = Number(a1,b1);
        x2 = Number(a2,b2);
        Sum(a1,b1,a2,b2);
        Dif(a1,b1,a2,b2);
        Mul(a1,b1,a2,b2);
        Quo(a1,b1,a2,b2);
    }
    // 除法
    private static void Quo(long a1, long b1, long a2, long b2) {
        long tmp = a2;
        a2 = b2;
        b2 = tmp;
        if ("0".equals(x1) ){
            sout(x1,"/",x2,"0");
        } else if ("0".equals(x2)) {
            sout(x1,"/",x2,"Inf");
        } else if ("1".equals(x1)) {
            sout(x1,"/",x2,Number(a2,b2));
        }else if ("1".equals(x2)) {
            sout(x1,"/",x2,x1);
        }else {
            long a = a1*a2;
            long b = b1*b2;
            String qu = Number(a,b);
            sout(x1,"/",x2,qu);
        }

    }
    // Equation 等式输出格式
    private static void sout(String x, String sign,String y, String z) {
        System.out.println(x + " " + sign + " " + y + " " + "=" + " " + z);
    }
    // 化简
    private static String Simple(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        long z = x<y?x:y;
        while (z>1){
            if (x%z == 0 && y%z == 0) {
                x = x/z;
                y = y/z;
            }
            z--;
        }
        return x + "/" + y;
    }
    // RationalNumber 数字变形形式
    private static String Number(long x, long y) {
        if(x == 0) {
            return "0";
        } else if((x>0 && y >0) || (x<0 && y <0)){
            if (x%y == 0) {
                return Math.abs(x/y) + "";
            }else if(x == y){
                return 1 + "";
            }else if (Math.abs(x) >Math.abs(y)) {
                return Math.abs(x/y) + " " + Simple(x%y,y);
            }else if (Math.abs(x) < Math.abs(y)) {
                return Simple(x%y,y);
            }
        }else if (x <0 && y>0){
            if (x%y == 0) {
                return "(" + "-" + Math.abs(x/y) + ")";
            }else if(Math.abs(x) == y){
                return -1 + "";
            }else if (Math.abs(x) > y) {
                return "(" + x/y + " " + Simple(x%y,y) + ")";
            }else if (Math.abs(x) < y) {
                return "(" + "-"+Simple(x%y,y)+ ")";
            }
        }else if (x >0 && y<0) {
            if (x%y == 0) {
                return "(" + "-" + Math.abs(x/y) + ")";
            }else if(x == Math.abs(y)){
                return -1 + "";
            }else if (x > Math.abs(y)) {
                return "(" + "-" + Math.abs(x/y) + " " + Simple(x%y,y) + ")";
            }else if (x < Math.abs(y)) {
                return "(" + "-" + Simple(x%y,y)+ ")";
            }
        }
        return null;
    }
    // 加法运算
    private static void Sum(long a1, long b1, long a2, long b2) {
        if ("0".equals(x1)) {
            sout(x1,"+",x2, x2);
        }else if ("0".equals(x2)) {
            sout(x1,"+",x2, x1);
        }else {
            long a = a1 * b2 + b1*a2;
            long b = b1*b2;
            String sum = Number(a,b);
            sout(x1,"+",x2,sum);
        }
    }
    // 减法运算
    private static void Dif(long a1, long b1, long a2, long b2) {
        a2 = -a2;
        if ("0".equals(x1)) {
            sout(x1,"-",x2, Number(a2,b2));
        }else if ("0".equals(x2)) {
            sout(x1,"-",x2, x1);
        }else {
            long a = a1 * b2 + b1*a2;
            long b = b1*b2;
            String sum = Number(a,b);
            sout(x1,"-",x2,sum);
        }
    }
    // 乘法运算
    private static void Mul(long a1, long b1, long a2, long b2) {
        if ("0".equals(x1) || "0".equals(x2)){
            sout(x1,"*",x2,"0");
        } else if ("1".equals(x1)) {
            sout(x1,"*",x2,x2);
        }else if ("1".equals(x2)) {
            sout(x1,"*",x2,x1);
        }else {
            long a = a1*a2;
            long b = b1*b2;
            String mul = Number(a,b);
            sout(x1,"*",x2,mul);
        }
    }
}
