import java.util.Scanner;
public class Demo {
    public static int sum(int n,int m) {
        return n+m;
    }
     public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 
        //并执行代码，求出结果
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println(sum(n,m));  
        System.out.println(sum(a,b,c)); 
    }
}



/*


import java.util.Scanner;
public class Demo {
    public static int max(int n,int m) {
        return (n > m)?n:m;
    }
     public static double max(double a,double b) {
        return (a > b)?a:b;
    }
    public static double max(int n,double a,double b) {
        return max(n,(max(a,b)));
    }
    public static void main(String[] args) {
        //在同一个类中定义多个方法：
        //要求不仅可以求两个整数的最大值，
        //还可以求两个小数的最大值，
        //以及两个小数和一个整数的大小关系
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(max(n,m));  
        System.out.println(max(a,b)); 
        System.out.println(max(n,a,b)); 
    }
}

 */








/*
import java.util.Scanner;
public class Demo {
    public static int max2(int n,int m) {
        return (n > m)?n:m;
    }
    public static int max3(int a,int b,int c) {
        return (a > (max2(b,c)))?a:(max2(b,c));
    }
    public static void main(String[] args) {
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(max2(n,m));  
        System.out.println(max3(a,b,c)); 
    }
}


 */






/*

import java.util.Scanner;
public class Demo {
    public static int mul(int n) {
        if(n == 1){
            return 1;
        }
        return n*mul(n-1);
    }
    public static void main(String[] args) {
        //求 N 的阶乘
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(mul(n));  
    }
}


 */






/*

import java.util.Scanner;
public class Demo {
    public static int mul(int n) {
        if(n == 1){
            return 1;
        }
        return n*mul(n-1);
    }
    public static void main(String[] args) {
        //求1！+2！+3！+4！+........+n!的和
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i =1; i <= n; i++){
            sum += mul(i);
        }
        System.out.println(sum);  
    }
}


 */







/*

import java.util.Scanner;
public class Demo {
    public static int fun(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        return fun(n-1) + fun(n-2);
    }
    public static void main(String[] args) {
        //求斐波那契数列的第n项
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f = fun(n);
        System.out.println(f);  
    }
}

 */







/*

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        //输出n*n的乘法口诀表，n由用户输入。
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i <= n;i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();

        }  
    }
}

 */












/*

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        //输出一个整数的每一位
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==0){
            System.out.println(n);
        }
        while(n != 0){
            int num = n % 10;
            System.out.println(num);
            n /= 10;
        }
    }
}

 */






/*
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，
        //密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。
        //三次均错，则提示退出程序
        Scanner scan = new Scanner(System.in);
        int passWord = scan.nextInt();
        int i =3;
        while(i != 0) {
            int n = scan.nextInt();
            if(n == passWord) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误，请重新输入");
                i--;
            }


        }
    }
} 
 */










/*import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 31;i >= 1;i-=2) {
            System.out.print(((n >>> i) & 1) + " ");
        }
        System.out.println("\n********");
        for(int i = 30;i >= 0;i-=2) {
            System.out.print(((n >>> i) & 1) + " ");
        }

    }
}
*/




/*import java.util.Scanner;
public class TestDemo {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(mul(n));
    }
    public static int mul(int n) {
        if (n == 1) {
            return 1;
        }
        return n * mul(n-1);
    }
}*/






/*
import java.util.Scanner;
public class TestDemo {
    //递归求 1 + 2 + 3 + ... + 10
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}

 */







/*
import java.util.Scanner;
public class TestDemo {
    //1729 : 1   7   2  9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        num(n);
    }
    public static void num(int n) {
        if (n > 9) {
            num(n/10);
        }
        System.out.println(n%10);
    }
}

 */






/*

import java.util.Scanner;
public class TestDemo {
    //1729 = 1 + 7 + 2 + 9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + sum(n/10);
    }
}

 */







/*import java.util.Scanner;
public class TestDemo {
//斐波那契数列
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fab(n));
    }
    public static int fab(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab(n-1) + fab(n-2);
    }
}*/










/*

import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        //汉诺塔问题
        int n = 3;
        hanoi(n,'A','B','C');
        System.out.println();
    }

    public static void hanoi(int n, char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
            return;
        }
        hanoi(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoi(n-1,pos2,pos1,pos3);
    }
    public static void move(char pos1, char pos3) {
        System.out.println(pos1 + "-->" + pos3);
    }
}*/

/*
public class TestDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println(c);
        System.out.println("*******");
    }
}



 */