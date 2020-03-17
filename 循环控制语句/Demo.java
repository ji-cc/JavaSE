public class Demo {
	public static void main(String[] args) {
		System.out.println("\\\\\"hello\\\\\"");
	}
}






/*import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		//二进制1的个数。
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		while(n != 0){
			if((n & 1) != 0){
				i++;
			}
			n = n>>>1;
		}
		System.out.println(i);
	}
}*/





/*import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		//最大公约数
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a%b;
		while(c != 0){
			a = b;
			b = c;
			c = a%b;
		}
		System.out.println(b);
	}
}*/







/*public class Demo {
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
	public static void main(String[] args) {
		int i = 1;
		int flg = 1;
		double sum = 0;
		for(int n =1; n <= 100; n++){
			sum += (double)1/n*flg;
			//sum += 1.0/n*flg;
			flg = -flg;
		}
		System.out.println(sum);
	}
}*/










/*public class Demo {
	//求出0～999之间的所有“水仙花数”并输出
	public static void main(String[] args) {	
		int n =0;
		for(n = 0;n < 1000;n++){
			int bai = n/100;
			int shi = (n/10)%10;
			int ge = n%10;
			if(n == (bai*bai*bai + shi*shi*shi + ge*ge*ge)){
				System.out.println("水仙花数: " + n);
			}
		}
	}
}*/








/*import java.util.Scanner;
import java.util.Random;
public class Demo {
	//用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
	public static void main(String[] args){	
		Random ran = new Random(1);
		int r = ran.nextInt(10000);
		while(true){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			if(n > r){
				System.out.println("大于");
			}
			if(n < r){
				System.out.println("小于");
			}
			if(n == r){
				break;
			}
		}
	}
}*/



/*
import java.util.Scanner;
public class Demo {
	//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
	public static void main(String[] args){	
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		if((y < 19) && (y >= 0) ){
			System.out.println("是少年");
		}else if((y < 29) && (y >= 19)){
			System.out.println("是青年");
		}else if((y < 56) && (y >= 29)){
			System.out.println("是中年");
		}else if((y < 120) && (y >= 56)){
			System.out.println("是老年");
		}else {
			System.out.println("输入错误");
		}
	}
}

*/




/*import java.util.Scanner;
public class Demo {
	//给定一个数字，判定一个数字是否是素数
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 2;
		if (n == 1){
			System.out.println("1不是素数");
		}
		for(i = 2;i < n;i++){
			if(n%i == 0){
				System.out.println("不是素数");
				break;
			}else {
				if(i == n-1){
					System.out.println("是素数");
				}
			}
		}
	}
}*/




/*public class Demo {
	//打印 1 - 100 之间所有的素数
	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		for(n = 2;n <= 100;n++){
			for(i = 2;i < n;i++){
				if(n%i == 0){
					break;
				}else {
					if(i == n-1){
						System.out.println("素数: " + n);
					}
				}
			}

		}
	}
}*/






/*public class Demo {
	//输出 1000 - 2000 之间所有的闰年
	public static void main(String[] args){
		int years;
		for(years = 1000;years <= 2000;years++){
			if((years%4 == 0) && (years%100 != 0) || (years%400 == 0))
				System.out.println("闰年: " + years );
		}
	}
}
*/




/*public class Demo {
	//编写程序数一下 1到 100 的所有整数中出现多少个数字9
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
		for(i = 1;i <= 100;i++){
			if(i/10 == 9){
				sum++;
			}
			if(i%10 == 9){
				sum++;
			}
		}
		System.out.println("sum = " + sum);
	}
}   */